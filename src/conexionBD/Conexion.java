
package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SC
 */
public class Conexion {
    Connection conn;
    public Conexion(){
        
    }    

    public Connection Conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_final","root","");
            if (conn != null) {
                System.out.println("Conexion Exitosa a La BD");
              
                
            }else{
                System.out.println("Conexion  no Exitosa a La BD");   
                
            }
               
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error de Conexion a la BD:" + e);  
        }
        return conn;
//To change body of generated methods, choose Tools | Templates.
    }
    
}
