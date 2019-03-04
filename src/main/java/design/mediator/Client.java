package design.mediator;

/**
 * 中介者模式——适用场景
 * 系统中对象之间存在比较复杂的引用关系，导致他们之间的依赖关系结构混乱而且难以复用该对象
 * 想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类
 *
 * 缺点：由于中介者对象封装了系统中对象之间的相互关系，导致其变得非常复杂，使得系统维护比较困难
 * @author yangran
 * @create 2019/3/4
 */
public class Client {
    public static void main(String[] args) {
        //一个房主、一个租房者、一个中介机构
        MediatorStructure mediator = new MediatorStructure();

        //房主和租房者只需要知道中介机构即可
        HouseOwner houseOwner = new HouseOwner("张三", mediator);
        Tenant tenant = new Tenant("李四", mediator);

        //中介结构要知道房主和租房者
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.constact("听说你那里有三室的房主出租.....");
        houseOwner.constact("是的!请问你需要租吗?");
    }
}
