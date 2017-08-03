/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class koneksidb {

    private Connection con;
    String UserName = "root";
    String Password = "root";
    String Driver = "Com.Mysql.jdbc.Driver";
    String Url = "jdbc:mysql://localhost:3306/ayemtentrem";

    public koneksidb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.err.print("koneksi dengan database gagal");
            System.err.println(e.getException());
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ayemtentrem?" + "user=root&password=");
            System.out.print("koneksi berhail");
        } catch (SQLException e) {
            System.out.println("ID dan Password anda gagal " + e.getMessage());
        }
    }

    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    public void setCon(Connection con) {
        this.con = con;
    }

}
