package design.command;

/**
 * 电视机，命令接收者
 * @author yangran
 * @create 2019/2/10
 */
public class Television {
    public void open(){
        System.out.println("打开电视机......");
    }

    public void close(){
        System.out.println("关闭电视机......");
    }

    public void changeChannel(int i){
        System.out.println("切换电视频道......现在频道是："+i);
    }
}
