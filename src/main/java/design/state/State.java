package design.state;

/**
 * 状态接口
 * State定义了一个所有具体状态的共同接口，任何状态都实现这个相同的接口，这样一来，状态之间就可以互相转换了
 * @author yangran
 * @create 2019/3/4
 */
public interface State {

    /**
     * 获取状态名称
     * @return
     */
    String getStateName();

    /**
     * @desc 预订房间
     * @return void
     */
    void bookRoom();

    /**
     * @desc 退订房间
     * @return void
     */
    void unsubscribeRoom();

    /**
     * @desc 入住
     * @return void
     */
    void checkInRoom();

    /**
     * @desc 退房
     * @return void
     */
    void checkOutRoom();

}
