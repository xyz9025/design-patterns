package design.decorator;

/**
 * 抽象装饰器-是装饰抽象类，继承了Component,从外类来扩展Component类的功能
 * @author yangran
 * @create 2019/3/3
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
