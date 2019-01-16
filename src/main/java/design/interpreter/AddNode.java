package design.interpreter;

/**
 * @author yangran
 * @create 2019/1/7
 */
public class AddNode extends SymbolNode {

    public AddNode(Node left,Node right){
        super(left, right);
    }

    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
