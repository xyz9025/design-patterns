package design.command;

/**
 * 具体命令类
 * @author yangran
 * @create 2019/2/10
 */
public class OpenTvCommand implements Command {
    private Television tv;

    public OpenTvCommand(Television tv){
        this.tv = tv;
    }

    @Override
    public void execute(int i) {
        tv.open();
    }
}
