package design.interpreter;

/**
 * @author yangran
 * @create 2019/1/7
 */
public class ModNode extends SymbolNode {

    public ModNode(Node left,Node right){
        super(left, right);
    }

    public int interpret() {
        return left.interpret() % right.interpret();
    }
}
