package Day_13.class_task;
import java.util.Scanner;

public class ErroHandling {
    int c=0;
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        try{
            int a = sc.nextInt();
            System.out.print(a*a);
            sc.close();
        }catch(Exception e){
            System.out.println("Please Enter an number");
            c++;
            if(c==3){
                System.out.println("Number of attempts ended");
                sc.close();
            }else{
                main(args);
                sc.close();
            }
        }
    }
}
