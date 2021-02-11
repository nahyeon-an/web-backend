package org.edwith.webbe.guestbook.util;

import java.sql.*;

public class DBUtil {
    public static Connection getConnection(){
        return getConnection("jdbc:mysql://localhost:3306/project_b?serverTimezone=Asia/Seoul&useSSL=false&useUnicode=yes&characterEncoding=UTF-8","projectuser","projuser123!@#");
    }

    public static Connection getConnection(String dbURL, String dbId, String dbPassword){
    	try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, dbId, dbPassword);
            return conn;
        }catch(Exception ex){
            throw new RuntimeException("Connection Error");
        }
    }
}
