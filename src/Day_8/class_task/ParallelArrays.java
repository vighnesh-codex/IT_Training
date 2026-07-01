package Day_8.class_task;

import java.util.Scanner;

public class ParallelArrays {



    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String [] a){
     Scanner sc = new Scanner(System.in);

        String [] drinks ={"pepsi", "sprite","maza","mountain dew","campa"};

        int [] prices =  {40,20,45,40,10};


        // gettitng the user input
        System.out.println( "pepsi, sprite,maza,mountain dew,campa");

        System.out.print("Enter the name of the drink : ");
         String name = sc.nextLine();

         System.out.println("ENter the Quantity : ");
       int qty =sc.nextInt();

        for (int i = 0; i < drinks.length; i++) {

            if (name.equals(drinks[i])){


           System.out.print(    prices[i] *qty);
       }

         }



         // printing the bill:

        //System.out.println(" The total amt is " qty* price)



       // System.out.print(1*prices[0]);
    sc.close();


    }
}
