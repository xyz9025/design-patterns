package design.interpreter2;

/**
 * 非终结表达式-解释表达式的值
 * @author yangran
 * @create 2019/1/7
 */
public class ValueNode implements Node {

    private int value;

    public ValueNode(int value)
    {
        this.value=value;
    }

    public int interpret() {
        return this.value;
    }
}
