package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Handler extends Configurari {

    Connection dbConnection;

    public Connection getConnection() {
        String connectionString = "jdbc:mysql://" + Configurari.dbhost + ":" + Configurari.dbport + "/" + Configurari.dbname + "?useSSL=false";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection = DriverManager.getConnection(connectionString, Configurari.dbuser, Configurari.dbpassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return dbConnection;
    }
}
