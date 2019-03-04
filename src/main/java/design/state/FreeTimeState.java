package design.state;

/**
 * 空闲状态只能预订和入住
 * @author yangran
 * @create 2019/3/4
 */
public class FreeTimeState implements State {

    private Room hotelManagement;
    private String name;

    public FreeTimeState(Room hotelManagement){
        this.hotelManagement = hotelManagement;
        this.name = "空闲状态";
    }

    @Override
    public String getStateName() {
        return name;
    }

    @Override
    public void bookRoom() {
        hotelManagement.setState(hotelManagement.getBookedState());   //状态变成已经预订
        System.out.println("您已经成功预订了...");
    }

    @Override
    public void unsubscribeRoom() {

    }

    @Override
    public void checkInRoom() {
        hotelManagement.setState(hotelManagement.getCheckInState());   //状态变成已经入住
        System.out.println("您已经成功入住了...");
    }

    @Override
    public void checkOutRoom() {

    }
}
