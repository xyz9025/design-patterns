package design.decorator;

/**
 * 具体装饰类，起到给Component添加职责的功能
 * @author yangran
 * @create 2019/3/3
 */
public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Milk";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.30;
    }
}
