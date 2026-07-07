package Day_12.home_task;
public class CarInputs {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();

    }
}
class Engine {
    void ignite() {
        System.out.println("Engine Started");
    }
}
class Car {
    Engine engine = new Engine();

    void drive() {
        engine.ignite();
        System.out.println("Car Moving");
    }
}


