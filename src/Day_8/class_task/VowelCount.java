package Day_8.class_task;
import java.util.Scanner;
public class VowelCount {

    public static void main(String [] arg){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your name : ");
     String name = sc.nextLine();

     int count =0;
     for(int i=0;i<name.length();i++){
         if (name.charAt(i)=='a' || name.charAt(i)=='e'
                 || name.charAt(i)=='i'|| name.charAt(i)=='o'
                 || name.charAt(i)=='u'){

             count =count+1;
         }
     }
     System.out.print("vowel count is : " +count);
     sc.close();
    }
}
