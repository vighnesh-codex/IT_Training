package Day_21.class_task;
import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to print SUM: ");
        int a=sc.nextInt();
        System.out.print(sum(a));
    }

    public static int sum(int n){
        if (n==0){
            return 0;
        }

        return n+sum(n-1);
    }
}
