import java.util.ArrayList;

/**
 * @author Lauy
 * @date 2021/3/31
 */
public class WeatherData implements  Subject{

    // 记录观察者，在构造器中建立
    private ArrayList observers;
    // 检测的数据值：温度、湿度、压力
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(ArrayList observers) {
        this.observers = observers;
    }

    public WeatherData() {
        this.observers = new ArrayList();
    }

    /*注册观察者*/
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /*移出观察者*/
    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
       if (index >= 0) {
           observers.remove(index);
       }
    }

    /*把状态数据更新给每一个观察者*/
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }

    /*当从气象站得到更新观测值时，我们通知观察者*/
    public void measurementsChanged() {
        this.notifyObserver();
    }

    /*我们想要每本书都随书赠送一个小型气象站，但是出版社不肯。所以和从装置中读取实际的气象数据相比，我们宁愿利用此方法来测试通知布告板数据*/
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }
}
