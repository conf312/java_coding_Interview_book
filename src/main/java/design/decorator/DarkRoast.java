package design.decorator;

public class DarkRoast implements Beverage {
    @Override
    public String getDescription() {
        return "다크 로스트 커피";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
