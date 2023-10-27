package coding.challenge.vending;

public class Main {
    public static void main(String[] args) {
        Vending vending = new Vending();
        System.out.println("Twix Price : " + vending.checkPriceBtn(Item.TWIX));
    }
}
