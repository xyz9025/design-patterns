package design.factorymethod;

/**
 * 将创建对象的任务委托给多个工厂子类中的某一个，客户端在使用时可以无须关心是哪一个工厂子类创建产品子类，需要时再动态指定
 * @author yangran
 * @create 2019/1/14
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("---------Ethan 需要的纽约风味的披萨---------");
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    }
}
