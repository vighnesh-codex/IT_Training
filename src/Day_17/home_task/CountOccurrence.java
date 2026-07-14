package Day_17.home_task;

import java.util.*;

public class CountOccurrence {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(20);

        int count = Collections.frequency(list, 20);

        System.out.println(count);
    }
}
