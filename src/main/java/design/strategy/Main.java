package design.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.setPaymentStrategy(new CreditCardPayment("1200-1223-0122", "Tom"));
        shoppingCart.checkout(10);

        shoppingCart.setPaymentStrategy(new PayPalPayment("pay@mail.com"));
        shoppingCart.checkout(500);
    }
}
