package override;

public class Avante extends Car {

    @Override
    public String run() {
        System.out.println(super.run());
        return "avante run";
    }

    public static void move() {
        System.out.println("Moving a Avante");
    }

    public static void main(String[] args) {
        Avante avante = new Avante();
        System.out.println(avante.run());
        avante.test();
        Car.move();
        Avante.move();
    }
}
