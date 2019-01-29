package design.strategy;

/**
 * 1、策略模式提供了对“开闭原则”的完美支持，用户可以在不修改原有系统的基础上选择算法或行为，也可以灵活地增加新的算法或行为。
 * 2、策略模式提供了可以替换继承关系的办法
 * @author yangran
 * @create 2019/1/29
 */
public class Client {
    public static void main(String[] args) {
        int arr[]={1,4,6,2,5,3,7,10,9};
        int result[];
        Sort sort = new InsertionSort();    //设置排序策略
        ArrayHandler ah=new ArrayHandler(sort);

        result = ah.sort(arr);
        for(int i=0;i<result.length;i++) {
            System.out.print(result[i] + ",");
        }
    }
}
