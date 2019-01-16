package design.abstractfactory;

/**
 * 抽象工厂
 * 同一个工厂生产的产品是一个产品族
 * @author yangran
 * @create 2019/1/16
 */
public interface IFamilyFactory {
    IFather createFather(String name);

    IMother createMother(String name);
}
