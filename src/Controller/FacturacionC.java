/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.FacturacionM;
import conexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author JUAN
 */
public class FacturacionC {
        Conexion con = new Conexion();
        Connection conn = con.Conectar();
        
    public static String Sql="", mensaje="";
   
    public boolean registrar( FacturacionM f){
        Sql="INSERT INTO `facturacion`(`nombre_u`, `apellido_u`, `id_u`, `fechaingreso_u`, `nombre_a`, `apellido_a`, `id_a`, `fechaingreso_a`) "
                + "VALUES (?,?,?,?,?,?,?,?)";
        mensaje=" Datos de Ingreso Correctos ";
        
        PreparedStatement pst;
                try {
            pst=conn.prepareStatement(Sql);
            pst.setString(1, f.getNombre_u());
            pst.setString(2, f.getApellido_u());
            pst.setInt(3, f.getId_u());
            pst.setString(4, f.getFechaingreso_u());
            pst.setString(5, f.getNombre_a());
            pst.setString(6, f.getApellido_a());
            pst.setInt(7, f.getId_a());
            pst.setString(8, f.getFechaingreso_a());
            
            
           int respuesta= pst.executeUpdate(); 
           if(respuesta >0){
               mensaje="Ingresado ";
               return true;
           }else return false;
        } catch (SQLException e) {
            
            mensaje="Error 002: " + e.getMessage();// Mensaje de error de registro de datos 
            return false;
            
        }
        
    }
    
}
