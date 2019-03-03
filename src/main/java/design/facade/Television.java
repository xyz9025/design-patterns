package design.facade;

/**
 * 子系统角色
 * 需要被外观角色包装的组件
 * @author yangran
 * @create 2019/3/3
 */
public class Television {

    public void on(){
        System.out.println("打开了电视.....");
    }

    public void off(){
        System.out.println("关闭了电视.....");
    }
}
