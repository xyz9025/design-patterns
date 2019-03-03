package design.decorator;

/**
 * 咖啡2
 * @author yangran
 * @create 2019/3/3
 */
public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
