/**
 * Objeto persona
 * Hereda de usuario atributos en común y se establecen atributos complementarios
 */
public class Persona extends Usuario {

    //Atributos
    private int edad;
    private String profesion;
    private String hobbies;

    //Método constructor
    public Persona(String nombre, long dni, String direccion, long telefono, String correo, int edad, String profesion, String hobbies) {
        super(nombre, dni, direccion, telefono, correo);
        this.edad = edad;
        this.profesion = profesion;
        this.hobbies = hobbies;
    }

    //Métodos get y set
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Registro persona");
        sb.append("\n Nombre: ");
        sb.append(getNombre());
        sb.append("\n DNI: ");
        sb.append(getDni());
        sb.append("\n Dirección: ");
        sb.append(getDireccion());
        sb.append("\n Teléfono: ");
        sb.append(getTelefono());
        sb.append("\n Correo: ");
        sb.append(getCorreo());
        sb.append("\n Edad: ");
        sb.append(getEdad());
        sb.append("\n Profesión: ");
        sb.append(getProfesion());
        sb.append("\n Hobbies: ");
        sb.append(getHobbies());
        sb.append("\n------------------------\n");
        return sb.toString();
    }
}
