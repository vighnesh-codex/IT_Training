package Day_7.class_task;
import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("How many values (max " + arr.length + ")? ");
            int n = sc.nextInt();
            if (n < 0) n = 0;
            if (n > arr.length) n = arr.length;
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the value: ");
                arr[i] = sc.nextInt();
            }
            System.out.print("Array contents: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + (i == n - 1 ? "" : ", "));
            }
            System.out.println();
        }
    }
}

