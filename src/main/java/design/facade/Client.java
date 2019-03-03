package design.facade;

/**
 * 使用场景
 * 当要为一个复杂子系统提供一个简单接口时可以使用外观模式
 * 客户程序与多个子系统之间存在很大的依赖性。引入外观类将子系统与客户以及其他子系统解耦，可以提高子系统的独立性和
 * @author yangran
 * @create 2019/3/3
 */
public class Client {

    public static void main(String[] args) {
        //实例化组件
        Light light = new Light();
        AirCondition ac = new AirCondition();
        Television tv = new Television();

        WatchTvSwtichFacade watchTv = new WatchTvSwtichFacade(light,ac,tv);

        watchTv.on();
        System.out.println("--------------阔以看电视了.....");
        watchTv.off();
        System.out.println("--------------阔以睡觉了.....");
    }

}
