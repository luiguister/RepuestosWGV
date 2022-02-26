/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.RepuestoModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Soporte
 */
public class Repuesto extends Conexion {
    
    public List<RepuestoModel> Consultar() {
        List<RepuestoModel> lista = new ArrayList<>();
        Conectar();
        try {
            PreparedStatement sentencia = cnn.prepareCall("CALL `Consultar`()");
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {
                RepuestoModel modelo = new RepuestoModel(resultado.getInt(1), 
                                                        resultado.getString(2),
                                                        resultado.getString(3), 
                                                        resultado.getInt(4), 
                                                        resultado.getString(5));
                lista.add(modelo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Desconectar();
        }
        return lista;
    }
    public void Guardar(RepuestoModel modelo) {
        Conectar();
        try {
            PreparedStatement sentencia = cnn.prepareCall("CALL `Guardar`(?,?,?,?)");
            sentencia.setString(1, modelo.getNombreRepuesto());
            sentencia.setString(2, modelo.getDescRepuesto());
            sentencia.setInt(3, modelo.getPrecioRepuesto());
            sentencia.setString(4, modelo.getFotoRepuesto());
            sentencia.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Desconectar();
        }
    }

    public void Modificar(RepuestoModel modelo) {
        Conectar();
        try {
            PreparedStatement sentencia = cnn.prepareCall("CALL `Modificar`(?,?,?,?,?)");
            sentencia.setInt(1, modelo.getIdRepuesto());
            sentencia.setString(2, modelo.getNombreRepuesto());
            sentencia.setString(3, modelo.getDescRepuesto());
            sentencia.setInt(4, modelo.getPrecioRepuesto());
            sentencia.setString(5, modelo.getFotoRepuesto());
            sentencia.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Desconectar();
        }
    }

    public void Eliminar(RepuestoModel modelo) {
        Conectar();
        try {
            PreparedStatement sentencia = cnn.prepareCall("CALL `Eliminar`(?)");
            sentencia.setInt(1, modelo.getIdRepuesto());
            sentencia.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Desconectar();
        }
    }
}
