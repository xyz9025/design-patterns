package design.memento;

/**
 * 原发器。负责创建一个备忘录，用以记录当前对象的内部状态，通过也可以使用它来利用备忘录恢复内部状态。
 * 同时原发器还可以根据需要决定Memento存储Originator的那些内部状态
 * @author yangran
 * @create 2019/3/4
 */
public class Role {
    private int bloodFlow;      //血量
    private int magicPoint;     //蓝量

    public Role(int bloodFlow,int magicPoint){
        this.bloodFlow = bloodFlow;
        this.magicPoint = magicPoint;
    }

    public int getBloodFlow() {
        return bloodFlow;
    }

    public void setBloodFlow(int bloodFlow) {
        this.bloodFlow = bloodFlow;
    }

    public int getMagicPoint() {
        return magicPoint;
    }

    public void setMagicPoint(int magicPoint) {
        this.magicPoint = magicPoint;
    }

    /**
     * @desc 展示角色当前状态
     * @return void
     */
    public void display(){
        System.out.println("用户当前状态:");
        System.out.println("血量:" + getBloodFlow() + ";蓝量:" + getMagicPoint());
    }

    /**
     * @desc 保持存档、当前状态
     * @return
     * @return Memento
     */
    public Memento saveMemento(){
        return new Memento(getBloodFlow(), getMagicPoint());
    }

    /**
     * @desc 恢复存档
     * @param memento
     * @return void
     */
    public void restoreMemento(Memento memento){
        this.bloodFlow = memento.getBloodFlow();
        this.magicPoint = memento.getMagicPoint();
    }

}
