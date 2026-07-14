package Day_16.class_task;

import java.util.LinkedList;
public class LinkedListTest {
    public static void main(String [] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(5);
        list.add(7);
        list.add(5);
        list.add(null);
        list.remove(null);
//        list.indexOf(5);
//        System.out.println(list);
        System.out.println(list.indexOf(5));

    }
}
