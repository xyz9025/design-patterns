package design.state;

/**
 * 房间类
 * @author yangran
 * @create 2019/3/4
 */
public class Room {

    private State freeTimeState;    //空闲状态
    private State checkInState;     //入住状态
    private State bookedState;      //预订状态

    private State state;    //房间状态

    public Room(){
        freeTimeState = new FreeTimeState(this);
        checkInState = new CheckInState(this);
        bookedState = new BookedState(this);

        state = freeTimeState;  //初始化状态
    }

    /**
     * @desc 预订房间
     * @return void
     */
    public void bookRoom(){
        state.bookRoom();
    }

    /**
     * @desc 退订房间
     * @return void
     */
    public void unsubscribeRoom(){
        state.unsubscribeRoom();
    }

    /**
     * @desc 入住
     * @return void
     */
    public void checkInRoom(){
        state.checkInRoom();
    }

    /**
     * @desc 退房
     * @return void
     */
    public void checkOutRoom(){
        state.checkOutRoom();
    }

    public String toString(){
        return "该房间的状态是:"+getState().getStateName();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getFreeTimeState() {
        return freeTimeState;
    }


    public State getCheckInState() {
        return checkInState;
    }


    public State getBookedState() {
        return bookedState;
    }
}
