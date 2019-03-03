package design.decorator;

/**
 * 咖啡1
 * @author yangran
 * @create 2019/3/3
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
