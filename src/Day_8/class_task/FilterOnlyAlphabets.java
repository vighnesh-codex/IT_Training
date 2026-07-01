package Day_8.class_task;
import java.util.Scanner;

public class FilterOnlyAlphabets {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String []x){

        Scanner sc = new Scanner (System.in);

        // enter user name : insta@123

        // op : insta

    System.out.print("Enter your insta user name : ");


       String  userName = sc.nextLine();


       for(int i=0 ; i<userName.length();i++){


           if (userName.charAt(i)>='a' && userName.charAt(i)<='z'){


               System.out.print(userName.charAt(i));
           }


       }



    sc.close();

    }



}
