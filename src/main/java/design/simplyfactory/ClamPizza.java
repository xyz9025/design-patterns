package design.simplyfactory;

/**
 * @author yangran
 * @create 2019/1/10
 */
public class ClamPizza extends Pizza {
    public void prepare() {
        System.out.println("prepare ClamPizza ...");
    }

    public void bake() {
        System.out.println("bake ClamPizza ...");
    }

    public void cut() {
        System.out.println("cut ClamPizza ...");
    }

    public void box() {
        System.out.println("box ClamPizza ...");
    }
}
