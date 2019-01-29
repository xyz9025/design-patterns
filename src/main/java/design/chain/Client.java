package design.chain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 职责链模式
 * @author yangran
 * @create 2019/1/29
 */
public class Client {

    public static void main(String[] args) {
        LeaveNode node = new LeaveNode("小明",5);
        Leader leader1 = new Instructor("张三",0);
        Leader leader2 = new DepartmentHead("李四",1);
        Leader leader3 = new Dean("王五",2);
        Leader leader4 = new Dean("赵久",3);
        Leader leader5 = new President("杨一",4);
        Leader leader6 = new LeaveRule("学校请假规则",5);

        List<Leader> list = new ArrayList();
        list.add(leader5);
        list.add(leader6);
        list.add(leader3);
        list.add(leader4);
        list.add(leader1);
        list.add(leader2);

        Comparator<Leader> comparator = Leader::compareTo;

        //Collections.sort(list);
        Collections.sort(list,comparator);

        for(Leader leader : list){
            if(leader.support(node)){
                leader.handleRequest(node);
                break;
            }
        }
    }

}
