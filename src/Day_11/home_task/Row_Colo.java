package Day_11.home_task;
import java.util.Scanner;

public class Row_Colo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numeber of rows and seats :");
        int r =sc.nextInt();
        int c =sc.nextInt();
        printRowColo(r,c);

        sc.close();
    }   
    
    public static void printRowColo(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print("R"+i+"S"+j+' ');
            }System.out.println();
        }
    }


}
