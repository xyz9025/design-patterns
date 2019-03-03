package design.composite;

/**
 * 叶子对象
 * @author yangran
 * @create 2019/3/3
 */
public class TextFile extends File {

    public TextFile(String name){
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是文本文件，文件名：" + super.getName());
    }
}
