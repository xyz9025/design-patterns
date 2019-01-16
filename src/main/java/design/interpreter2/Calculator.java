package design.interpreter2;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author yangran
 * @create 2019/1/8
 */
public class Calculator {
    private List<String> units = Arrays.asList("万","千","百","十");
    private Node node;

    public void build(String statement){
        Node data;
        Stack<Node> stack=new Stack();

        String[] statementArr = new String[statement.length()] ;
        for(int k = 0; k < statement.length(); k++) statementArr[k] = String.valueOf(statement.charAt(k));

        for(int i=0;i<statementArr.length;i++){
            String unit = statementArr[i];
            boolean isUnit = units.contains(unit);
            if(isUnit){
                data = stack.pop();
                Node newNode = getNode(unit,data);
                if(newNode!=null)   stack.push(newNode);
            }else {
                stack.push(new ValueNode(Integer.parseInt(unit)));
            }
        }
        int value = 0;
        for(Node v : stack){
            value+= v.interpret();
        }
        this.node = new ValueNode(value);
    }

    private Node getNode(String unit, Node data){
        if(unit.equals("万")){
            return new WanNode(data);
        }
        if(unit.equals("千")){
            return new ThousandNode(data);
        }
        if(unit.equals("百")){
            return new HundredNode(data);
        }
        if(unit.equals("十")){
            return new TenNode(data);
        }
        return null;
    }

    public int compute(){
        return node.interpret();
    }
}
