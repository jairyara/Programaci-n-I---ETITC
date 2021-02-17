import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Calificaciones
 * <p>
 * Programa que permite obtener las calificaciones obtenidas por n estudiantes en 5 exámenes distintos del semestre II del grupo S2D.
 * Para determinar la funcionalidad del programa se tienen en cuenta cuatro condiciones, que se presentan a continuación:
 * 1. El promedio de calificaciones de cada uno de los N estudiantes (considerando los 5 exámenes).
 * 2. El estudiante o los estudiantes que obtuvieron la mejor calificación en el tercer examen.
 * 3. El o los estudiantes, si existieran, que obtuvieron la mayor calificación en el primero y en el quinto examen.
 * 4. ¿En cuál examen fue más alto el promedio de los N estudiantes?
 *
 * @author Edinson Jair Yara Rueda  y Miguel David Ruiz Sánchez - Estudiantes de Ingeniería de Sistemas - ETITC - S2D
 * @version 1.0
 * @date 25-11-2020
 */
public class Calificaciones {

    /**
     * Método main
     *
     * @param args
     */
    public static void main(String[] args) {

        boolean salir = false;

        while (!salir) {

            try {
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de estudiantes para registrar sus notas"));

                List<Examen> examenes = new ArrayList<>();

                for (int i = 0; i < cantidad; i++) {

                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");

                    Examen examen = new Examen(nombre);
                    examen.notaMateria();
                    examenes.add(examen);
                }

                System.out.println("Tabla de notas");
                float tercerExamen = 0;
                String estudiante = "";
                String estudiantes = "";
                String destacado = "";
                float promedios = 0;

                for (Examen x : examenes) {
                    x.mostrarInforme();
                    System.out.println("El promedio de los 5 exámenes  del estudiante " + estudiante + " es " + x.calcularPromedio());

                    //Comparación para obtener los mayores resultados en la evaluación 3
                    if (tercerExamen < x.getNota()[2]) {
                        tercerExamen = x.getNota()[2];
                        estudiante = x.getEstudiante();
                    } else if (tercerExamen == x.getNota()[2]) {
                        tercerExamen = x.getNota()[2];
                        estudiante = estudiante + ", " + x.getEstudiante();
                    }

                    //Comparación para obtener los mayores resultados en la evaluación 1 y 5
                    if (tercerExamen < x.getNota()[0] && tercerExamen < x.getNota()[4]) {
                        estudiantes = x.getEstudiante();
                    } else if (tercerExamen == x.getNota()[0] && tercerExamen == x.getNota()[4]) {
                        estudiantes = estudiantes + ", " + x.getEstudiante();
                    } else {
                        estudiantes = "No hay estudiantes que cumplan la condición";
                    }

                    //Comparación de los promedios para determinar el mayor promedio de los estudiantes
                    if (promedios < x.calcularPromedio()) {
                        promedios = x.calcularPromedio();
                        destacado = x.getEstudiante();
                    } else if (promedios == x.calcularPromedio()) {
                        promedios = x.calcularPromedio();
                        destacado = destacado + ", " + x.getEstudiante();
                    }
                }

                //Impresión de datos adicionales a los impresos en el foreach
                System.out.println("La mayor calificación obtenida en el tercer examen fue por: " + estudiante + " con una nota de " + tercerExamen);
                System.out.println("La mayor calificación obtenida en el primer y quinto examen fue por: " + estudiantes);
                System.out.println("El mayor promedio en los exámenes fue obtenido por: " + destacado + " con un promedio de " + promedios);
                salir = true;
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null,"Ingrese un valor válido");
            }
        }
    }
}
