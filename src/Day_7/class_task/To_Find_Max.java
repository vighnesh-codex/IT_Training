package Day_7.class_task;

public class To_Find_Max {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in the array is: " + max);
    }
}