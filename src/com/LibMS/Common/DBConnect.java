/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LibMS.Common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author B.M.D.C.Bandara
 */
public class DBConnect {

    private static Connection con = null;

    public static void init() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String sql = "jdbc:mysql://localhost:3306/mydb";
        con = DriverManager.getConnection(sql, "root", "123");
    }

    public static void iud(String sql) throws ClassNotFoundException,SQLException {
        if(con == null){
            init();
        }
        con.createStatement().executeUpdate(sql);
    }
    public static ResultSet search(String sql) throws ClassNotFoundException,SQLException {
        if(con == null){
            init();
        }
        return con.createStatement().executeQuery(sql);
    }
    
    public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException,SQLException {
        if(con == null){
            init();
        }
        return con.prepareStatement(sql);
    }

    public static Connection getCon() throws ClassNotFoundException,SQLException {
        if(con == null){
            init();
        }
        return con;
    }
}
