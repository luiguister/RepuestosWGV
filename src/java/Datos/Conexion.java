/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Soporte
 */
public class Conexion {

protected Connection cnn;  

protected void Conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/repuesto", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    protected void Desconectar() {
        try {
            cnn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
