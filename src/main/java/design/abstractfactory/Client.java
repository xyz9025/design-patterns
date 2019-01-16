package design.abstractfactory;

/**
 * 优点：
 * 抽象工厂隔离了具体类的生成，只需要改变具体工厂的实例，就可以在某种程度上改变整个软件系统的行为
 * 当一个产品族中的多个对象被设计成一起工作时，它能够保证客户端始终只使用同一个产品族中的对象
 *
 * 缺点：
 * 添加新的产品族对象时，需要修改接口和所有子类
 *
 * @author yangran
 * @create 2019/1/16
 */
public class Client {

    public static void main(String[] args) {
        IFamilyFactory f1 = new ChineseFamilyFactory();
        IFather father = f1.createFather("yang");
        IMother mother = f1.createMother("zhong");

        father.printName();
        mother.printName();

    }
}
