package design.chain;

/**
 * 校长
 * @author yangran
 * @create 2019/1/29
 */
public class President extends Leader {

    public President(String name,int order){
        super(name, order);
    }

    public void handleRequest(LeaveNode leaveNode) {
        System.out.println("校长" + getName() + "审批" +leaveNode.getPerson() + "同学的请假条,请假天数为" + leaveNode.getNumber() + "天。");
    }

    public boolean support(LeaveNode leaveNode) {
        if(leaveNode.getNumber() <= 15) return true;
        return false;
    }
}
