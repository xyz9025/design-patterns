package design.composite;

/**
 * @author yangran
 * @create 2019/3/3
 */
public class ImagerFile extends File {

    public ImagerFile(String name){
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是图像文件，文件名：" + super.getName());
    }
}
