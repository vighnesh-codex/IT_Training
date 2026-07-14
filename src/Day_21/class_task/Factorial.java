package Day_21.class_task;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for Factorial :");
        int num = sc.nextInt();
        System.out.println(Fac(num));
        sc.close();
    }

    public static int Fac(int a){
        if (a==0||a==1){
            return 1;
        }else{
            return a*Fac(a-1);
        }
    }
}
