package design.interpreter;

/**
 * 终结表达式-抽象类，解释运算符号
 * @author yangran
 * @create 2019/1/7
 */
public abstract class SymbolNode implements Node {

    protected Node left;
    protected Node right;

    public SymbolNode(Node left,Node right) {
        this.left=left;
        this.right=right;
    }

}
