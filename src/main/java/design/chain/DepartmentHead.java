package design.chain;

/**
 * 系主任
 * @author yangran
 * @create 2019/1/29
 */
public class DepartmentHead extends Leader {

    public DepartmentHead(String name,int order){
        super(name, order);
    }

    public void handleRequest(LeaveNode leaveNode) {
        System.out.println("系主任" + getName() + "审批" +leaveNode.getPerson() + "同学的请假条,请假天数为" + leaveNode.getNumber() + "天。");
    }

    public boolean support(LeaveNode leaveNode) {
        if(leaveNode.getNumber() <= 7)   return true;
        return false;
    }
}
