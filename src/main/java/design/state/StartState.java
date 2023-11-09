package design.state;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("시스템이 시작상태입니다.");
        context.setState(this);
    }

    public String toString() {
        return "시작 상태";
    }
}
