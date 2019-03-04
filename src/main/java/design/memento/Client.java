package design.memento;

/**
 * 备忘录模式
 * 1、需要保存一个对象在某一个时刻的状态或部分状态
 * 2、如果用一个接口来让其他对象得到这些状态，将会暴露对象的实现细节并破坏对象的封装性，
 *    一个对象不希望外界直接访问其内部状态，通过负责人可以间接访问其内部状态
 *
 * @author yangran
 * @create 2019/3/4
 */
public class Client {

    public static void main(String[] args) {
        //打BOSS之前：血、蓝全部满值
        Role role = new Role(100, 100);
        System.out.println("----------大战BOSS之前----------");
        role.display();

        //保持进度
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(role.saveMemento());

        //大战BOSS，快come Over了
        role.setBloodFlow(20);
        role.setMagicPoint(20);
        System.out.println("----------大战BOSS----------");
        role.display();

        //恢复存档
        role.restoreMemento(caretaker.getMemento());
        System.out.println("----------恢复----------");
        role.display();

    }

}
