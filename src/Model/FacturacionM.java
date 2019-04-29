
package Model;

/**
 *
 * @author SC
 */
public class FacturacionM {
    private String nombre_u;
    private String apellido_u;
    private int id_u;
    private String fechaingreso_u;
    private String fechaengreso_u;
    private String nombre_a;
    private String apellido_a;
    private int id_a;
    private String fechaingreso_a;
    private int numero_ingreso;
    
    public FacturacionM(){
    
    }

    public FacturacionM(String nombre_u, String apellido_u, int id_u, String fechaingreso_u, String fechaengreso_u, String nombre_a, String apellido_a, int id_a, String fechaingreso_a, int numero_ingreso) {
        this.nombre_u = nombre_u;
        this.apellido_u = apellido_u;
        this.id_u = id_u;
        this.fechaingreso_u = fechaingreso_u;
        this.fechaengreso_u = fechaengreso_u;
        this.nombre_a = nombre_a;
        this.apellido_a = apellido_a;
        this.id_a = id_a;
        this.fechaingreso_a = fechaingreso_a;
        this.numero_ingreso = numero_ingreso;
        
    }

    public String getNombre_u() {
        return nombre_u;
    }

    public void setNombre_u(String nombre_u) {
        this.nombre_u = nombre_u;
    }

    public String getApellido_u() {
        return apellido_u;
    }

    public void setApellido_u(String apellido_u) {
        this.apellido_u = apellido_u;
    }

    public int getId_u() {
        return id_u;
    }

    public void setId_u(int id_u) {
        this.id_u = id_u;
    }

    public String getFechaingreso_u() {
        return fechaingreso_u;
    }

    public void setFechaingreso_u(String fechaingreso_u) {
        this.fechaingreso_u = fechaingreso_u;
    }

    public String getFechaengreso_u() {
        return fechaengreso_u;
    }

    public void setFechaengreso_u(String fechaengreso_u) {
        this.fechaengreso_u = fechaengreso_u;
    }

    public String getNombre_a() {
        return nombre_a;
    }

    public void setNombre_a(String nombre_a) {
        this.nombre_a = nombre_a;
    }

    public String getApellido_a() {
        return apellido_a;
    }

    public void setApellido_a(String apellido_a) {
        this.apellido_a = apellido_a;
    }

    public int getId_a() {
        return id_a;
    }

    public void setId_a(int id_a) {
        this.id_a = id_a;
    }

    public String getFechaingreso_a() {
        return fechaingreso_a;
    }

    public void setFechaingreso_a(String fechaingreso_a) {
        this.fechaingreso_a = fechaingreso_a;
    }

    public int getNumero_ingreso() {
        return numero_ingreso;
    }

    public void setNumero_ingreso(int numero_ingreso) {
        this.numero_ingreso = numero_ingreso;
    }
    
    
}
