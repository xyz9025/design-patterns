package design.observer;

/**
 * 观察者接口
 * @author yangran
 * @create 2019/2/10
 */
public interface Observer {

    void update(float temp,float humidity,float pressure);
    
}
