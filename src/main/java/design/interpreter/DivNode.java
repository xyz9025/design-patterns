package design.interpreter;

/**
 * @author yangran
 * @create 2019/1/7
 */
public class DivNode extends SymbolNode {

    public DivNode(Node left,Node right){
        super(left, right);
    }

    public int interpret() {
        return left.interpret() / right.interpret();
    }
}
