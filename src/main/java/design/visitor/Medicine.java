package design.visitor;

/**
 * 抽象元素
 * @author yangran
 * @create 2019/3/4
 */
public abstract class Medicine {
    protected String name;
    protected double price;

    public Medicine (String name,double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void accept(Visitor visitor);
}
