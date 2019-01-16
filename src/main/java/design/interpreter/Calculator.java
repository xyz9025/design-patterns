package design.interpreter;

import java.util.Stack;

/**
 * 表达式计算器
 * @author yangran
 * @create 2019/1/7
 */
public class Calculator {
    private Node node;

    public void build(String statement){
        Node left,right;
        Stack<Node> stack=new Stack();

        String[] statementArr=statement.split(" ");

        for(int i=0;i<statementArr.length;i++){
            if(stack.empty()){
                stack.push(new ValueNode(Integer.parseInt(statementArr[i])));
            }else {
                String symbol = statementArr[i];
                left=stack.pop();
                int val=Integer.parseInt(statementArr[++i]);
                right=new ValueNode(val);
                Node newNode = getNode(symbol,left,right);
                if(newNode!=null)   stack.push(newNode);
            }
        }
        this.node=stack.pop();
    }

    private Node getNode(String symbol,Node left,Node right){
        if(symbol.equals("*")){
            return new MulNode(left,right);
        }

        if(symbol.equals("/")){
            return new DivNode(left,right);
        }

        if(symbol.equals("%")){
            return new ModNode(left,right);
        }

        if(symbol.equals("+")){
            return new AddNode(left,right);
        }

        return null;
    }

    public int compute(){
        return node.interpret();
    }
}
