/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author wilson
 */
public class dbConn {

    public static final String DB_NAME = "employpayrollmanagement";
    public static final String CONNECTION_STRING = "jdbc:mysql://localhost/" + DB_NAME;

    static Connection conn = null;

    public static Connection getConn() throws ClassNotFoundException {

        try {
//          conn = DriverManager.getConnection("jdbc:sqlite:employee.sqlite");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(CONNECTION_STRING, "root", "");
            return conn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
}
