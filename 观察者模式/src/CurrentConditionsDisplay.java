
/**
 * @author Lauy
 * @date 2021/3/31
 * 此布告板实现了Observer接口，所以可以从WeatherData对象中获得改变
 * 也实现了DisplayElement布告板接口
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData; // 主题

    /*注册方法，保留对Subject主题的引用，防止以后需要移除自身*/
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        // 注册自己成观察者
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + this.temperature + "F degrees and " +
                this.humidity + "% humidity");
    }

    /*被调用时，我们把温度和适度保存起来，然后调用display方法展示*/
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
