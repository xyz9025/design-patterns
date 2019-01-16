package design.abstractfactory;

/**
 * @author yangran
 * @create 2019/1/16
 */
public class AmericanMother implements IMother {
    private String name;

    public AmericanMother(String name){
        this.name = name;
    }

    public void printName() {
        System.out.println(this.getClass().getName() + ":" + this.name);
    }
}
