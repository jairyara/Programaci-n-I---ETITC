/**
 * Objeto Usuario
 * El presente objeto guarda las características que comparte con los demàs usuarios - Se heredará a los objetos persona y empresa
 */
public class Usuario {

    //Atributos
    private String nombre;
    private long dni;
    private String direccion;
    private long telefono;
    private String correo;

    //Método constructor
    public Usuario(String nombre, long dni, String direccion, long telefono, String correo) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    //Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
