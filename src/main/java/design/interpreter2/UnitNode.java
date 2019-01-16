package design.interpreter2;

/**
 * @author yangran
 * @create 2019/1/8
 */
public abstract class UnitNode implements Node {
    protected Node value;

    public UnitNode(Node value) {
        this.value = value;
    }
}
