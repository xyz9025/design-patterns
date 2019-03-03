package design.facade;

/**
 * 外观角色
 * @author yangran
 * @create 2019/3/3
 */
public class WatchTvSwtichFacade {
    private Light light;
    private AirCondition airCondition;
    private Television television;

    public WatchTvSwtichFacade(Light light, AirCondition ac, Television tv){
        this.light = light;
        this.airCondition = ac;
        this.television = tv;
    }

    public void on(){
        light.on();             //打开灯
        airCondition.on();      //打开空调
        television.on();        //打开电视
    }

    public void  off(){
        television.off();       //关闭电视
        airCondition.off();     //关闭空调
        light.off();            //关闭灯
    }

}
