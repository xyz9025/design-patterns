package design.interpreter2;

/**
 * @author yangran
 * @create 2019/1/8
 */
public class ThousandNode extends UnitNode {

    public ThousandNode(Node value){
        super(value);
    }

    public int interpret() {
        return value.interpret() * 1000;
    }
}
