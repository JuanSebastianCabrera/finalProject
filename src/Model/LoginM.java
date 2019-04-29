
package Model;

/**
 *
 * @author SC
 */
public class LoginM {
    
    private  int usuario;
    private  String contraseña;
    
    public LoginM(){
        
    }

    public LoginM(int usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
   
}
