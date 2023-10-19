package solid.isp.not;

public class WwwPingConnection implements Connection {
    private final String www;

    public WwwPingConnection(String www) {
        this.www = www;
    }

    // 인터페이스 분리 원칙 위배
    // 해당 클래스에 socket 메서드가 필요하지 않지만 강제로 재정의 해야한다.
    @Override
    public void socket() {
    }

    @Override
    public void http() {
        System.out.println("http");
    }

    @Override
    public void connect() {
        System.out.println("connect");
    }
}
