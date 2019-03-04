package design.visitor;

/**
 * 抽象访问者——为该对象结构中的ConcreteElement的每一个类声明的一个操作
 * @author yangran
 * @create 2019/3/4
 */
public abstract class Visitor {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 取药
     * @param a
     */
    public abstract void visitor(MedicineA a);

    public abstract void visitor(MedicineB b);
}
