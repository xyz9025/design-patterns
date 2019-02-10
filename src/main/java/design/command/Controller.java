package design.command;

/**
 * 命令调用者
 * @author yangran
 * @create 2019/2/10
 */
public class Controller {
    private Command openTVCommand;
    private Command closeTVCommand;
    private Command changeChannelCommand;

    public int nowChannel = 0;       //当前频道
    public int priorChannel;     //前一个频道，用于执行返回操作

    public Controller(Command openTvCommand,Command closeTvCommand,Command changeChannelCommand){
        this.openTVCommand = openTvCommand;
        this.closeTVCommand = closeTvCommand;
        this.changeChannelCommand = changeChannelCommand;
    }

    /**
     * 打开电视机
     */
    public void open(){
        openTVCommand.execute(0);
    }

    /**
     * 关闭电视机
     */
    public void close(){
        closeTVCommand.execute(0);
    }

    /**
     * 换频道
     */
    public void change(){
        priorChannel = nowChannel;  //，切换前记录当前频道
        nowChannel++;   //频道+1
        changeChannelCommand.execute(nowChannel);
    }

    public void channelUndo(){
        changeChannelCommand.execute(priorChannel);
        //当前频道与前一个频道进行互换
        int tempChannel;
        tempChannel = priorChannel;
        priorChannel = nowChannel;
        nowChannel = tempChannel;
    }
}
