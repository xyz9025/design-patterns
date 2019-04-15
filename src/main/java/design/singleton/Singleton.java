package design.singleton;

/**
 * 饿汉模式
 * @author yangran
 * @create 2019/1/9
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){}

    public Singleton getInstance(){
        return singleton;
    }
}
