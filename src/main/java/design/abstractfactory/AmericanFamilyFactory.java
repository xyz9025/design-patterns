package design.abstractfactory;

/**
 * @author yangran
 * @create 2019/1/16
 */
public class AmericanFamilyFactory implements IFamilyFactory {
    public IFather createFather(String name) {
        return new AmericanFather(name);
    }

    public IMother createMother(String name) {
        return new AmericanMother(name);
    }
}
