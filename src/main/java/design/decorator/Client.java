package design.decorator;

/**
 * 装饰器模式
 * 在不影响其他对象的情况下，以动态、透明的方式给单个对象添加职责
 * 需要动态地给一个对象增加功能，这些功能也可以动态地被撤销。 当不能采用继承的方式对系统进行扩充或者采用继承不利于系统扩展和维护时
 * @author yangran
 * @create 2019/3/3
 */
public class Client {

    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage milk = new Milk(beverage);
        System.out.println(milk.getDescription() + " $" + milk.cost());

        Beverage mocha = new Mocha(milk);
        System.out.println(mocha.getDescription() + " $" + mocha.cost());
    }

}
