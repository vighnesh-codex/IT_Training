package Day_7.class_task;
import java.util.Arrays;
import java.util.Scanner;
public class MarkGrading {

    public static void main(String [] args){
        String [] subjects = new String [5];
        int [] marks = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Candidate name : ");
        String name = sc.nextLine();

        for (int i=0;i<marks.length;i++){
            System.out.print("Enter the subject name :  ");
            subjects[i] = sc.nextLine();
            System.out.print("Enter the marks : ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }
        int totalMarks=0;
        for (int i=0;i<marks.length;i++){
            totalMarks = totalMarks+marks[i];
        }
        System.out.println(  " congrats " + name +" you have scored : " + totalMarks + " marks");
        System.out.println( " your percentage is " +totalMarks/5.0);
        System.out.print (Arrays.toString(marks));
        System.out.println(Arrays.toString(subjects));
        sc.close();
    }
}
