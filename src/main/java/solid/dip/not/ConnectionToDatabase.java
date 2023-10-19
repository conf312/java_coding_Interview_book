package solid.dip.not;

public class ConnectionToDatabase {
    public void connect(PostgreSQLJdbcUrl postgreSQLJdbcUrl) {
        System.out.println("Connection to " + postgreSQLJdbcUrl.get());
    }
}
