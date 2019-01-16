package design.interpreter2;

/**
 * @author yangran
 * @create 2019/1/8
 */
public class WanNode extends UnitNode {

    public WanNode(Node value){
        super(value);
    }

    public int interpret() {
        return value.interpret() * 10000;
    }
}
