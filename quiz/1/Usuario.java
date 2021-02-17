/**
 * Objeto Usuario
 * El presente objeto guarda las características que comparte con los demàs usuarios - Se heredará a los objetos persona y empresa
 */
public class Usuario {

    //Atributos
    private String nombre;

    //Método constructor
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    //Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
