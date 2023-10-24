package override;

public class SteamCar extends Vehicle {
    @Override
    public String speedUp() {
        return null;
    }

    public static void main(String[] args) {
        SteamCar steamCar = new SteamCar();
        System.out.println(steamCar.speedDown());
    }
}
