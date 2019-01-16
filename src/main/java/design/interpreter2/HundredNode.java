package design.interpreter2;

/**
 * @author yangran
 * @create 2019/1/8
 */
public class HundredNode extends UnitNode {

    public HundredNode(Node value){
        super(value);
    }

    public int interpret() {
        return value.interpret() * 100;
    }
}
