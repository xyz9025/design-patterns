package design.chain;

/**
 * 请假条
 * @author yangran
 * @create 2019/1/29
 */
public class LeaveNode {
    /** 请假天数 **/
    private  int number;

    /** 请假人 **/
    private String person;

    public LeaveNode(String person,int number){
        this.person = person;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
}
