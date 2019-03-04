package design.visitor;

/**
 * 具体元素
 * @author yangran
 * @create 2019/3/4
 */
public class MedicineA extends Medicine {

    public MedicineA(String name, double price) {
        super(name, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
