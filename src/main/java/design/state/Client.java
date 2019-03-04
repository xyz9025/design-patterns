package design.state;

/**
 * 状态模式-使用场景
 * 对象的行为依赖于它的状态（属性）并且可以根据它的状态改变而改变它的相关行为
 * 代码中包含大量与对象状态有关的条件语句
 * @author yangran
 * @create 2019/3/4
 */
public class Client {

    public static void main(String[] args) {
        //有3间房
        Room[] rooms = new Room[2];
        //初始化
        for(int i = 0 ; i < rooms.length ; i++){
            rooms[i] = new Room();
        }
        //第一间房
        rooms[0].bookRoom();    //预订
        rooms[0].checkInRoom();   //入住
        rooms[0].bookRoom();    //预订
        System.out.println(rooms[0]);
        System.out.println("---------------------------");

        //第二间房
        rooms[1].checkInRoom();
        rooms[1].bookRoom();
        rooms[1].checkOutRoom();
        rooms[1].bookRoom();
        System.out.println(rooms[1]);
    }

}
