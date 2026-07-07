package Day_11.class_task;

public class Inheritance {
        public static void main(String [] args){
        Car c1 = new Car();
        TataCar t1 = new TataCar();
        t1.start();
    }
}
class Car{
    String brand;
    String model;
    public void start(){

        System.out.println("car started");
    }
}
class TataCar extends Car {
    public void Start() {
        System.out.println("TataCar started...");
    }

    class Nexon {
        public void start() {
            System.out.println("car started");
        }
    }

    class Ev {
        public void start() {
            System.out.println("Ev started");
        }
    }
}
