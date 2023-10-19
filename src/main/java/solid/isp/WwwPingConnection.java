package solid.isp;

public class WwwPingConnection implements HttpConnection {
    private final String www;

    public WwwPingConnection(String www) {
        this.www = www;
    }

    @Override
    public void connect() {
        System.out.println("connect");
    }

    @Override
    public void http() {
        System.out.println("http");
    }
}
