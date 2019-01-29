package design.chain;

/**
 * 学校请假规则
 * @author yangran
 * @create 2019/1/29
 */
public class LeaveRule extends Leader {

    public LeaveRule(String name,int order){
        super(name, order);
    }

    public void handleRequest(LeaveNode leaveNode) {
        System.out.println("学校请假规则:请假天数超过15天,不批准...");
    }

    public boolean support(LeaveNode leaveNode) {
        if(leaveNode.getNumber() > 15) return true;
        return false;
    }
}
