package override;

public class Car {
    public String run() {
        return "Car run";
    }

    public static void move() {
        System.out.println("Moving a Car");
    }

    public final void test() {
        System.out.println("Car Class test");
    }
}
