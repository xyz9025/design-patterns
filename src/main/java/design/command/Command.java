package design.command;

/**
 * 抽象命令接口，所有命令都应该实现它
 * @author yangran
 * @create 2019/2/10
 */
public interface Command {

    /**
     * 为了方便切换频道，这里使用参数i将频道传递
     * @param i
     */
    void execute(int i);
}
