package design.abstractfactory;

/**
 * @author yangran
 * @create 2019/1/16
 */
public class ChineseFather implements IFather {
    private String name;

    public ChineseFather(String name){
        this.name = name;
    }

    public void printName() {
        System.out.println(this.getClass().getName() + ":" + this.name);
    }
}
