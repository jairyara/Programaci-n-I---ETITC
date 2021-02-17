import javax.swing.*;

/**
 * Objeto Conductor
 * Hereda de usuario atributos en común y se establecen atributos complementarios
 */
public class Conductor extends Usuario {

    //Atributos
    private int edad;
    private int numerobus;
    private String turno;

    //Método constructor
    public Conductor(String nombre, int edad, int numerobus, String  turno) {
        super(nombre);
        this.edad = edad;
        this.numerobus = numerobus;
        this.turno = turno;
    }

    public void mayorQue() {
        if (getEdad() > 40) {
           String mayor = "El conductor " + getNombre() + " es mayor de 40 años";
            JOptionPane.showMessageDialog(null, mayor);
        }
    }

    public String mostrarBusHorario() {
        String busTurno = "El bus No. " + getNumero() + " está asignado al conductor " + getNombre() + " con el turno " + getTurno();
        return busTurno;
    }

    //Métodos get y set
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {this.edad = edad; }

    public int getNumero() {return numerobus; }

    public String getTurno() {return  turno; }

    public boolean esMayorQue(Conductor c) {
        if (this.edad > c.edad) {
            return true;
        } else if (this.edad == c.edad) {
            return true;
        } else {
            return this.edad == c.edad;
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Registro Conductor");
        sb.append("\n Nombre: ");
        sb.append(getNombre());
        sb.append("\n Edad: ");
        sb.append(getEdad());
        sb.append("\n Numero de bus: ");
        sb.append(getNumero());
        sb.append("\n Turno: ");
        sb.append(getTurno());
        sb.append("\n------------------------\n");
        return sb.toString();
    }

    private int setEdad() {
        return 0;
    }
}
