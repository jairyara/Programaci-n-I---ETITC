import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import javax.swing.*;


public class Numeros {

    static int[] numero = new int[20];

    public static void main(String... args) {
        recolectarNumeros();
        comprobarMenorMayor();
        suma();
        paresImpares();
        positivoNegativo();
        multiplos();
        primos();
    }

    //Método para recolectar los números
    public static void recolectarNumeros() {
        int dato = 0;
        int contador = 0;

        while (contador < numero.length) {

            dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            if (!repetir(numero, dato)) {
                numero[contador] = dato;
                contador++;
                System.out.println("Número registrado " + contador + ": " + dato);
            }
        }
        System.out.println("---------------------- \n");
    }

    //Método para comprobar si el número ingresado está repetido
    private static boolean repetir(int[] arr, int data) {
        for (int j : arr) {
            if (j == data) {
                JOptionPane.showMessageDialog(null, "Número repetido");
                return true;
            }
        }
        return false;
    }

    //Método para comprobar el menor, mayor y su posición
    public static void comprobarMenorMayor() {
        int menor = numero[0];
        int mayor = numero[0];
        int posicionMin = 0;
        int posicionMax = 0;
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] < menor) {
                menor = numero[i];
                posicionMin = i;
            } else if (numero[i] > mayor) {
                mayor = numero[i];
                posicionMax = i;
            }
        }
        JOptionPane.showMessageDialog(null, "El número menor es " + menor + " y su posición es " + posicionMin);
        JOptionPane.showMessageDialog(null, "El número mayor es " + mayor + " y su posición es " + posicionMax);
    }

    //Método para calcular la suma total de los elementos del arrayimpar.size()
    public static void suma() {
        int suma = 0;
        for (int i = 0; i < numero.length; i++) {
            suma += numero[i];
        }
        JOptionPane.showMessageDialog(null, "La suma de los números ingresados es  " + suma);
    }

    //Método para comprobar cuales números son pares e impares
    public static void paresImpares() {

        List<Integer> pares = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                pares.add(numero[i]);
            } else {
                impar.add(numero[i]);
            }
        }

        System.out.println("Numeros pares");
        for (int i = 0; i < pares.size(); i++) {
            System.out.println(pares.get(i));
        }
        System.out.println("---------------------");
        System.out.println("Numeros impares");
        for (int i = 0; i < impar.size(); i++) {
            System.out.println(impar.get(i));
        }
        System.out.println("---------------------");

        JOptionPane.showMessageDialog(null, "La cantidad de numeros pares son " + pares.size());
        JOptionPane.showMessageDialog(null, "La cantidad de numeros impares son " + impar.size());
    }

    //Mètodo para comprobar si es positivo o negativo
    public static void positivoNegativo() {
        int contadorNeg = 0;
        int contadorPos = 0;
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] < 0) {
                contadorNeg++;
            } else {
                contadorPos++;
            }
        }
        JOptionPane.showMessageDialog(null, "La cantidad de numeros negativos son " + contadorNeg);
        JOptionPane.showMessageDialog(null, "La cantidad de numeros positivos son " + contadorPos);
    }

    //Métodos para comprobar si es multiplo de 5 o 7
    public static void multiplos() {
        int multSiete = 0;
        int multCinco = 0;

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 5 == 0) {
                multCinco++;
            } else if (numero[i] % 7 == 0) {
                multSiete++;
            }
        }
        JOptionPane.showMessageDialog(null, "La cantidad de numeros multiplos de cinco son " + multCinco);
        JOptionPane.showMessageDialog(null, "La cantidad de numeros multiplos de siete son " + multSiete);
    }

    //Métodos para determinar si son pares y cuales son
    public static void primos() {
        List<Integer> primo = new ArrayList<>();

        for (int i = 0; i < numero.length; i++) {
            if (esPrimo(numero[i])) {
                primo.add(numero[i]);
            }
        }
        System.out.println("Números primos");
        for (int j = 0; j < primo.size(); j++) {
            System.out.println(primo.get(j));
        }
        JOptionPane.showMessageDialog(null, "La cantidad de numeros primos son " + primo.size());
    }

    //Método para comprobar si es primo
    public static boolean esPrimo(int numero) {
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (numero % x == 0)
                return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }

}