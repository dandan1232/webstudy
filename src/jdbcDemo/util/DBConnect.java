package jdbcDemo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据库的链接
 */

public class DBConnect {
    private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final static String URL = "jdbc:mysql://localhost:3306/db_emp?" +
            "serverTimezone=GMT&characterEncoding=utf8&useUnicode=true" +
            "useSSL=false";
    private final static String USER = "root";
    private final static String PSD = "ldd123789dd.0";

    private Connection conn = null;
    private static DBConnect dbConnect = null; //单例模式

    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 单例模式创建实例dbConnect
     *
     * @return 返回创建的单例对象dbConnect
     */
    public static DBConnect getINitDBConnect() {
        if (dbConnect == null) {
            synchronized (DBConnect.class) {
                if (dbConnect == null) {
                    dbConnect = new DBConnect();
                }
            }
        }
        return dbConnect;
    }

    /**
     * 建立链接
     *
     * @return
     */
    public Connection getConnection() {
        try {
            conn = DriverManager.getConnection(URL, USER, PSD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 关闭数据库连接
     */
    public void closeDB() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
