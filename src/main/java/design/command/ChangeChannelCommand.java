package design.command;

/**
 * @author yangran
 * @create 2019/2/10
 */
public class ChangeChannelCommand implements Command {
    private Television tv;

    public ChangeChannelCommand(Television tv){
        this.tv = tv;
    }

    @Override
    public void execute(int i) {
        tv.changeChannel(i);
    }
}
