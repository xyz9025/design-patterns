package design.composite;

/**
 * @author yangran
 * @create 2019/3/3
 */
public class VideoFile extends File {

    public VideoFile(String name){
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是视频文件，文件名：" + super.getName());
    }
}
