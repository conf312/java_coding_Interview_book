package solid.dip;

public class PostgreSQLJdbcUrl implements JdbcUrl {
    private final String dbName;

    public PostgreSQLJdbcUrl(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public String get() {
        return "jdbc:postgresql://..." + this.dbName;
    }
}
