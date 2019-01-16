package design.simplyfactory;

/**
 * 披萨工厂
 * @author yangran
 * @create 2019/1/10
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }
        if(type.equals("clam")){
            pizza = new ClamPizza();
        }
        return pizza;
    }

}
