package Day_8.class_task;

public class ArrayReverse {
    public static void main(String[] args) {
        String [] arr = {"veg", "non-veg", "sweets","beverages"};
        String [] m1 = new String[arr.length];
        for (int i=0;i<arr.length;i++){
            m1[i] = arr[arr.length-1-i];
        }
        System.out.println("Reversed array:");
        for (String item : m1) {
            System.out.print(item + " ");
        }
    }
}