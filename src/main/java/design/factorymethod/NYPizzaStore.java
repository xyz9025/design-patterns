package design.factorymethod;

/**
 * @author yangran
 * @create 2019/1/14
 */
public class NYPizzaStore extends PizzaStore {

     Pizza createPizza(String item) {
        Pizza pizza = null;
        if ("cheese".equals(item)) {
            pizza = new NYStyleCheesePizza();
        }

        return pizza;
    }

}
