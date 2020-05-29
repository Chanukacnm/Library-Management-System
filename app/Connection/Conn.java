package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conn {

    public Connection connection;
    public Connection  getConnection(){

        String dbName = "westministerlibrary";
        String userName ="root";
        String password ="";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            connection=DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,userName,password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return connection;
    }
}

