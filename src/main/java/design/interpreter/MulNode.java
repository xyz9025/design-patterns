package design.interpreter;

/**
 * @author yangran
 * @create 2019/1/7
 */
public class MulNode extends SymbolNode {

    public MulNode(Node left,Node right) {
        super(left,right);
    }

    public int interpret() {
        return left.interpret() * right.interpret();
    }
}
