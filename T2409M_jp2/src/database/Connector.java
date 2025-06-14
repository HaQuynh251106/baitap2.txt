package database;
import java.sql.*;

public class Connector {
    // các thông số kết để có thể kết nối đến csdl
    private String connectionString = "jdbc:mysql://localhost:8889/t2409m_jp";
    private   String username = "root";
    private String password = "";
    private String driver = "com.mysql.cj.jdbc.Driver";
    private Connection conn;
    private static Connector instance;

    private Connector() {
        // tạo kết nối tới csdl
        try {
            //kết nối tới csdl bằng url password v username
            Class.forName(driver);
            this.conn = DriverManager.getConnection(connectionString,username,password);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    public static Connector getInstance() {
        if (instance == null) {
            instance = new Connector();
        }
        return instance;
    }

    public PreparedStatement preparedStatement(String sql)throws SQLException {
        return conn.prepareStatement(sql);
    }
}
