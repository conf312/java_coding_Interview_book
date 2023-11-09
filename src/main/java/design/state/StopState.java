package design.state;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("시스템이 정지 상태입니다.");
        context.setState(this);
    }

    public String toString() {
        return "정지 상태";
    }
}
