package design.visitor;

/**
 * 具体访问者——划价员
 * @author yangran
 * @create 2019/3/4
 */
public class Charger extends Visitor {
    @Override
    public void visitor(MedicineA a) {
        System.out.println("划价员：" + name +"给药" + a.getName() +"划价:" + a.getPrice());
    }

    @Override
    public void visitor(MedicineB b) {
        System.out.println("划价员：" + name +"给药" + b.getName() +"划价:" + b.getPrice());
    }
}
