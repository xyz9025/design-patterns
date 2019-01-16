package design.adapter;

/**
 * @author yangran
 * @create 2019/1/9
 */
public class BioRobot implements Robot {
    public void cry() {
        System.out.println("仿生机器人叫.....");
    }

    public void move() {
        System.out.println("仿生机器人慢慢移动....");
    }
}
