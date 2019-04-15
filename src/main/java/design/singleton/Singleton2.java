package design.singleton;

/**
 * 饱汉模式——易出错
 * @author yangran
 * @create 2019/4/15
 */
public class Singleton2 {

    private static volatile Singleton2 singleton2 = null;

    private Singleton2(){}

    //双重锁检查
    public static Singleton2 getInstance(){
        if(singleton2 == null){
            synchronized (Singleton2.class){
                if(singleton2 == null){
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
