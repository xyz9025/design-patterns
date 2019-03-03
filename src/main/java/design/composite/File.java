package design.composite;

/**
 * 统一抽象组件
 * @author yangran
 * @create 2019/3/3
 */
public abstract class File {

    private String name;

    public File(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void display();

}
