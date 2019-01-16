package design.abstractfactory;

/**
 * 具体产品
 * @author yangran
 * @create 2019/1/16
 */
public class ChineseMother implements IMother {
    private String name;

    public ChineseMother(String name){
        this.name = name;
    }

    public void printName() {
        System.out.println(this.getClass().getName() + ":" + this.name);
    }
}
