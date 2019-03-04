package design.state;

/**
 *  预定状态阔以入住和取消预定
 * @author yangran
 * @create 2019/3/4
 */
public class BookedState implements State {

    private Room hotelManagement;
    private String name;

    public BookedState(Room hotelManagement){
        this.hotelManagement = hotelManagement;
        this.name = "预定状态";
    }

    @Override
    public String getStateName() {
        return name;
    }

    @Override
    public void bookRoom() {
        System.out.println("该房间已近给预定了...");
    }

    @Override
    public void unsubscribeRoom() {
        hotelManagement.setState(hotelManagement.getFreeTimeState());   //变成空闲状态
        System.out.println("退订成功,欢迎下次光临...");
    }

    @Override
    public void checkInRoom() {
        hotelManagement.setState(hotelManagement.getCheckInState());         //状态变成入住
        System.out.println("入住成功...");
    }

    @Override
    public void checkOutRoom() {

    }
}
