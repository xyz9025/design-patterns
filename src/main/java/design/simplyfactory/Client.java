package design.simplyfactory;

/**
 * @author yangran
 * @create 2019/1/10
 */
public class Client {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        store.orderPizza("cheese");
        store.orderPizza("clam");
    }

}
