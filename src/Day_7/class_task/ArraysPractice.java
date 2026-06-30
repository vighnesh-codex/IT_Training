package Day_7.class_task;

import java.util.Arrays;
public class ArraysPractice {


    public static void main(String [] args ){

   int [] arr = new int[5];

// [0,2,4,6,8]

    for (int i =0; i <5; i=i+2) {

        arr[i] =(2*i)-1;


    }    // [-1,0,3,0,7]
        System.out.println(Arrays.toString(arr));
//





    }
}
