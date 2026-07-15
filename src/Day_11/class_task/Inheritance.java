package Day_11.class_task;

public class Inheritance {
        public static void main(String [] args){
        TataCar t1 = new TataCar();
        t1.start();
    }
}
class Car{
    public void start(){

        System.out.println("car started");
    }
}
class TataCar extends Car {
    public void Start() {
        System.out.println("TataCar started...");
    }


}
