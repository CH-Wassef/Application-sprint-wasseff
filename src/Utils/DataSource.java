package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
    public static DataSource data;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/produit";
    private String user = "root";
    private String pwd = "";

    public DataSource() {
        try {
            connection = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException E) {
            System.out.println(E);
        }
    }

    public static DataSource dataSource;

    public static DataSource getInstance() {
        if (dataSource == null)
            dataSource = new DataSource();
        return dataSource;
    }

    public Connection getConnection() {
        return connection;
    }
}
