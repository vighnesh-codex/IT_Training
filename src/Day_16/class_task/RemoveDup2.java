package Day_16.class_task;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDup2 {

    public static void main(String[] args) {
        int []arr ={3,2,1,4};// -> [1,2,3,4,1]

        removeDup( arr);

        System.out.println(Arrays.toString(arr)); //[1,2,3,4]
    }

    public static void removeDup(int [] nums) {

        // add all the elements to set
       HashSet<Integer> hs = new HashSet<>();

       for(Integer i : nums ){

           hs.add(i);
       }


       /// taking all the elements from the hashSet and assigning to
        // nums Array
        int index =0;
      for (Integer i : hs){

          nums[index++]=i;

      }


        // then add all the element from the set to the nums array;


    }
}