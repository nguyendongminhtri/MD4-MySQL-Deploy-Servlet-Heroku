package chinh.com.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMySQL {
    private static Connection connection;
    private static final String URL = "jdbc:mysql://bf9ca5dc69137c:fb6e0a28@eu-cdbr-west-03.cleardb.net/heroku_a71563e8d943711?reconnect=true&characterEncoding=UTF-8";
    private static final String USER = "bf9ca5dc69137c";
    private static final String PASS = "fb6e0a28";
    public static Connection getConnection(){
        if(connection==null){
            try {
                System.out.println("URL --->"+URL);
                System.out.println("USER --->"+USER);
                System.out.println("PASS -->"+PASS);
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(URL,USER,PASS);
                System.out.println("KET NOI THANH CONG");
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println("KET NOI THAT BAI");
                throw new RuntimeException(e);
            }
        }

        return connection;
    }
}
