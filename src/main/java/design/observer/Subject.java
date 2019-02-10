package design.observer;

/**
 * 主题接口
 * @author yangran
 * @create 2019/2/10
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeOberver(Observer observer);

    /**
     * 主题状态发生变化时，通知观察者
     */
    void notifyObserver();
}
