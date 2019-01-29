package design.chain;

/**
 * 抽象处理者
 * @author yangran
 * @create 2019/1/29
 */
public abstract class Leader implements Comparable<Leader> {
    /** 姓名 **/
    private String name;
    /** 职责链顺序 **/
    private int order;

    public Leader(String name,int order){
        this.name = name;
        this.order = order;
    }

    public String getName(){
        return this.name;
    }

    public int getOrder(){
        return this.order;
    }

    public abstract void handleRequest(LeaveNode leaveNode);

    public abstract boolean support(LeaveNode leaveNode);

    public int compareTo(Leader o) {
        if(getOrder() > o.getOrder())   return 1;
        if(getOrder() < o.getOrder())   return -1;
        return 0;
    }
}
