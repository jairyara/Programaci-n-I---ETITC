import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Directorio
 * El ejercicio propuesto es un menú de directorio empresarial y personas en la cual mediante la opción elegida se puede añadir información de una empresa o persona
 *
 * @author Edinson Jair Yara Rueda y Miguel David Ruiz Sánchez
 * @version 1.0
 * @date 25-11-2020
 */
public class Directorio {
    /**
     * Método principal
     *
     * @param args
     */
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        List<Empresa> empresas = new ArrayList<>();

        boolean salir = false;

        JOptionPane.showMessageDialog(null, "Bienvenido al directorio empresarial");
        while (!salir) {
            try {
                int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de una de las opciones: \n 1. Registrar empresa \n 2. Registrar persona \n 3. Salir"));

                switch (opcion) {
                    case 1:
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la empresa");
                        long dni = Long.parseLong(JOptionPane.showInputDialog("Ingrese el NIT de la empresa"));
                        String direccion = JOptionPane.showInputDialog("Ingrese la dirección de la empresa");
                        long telefono = Long.parseLong(JOptionPane.showInputDialog("Ingrese el teléfono de la empresa"));
                        String correo = JOptionPane.showInputDialog("Ingrese el correo de la empresa");
                        String sector = JOptionPane.showInputDialog("Ingrese el sector económico de la empresa");
                        String descripcion = JOptionPane.showInputDialog("Ingrese una descripción de la empresa");
                        int fundacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fundación  de la empresa"));
                        int empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));
                        Empresa empresa = new Empresa(nombre, dni, direccion, telefono, correo, sector, descripcion, fundacion, empleados);
                        empresas.add(empresa);
                        JOptionPane.showMessageDialog(null, "Empresa creada correctamente");
                        System.out.println(empresa.toString());
                        break;
                    case 2:
                        String nombres = JOptionPane.showInputDialog("Ingrese el nombre de la persona");
                        long dnis = Long.parseLong(JOptionPane.showInputDialog("Ingrese el DNI de la persona"));
                        String direcciones = JOptionPane.showInputDialog("Ingrese la dirección de la persona");
                        long telefonos = Long.parseLong(JOptionPane.showInputDialog("Ingrese el teléfono de la persona"));
                        String correos = JOptionPane.showInputDialog("Ingrese el correo de la persona");
                        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona"));
                        String profesion = JOptionPane.showInputDialog("Ingrese la profesión de la persona");
                        String hobbies = JOptionPane.showInputDialog("Ingrese los Hobbies");

                        Persona persona = new Persona(nombres, dnis, direcciones, telefonos, correos, edad, profesion, hobbies);
                        personas.add(persona);

                        JOptionPane.showMessageDialog(null, "Persona creada correctamente");

                        System.out.println(persona.toString());

                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro programa");
                        salir = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ingrese un valor válido");

                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor válido");
            }
        }
    }
}
