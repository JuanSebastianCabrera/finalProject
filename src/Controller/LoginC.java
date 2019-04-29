
package Controller;

import Model.LoginM;
import conexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.scene.control.PasswordField;


/**
 *
 * @author SC
 */
public class LoginC {
   
        Conexion con = new Conexion();
        Connection conn = con.Conectar();
        
    public static String Sql="", mensaje="";
   
    public boolean ingresar(LoginM l){
        Sql="SELECT * FROM `login` where usuario=? and contraseña=?";
        mensaje=" Datos de Ingreso Correctos ";
        
        PreparedStatement pst;
                try {
            pst=conn.prepareStatement(Sql);
            pst.setInt(1, l.getUsuario());
            pst.setString(2, l.getContraseña());
            
           ResultSet respuesta= pst.executeQuery(); 
           if(respuesta.next()){
               mensaje="Bienvenid@ ";
               return true;
           }else return false;
        } catch (SQLException e) {
            
            mensaje="Error 001: " + e.getMessage();// Mensaje de error en los datos de ingreso
            return false;
            
        }
        
    }
        
    
}
