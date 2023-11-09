package design.decorator;

public class Main {
    public static void main(String[] args) {
        // 에스프레소 커피
        Beverage espresso = new Espresso();
        System.out.println("주문: " + espresso.getDescription() + ", 가격: $" + espresso.cost());

        // 다크 로스트 커피에 모카와 우유 추가
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Milk(darkRoast);
        System.out.println("주문: " + darkRoast.getDescription() + ", 가격: $" + darkRoast.cost());
    }
}
