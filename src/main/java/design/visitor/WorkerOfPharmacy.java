package design.visitor;

/**
 * 具体访问者——药房工作者
 * @author yangran
 * @create 2019/3/4
 */
public class WorkerOfPharmacy extends Visitor {
    @Override
    public void visitor(MedicineA a) {
        System.out.println("药房工作者：" + name + "拿药 ：" + a.getName());
    }

    @Override
    public void visitor(MedicineB b) {
        System.out.println("药房工作者：" + name + "拿药 ：" + b.getName());
    }
}
