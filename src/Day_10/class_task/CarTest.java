package Day_10.class_task;

import java.util.Scanner;


public class CarTest {
   public static void main(String[] args){
       new Car();
   }
}

class Car{
    String brand;
    String model ;
    int speed ;
    int maxSpeed;

    @SuppressWarnings("ConvertToTryWithResources")
   Car() {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the brand name: ");
        brand =sc.nextLine();
        System.out.print("Enter the model : ");
        model = sc.nextLine();
        speed=0;
        System.out.print("Enter the maxspeed: ");
        maxSpeed=sc.nextInt();
        System.out.print(" car values initialized " + brand + " model :"+
        model+" with max speed "+ maxSpeed);
        sc.close();        
   }

    public void accelerate() {
        if (speed == 40) {
            System.out.print("maximum speed reached:");
        } else {
            speed = speed + 5;
            System.out.println(brand + " driving at " + speed+" kms speed");
        }
    }
    public void brake(){
      if(speed ==0){
          System.out.print("vehicle is not moving");
      }
      else{
          speed =speed-5;
          System.out.println( brand +" brake applied  speed : "+ speed +" kms");
      }

    }
  public   void setter(){
    }
}