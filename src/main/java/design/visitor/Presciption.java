package design.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 药单
 * @author yangran
 * @create 2019/3/4
 */
public class Presciption {
    private List<Medicine> list = new ArrayList<Medicine>();

    public void accept(Visitor visitor){
        Iterator<Medicine> iterator = list.iterator();

        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }

    public void addMedicine(Medicine medicine){
        list.add(medicine);
    }

    public void removeMedicien(Medicine medicine){
        list.remove(medicine);
    }
}
