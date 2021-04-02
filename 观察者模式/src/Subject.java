
/**
 * @author Lauy
 * @date 2021/3/31
 */
public interface Subject {
    /**
     * 需要观察者作为变量来 注册观察者到主题中
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 需要观察者作为变量来 移出主题中的观察者到
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 当主题状态改变，调用通用观察者
     */
    public void notifyObserver();
}
