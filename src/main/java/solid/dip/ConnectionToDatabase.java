package solid.dip;

public class ConnectionToDatabase {
    public void connect(JdbcUrl jdbcUrl) {
        System.out.println("Connection to " + jdbcUrl.get());
    }
}
