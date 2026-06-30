package Day_6.class_task;
import  java.util.Scanner;
public class whileLoop {



    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);


        int pass =1234;

        int userPass =0;


        while (pass!=userPass){

        System.out.println("please enter your pin : " );
        userPass =sc.nextInt();



        }
        System.out.print("welcome");
        sc.close();
    }
}
