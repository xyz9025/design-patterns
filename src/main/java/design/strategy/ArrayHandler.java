package design.strategy;

/**
 * @author yangran
 * @create 2019/1/29
 */
public class ArrayHandler {
    private Sort sort;

    public ArrayHandler(Sort sort){
        this.sort = sort;
    }

    public int[] sort(int arr[]) {
        sort.sort(arr);
        return arr;
    }
}
