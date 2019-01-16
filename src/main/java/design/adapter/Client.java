package design.adapter;

/**
 * 使用场景：系统需要使用现有的类，而这些类的接口不符合系统的需要
 * @author yangran
 * @create 2019/1/9
 */
public class Client {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Robot dogRobot = new DogAdapter(dog);

        dogRobot.cry();
        dogRobot.move();
    }
}
