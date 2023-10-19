package solid.dip;

public class Main {
    public static void main(String[] args) {
        ConnectionToDatabase connectionToDatabase = new ConnectionToDatabase();
        PostgreSQLJdbcUrl postgreSQLJdbcUrl = new PostgreSQLJdbcUrl("Toy");
        MySQLJdbcUrl mySQLJdbcUrl = new MySQLJdbcUrl("Toy");
        connectionToDatabase.connect(postgreSQLJdbcUrl);
        connectionToDatabase.connect(mySQLJdbcUrl);
    }
}
