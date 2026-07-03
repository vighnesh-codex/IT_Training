package Day_10.class_task;


public class Oops {
    public  static void main(String[] args){
        Laptop l1 = new Laptop();
        System.out.print(l1);
    }

    public static void record(){
        System.out.print("recording ");
    }

}


class Laptop{
    String brand ;
    String model;

    public void browse(){
        System.out.print("browsing..");
    }
}
