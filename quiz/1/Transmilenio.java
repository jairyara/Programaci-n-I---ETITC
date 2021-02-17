import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Transmilenio
 * El ejercicio propuesto es un registro de conductores para la empresa de Transmilenio que muestre su turno y los conductores
 * mayores de 40 años
 *
 * @author Edinson Jair Yara Rueda y Miguel David Ruiz Sánchez
 * @version 1.0
 * @date 25-11-2020
 */
public class Transmilenio {
    /**
     * Método principal
     *
     * @param args
     */
    public static void main(String[] args) {

        List<Conductor> conductor = new ArrayList<>();
        int n;
        int c = 0;

        JOptionPane.showMessageDialog(null, "Bienvenido al registro de conductores");
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de conductores a registrar"));

        int mayores = 0;

        do{
            String nombres = JOptionPane.showInputDialog("Ingrese el nombre del conductor");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona"));
            int numerobus = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de bus"));
            String turno = JOptionPane.showInputDialog("Ingrese el caracter de Turno");
            if (edad >=40){
                mayores++;
            }
            switch (turno){

                case "a":
                    turno = "Horario de 6:00am - 12:00m";
                    break;

                case "b":

                    turno = "Horario de 12:00m - 18:00pm";
                    break;

                case "c":
                    turno = "Horario de 18:00pm - 24:00pm";
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Ingrese un turno correcto");
            }

            Conductor conductores = new Conductor(nombres, edad, numerobus, turno);
            conductor.add(conductores);

            JOptionPane.showMessageDialog(null, "Persona creada correctamente");

            String mostrar = "";

            for (Conductor x : conductor) {
                x.mayorQue();
                mostrar = x.mostrarBusHorario();
            }
            JOptionPane.showMessageDialog(null, mostrar);
            System.out.println(conductores.toString());
            c++ ;
        }while (n>c);
    }
}
