package override;

public class Avante extends Car {

    @Override
    public String run() {
        System.out.println(super.run());
        return "avante run";
    }

    public static void main(String[] args) {
        Avante avante = new Avante();
        System.out.println(avante.run());
    }
}
