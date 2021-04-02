/**
 * @author Lauy
 * @date 2021/3/31
 */
public interface Observer {
    /**
     * 当气象观测值改变时，主题会把这些状态值当作方法的参数，传送给观察者
     *  @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp, float humidity, float pressure);
}
