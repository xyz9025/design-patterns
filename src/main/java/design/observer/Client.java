package design.observer;

/**
 * 观察者模式定义了对象之间的一对多关系。多个观察者监听同一个被观察者，当该被观察者的状态发生改变时，会通知所有的观察者
 * @author yangran
 * @create 2019/2/10
 */
public class Client {

    public static void main(String[] args) {
        WeatherSubject subject =new WeatherSubject();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(subject);

        subject.setMeasurements(80, 65, 30.4f);
        subject.setMeasurements(60, 75, 30.4f);
        subject.setMeasurements(50, 55, 30.4f);
    }

}
