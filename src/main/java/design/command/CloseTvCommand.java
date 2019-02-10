package design.command;

/**
 * @author yangran
 * @create 2019/2/10
 */
public class CloseTvCommand implements Command {
    private Television tv;

    public CloseTvCommand(Television tv){
        this.tv = tv;
    }

    @Override
    public void execute(int i) {
        tv.close();
    }
}
