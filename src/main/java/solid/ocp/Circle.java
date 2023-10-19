package solid.ocp;

public class Circle implements Shape {
    private final int redius;

    public Circle(int redius) {
        this.redius = redius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(redius, 2);
    }
}
