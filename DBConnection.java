package com.preethi.emp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static Connection con;
    public static Connection createDBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/employeedb?useSSL=false";
            String username="root";
            String password="preethi";
            con=DriverManager.getConnection(url,username,password);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
        return con;
    }
}
