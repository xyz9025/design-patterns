package design.abstractfactory;

/**
 * 产品族工厂
 * @author yangran
 * @create 2019/1/16
 */
public class ChineseFamilyFactory implements IFamilyFactory {
    public IFather createFather(String name) {
        return new ChineseFather(name);
    }

    public IMother createMother(String name) {
        return new ChineseMother(name);
    }
}
