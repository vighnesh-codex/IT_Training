package Day_17.class_task;
import java.util.TreeSet;
public class RemoveDup {
    public static void main(String [] args){
        int arr [] = {5,3,8,1,5,3,9};
        TreeSet<Integer> ts = new TreeSet<>();
        for(Integer i : arr){
            ts.add(i);
        }
//        int [] nums = new int[ts.size()];
        int index = 0;
        for(Integer i : arr){
            arr[index++] = i;
        }
        System.out.println(ts);
//        System.out.println(ts);
//        Object [] obArr = ts.toArray();
//        for(Object i : obArr){
//            i=(Integer)i;
//            System.out.println(i);
//        }
//        System.out.println(obArr.getClass());
    }
}
