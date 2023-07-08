/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rounak
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {public static Connection ConnecrDb(){
        try{
           Class.forName("oracle.jdbc.driver.OracleDriver.JDBC");
           Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","c##scott","tiger");
           //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        return null;

     //static Connection ConnecrDb() {
       
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    //Connection conn=null;
    
    /*public static Connection ConnecrDb(){
        try{
           Class.forName("oracle.jdbc.driver.OracleDriver.JDBC");
           Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","c##scott","tiger");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}*/
