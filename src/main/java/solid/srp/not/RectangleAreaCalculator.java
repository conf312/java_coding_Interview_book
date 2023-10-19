package solid.srp.not;

/**
 * 단일 책임 원칙을 따르지 않는 예제
 */
public class RectangleAreaCalculator {
    private static final double INCH_TERM = 0.0254d;
    
    private final int width;
    private final int height;

    public RectangleAreaCalculator(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public int area() {
        return width * height;
    }

    /**
     * 단일 책임 원칙 위배
     * 면적을 이미 계산하는 메서드가 있으면서 면적을 인치로 변환하는 메서드를 생성했다.
     *
     * 별도의 클래스로 분리하여 단일 책임 원칙 보장한다. (AreaConverter.java)
     */
    @Deprecated
    public double metersToInches(int area) {
        return area / INCH_TERM;
    }
}
