package Day_8.class.task;

public class Swapping_Arr_Rev {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int last_index = arr.length - 1;
        for (int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[last_index-i];
            arr[last_index-i] = temp;
        }
        System.out.println("Reversed array:");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
