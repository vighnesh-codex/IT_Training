package Day_8.class.task;

public class Find_sec_Max {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int max = arr[0];
        int sec_max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                sec_max = max;
                max = arr[i];
            }
            else if (arr[i]>sec_max && arr[i]!=max){
                sec_max = arr[i];
            }
        }
        System.out.println("Second maximum number is: " + sec_max);
    }
}
