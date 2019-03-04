package design.visitor;

/**
 * @author yangran
 * @create 2019/3/4
 */
public class MedicineB extends Medicine {

    public MedicineB(String name, double price) {
        super(name, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
