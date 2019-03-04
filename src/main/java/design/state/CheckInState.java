package design.state;

/**
 * 入住了阔以退房
 * @author yangran
 * @create 2019/3/4
 */
public class CheckInState implements State {

    private Room hotelManagement;
    private String name;

    public CheckInState(Room hotelManagement){
        this.hotelManagement = hotelManagement;
        this.name = "入住状态";
    }

    @Override
    public String getStateName() {
        return name;
    }

    @Override
    public void bookRoom() {
        System.out.println("该房间已经入住了...");
    }

    @Override
    public void unsubscribeRoom() {

    }

    @Override
    public void checkInRoom() {
        System.out.println("该房间已经入住了...");
    }

    @Override
    public void checkOutRoom() {
        hotelManagement.setState(hotelManagement.getFreeTimeState());     //状态变成空闲
        System.out.println("退房成功....");
    }
}
