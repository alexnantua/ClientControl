package clientcontrol.BD;

import java.sql.*;

public class CriaConexao {

    //public static String stringCon = "jdbc:sqlserver://52.67.253.249;databaseName=ClientControl;user=alexnantua;password=357900";
    
    private static String URL = "jdbc:sqlserver://babyhost.ddns.net;"
            + "databaseName=ClientControl";
    private static String usuario = "alexnantua";
    private static String password = "357900";
    private static String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public static Connection getConexao() throws SQLException {
        try {
            Class.forName(DRIVER);
            System.out.println("Conectado ao banco!");
            Connection con = DriverManager.getConnection(URL, usuario, password);

            return con;

        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
    }
}
