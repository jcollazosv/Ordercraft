/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Lenovo
 */
public class conexionMysql {
    
    Connection cn;
        public Connection conectar(){
             try {
         Class.forName("com.mysql.jdbc.Driver");
         cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/ordercraft","root","");
         System.out.println("CONECTADO");
            } catch (Exception e){
                System.out.println("ERROR CONEXION BD"+e);
            }
            return cn;
        }

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    
}
