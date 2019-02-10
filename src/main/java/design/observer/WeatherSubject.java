package design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现主题接口
 * @author yangran
 * @create 2019/2/10
 */
public class WeatherSubject implements Subject {
    private List<Observer> observers;
    private float tempterature;
    private float pressure;
    private float humidity;

    public WeatherSubject(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeOberver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i > 0){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for(int i = 0; i < observers.size();i++){
            Observer observer = observers.get(i);
            observer.update(tempterature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.tempterature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        //数据更新，通知观察者
        notifyObserver();
    }
}
