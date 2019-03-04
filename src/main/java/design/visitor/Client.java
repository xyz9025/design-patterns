package design.visitor;

/**
 * 访问者模式
 * 使用场景：
 * 对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作
 * 需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作“污染”这些对象的类，也不希望在增加新操作时修改这些类
 *
 * 优点：
 * 1、使得新增新的访问操作变得更加简单
 * 2、能够使得用户在不修改现有类的层次结构下，定义该类层次结构的操作
 *
 * 缺点：
 * 1、增加新的元素类很困难。在访问者模式中，每增加一个新的元素类都意味着要在抽象访问者角色中增加一个新的抽象操作，并在每一个具体访问者类中增加相应的具体操作，
 * 违背了“开闭原则”的要求。 2、破坏封装。当采用访问者模式的时候，就会打破组合类的封装
 * @author yangran
 * @create 2019/3/4
 */
public class Client {

    public static void main(String[] args) {
        Medicine a = new MedicineA("板蓝根", 11.0);
        Medicine b = new MedicineB("感康", 14.3);

        Presciption presciption = new Presciption();
        presciption.addMedicine(a);
        presciption.addMedicine(b);

        Visitor charger = new Charger();
        charger.setName("张三");

        Visitor workerOfPharmacy = new WorkerOfPharmacy();
        workerOfPharmacy.setName("李四");

        presciption.accept(charger);
        System.out.println("-------------------------------------");
        presciption.accept(workerOfPharmacy);
    }

}
