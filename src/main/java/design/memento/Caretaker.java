package design.memento;

/**
 * 负责人——负责保存好备忘录，不能对备忘录的内容进行操作和访问，只能够将备忘录传递给其他对象
 * @author yangran
 * @create 2019/3/4
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
