import java.util.Scanner;
public class Febonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for Febonnaci :");
        int num = sc.nextInt();
        Feb(num);
        sc.close();
    }

    public static void Feb(int a){
        int b=0;
        int c=1;
        int d;
        for(int i =0;i<a;i++){
            System.out.print(b+" ");
            d=b+c;
            b=c;
            c=d;
        }
        
    }
}
