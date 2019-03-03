package design.decorator;

/**
 * 抽象构件。是定义一个对象接口，可以给这些对象动态地添加职责
 * 抽象组件-饮料
 * @author yangran
 * @create 2019/3/3
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    //成本
    public abstract double cost();
}
