package design.adapter;

/**
 * @author yangran
 * @create 2019/1/9
 */
public class DogAdapter implements  Robot {

    private Dog dog;

    public DogAdapter(Dog dog){
        this.dog = dog;
    }

    public void cry() {
        System.out.println("机器人模拟狗叫...");
        dog.wang();
    }

    public void move() {
        System.out.println("机器人模拟狗跑...");
        dog.run();
    }
}
