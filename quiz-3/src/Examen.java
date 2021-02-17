import javax.swing.*;

/**
 * Clase Examen
 * Es el objeto principal donde se establecen atributos y metodos para el funcionamiento del programa
 */
public class Examen {

    //Atributos

    /**
     *
     */
    private final String estudiante;
    private final String[] materia = {"Programación I", "Inglés II", "Algebra Lineal", "TGS", "Matemáticas Discretas"};
    private final Float[] nota = new Float[5];

    /**
     * Método constructor
     *
     * @param estudiante
     */
    public Examen(String estudiante) {
        this.estudiante = estudiante;
    }

    /**
     * Método materia
     */
    public void notaMateria() {
        JOptionPane.showMessageDialog(null, "Notas del estudiante " + estudiante);
        for (int i = 0; i < 5; i++) {
            nota[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota de la materia " + materia[i]));
        }
    }

    /**
     * Método mostrar informe
     */
    public void mostrarInforme() {
        System.out.println("Estudiante: " + estudiante);
        for (int i = 0; i < 5; i++) {
            System.out.println("Nota del parcial " + materia[i] + " : " + nota[i]);
        }
        System.out.println("---------------------------------");
    }

    /**
     * Método calcularPromedio
     *
     * @return promedio
     */
    public float calcularPromedio() {
        float suma = 0;
        for (int j = 0; j < 5; j++) {
            suma += nota[j];
        }
        float promedio = suma / 5;
        return promedio;
    }

    /**
     * Métodos get
     *
     * @return
     */
    public String getEstudiante() {
        return estudiante;
    }

    public String[] getMateria() {
        return materia;
    }

    public Float[] getNota() {
        return nota;
    }
}
