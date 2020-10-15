import java.util.Scanner;

public class PuntoTres {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        Scanner texts = new Scanner(System.in);


        boolean exit = false;


        while (!exit) {

            System.out.println("Indique la forma de conversión de string a número y viceversa");
            System.out.println("1. De número a string con función estática");
            System.out.println("2. De string a número sin espacios");
            System.out.println("3. De string a número entero");
            System.out.println("4. De string a número double");
            System.out.println("5. Salir");

            int option = numbers.nextInt();

            int value = 0;

            switch (option) {

                case 1:

                    System.out.println("Ingrese un número");

                    value = numbers.nextInt();

                    String str = String.valueOf(value);

                    System.out.println("El contenido del string str es: " + str);

                    break;

                case 2:

                    System.out.println("Ingrese un número");

                    value = numbers.nextInt();

                    String str0 = "     " + String.valueOf(value) + "    ";

                    System.out.println(str0);

                    System.out.println("Quitando espacios");

                    String str1 = str0.trim();

                    System.out.println("El contenido del string str1 es: " + str1);

                    break;

                case 3:

                    System.out.println("Ingrese un número");

                    value = numbers.nextInt();

                    String str2 ="       " +  String.valueOf(value) + "        ";

                    System.out.println(str2);

                    System.out.println("Quitando espacios y pasando a entero");

                    int number = Integer.parseInt(str2.trim());

                    System.out.println("El contenido del número es: " + number);

                    break;

                case 4:

                    System.out.println("Ingrese un número");

                    value = numbers.nextInt();

                    String str3 ="       " +  String.valueOf(value) + "        ";

                    System.out.println(str3);

                    System.out.println("Quitando espacios y pasando a double");

                    double number1 = Double.valueOf(str3).doubleValue();

                    System.out.println("El contenido del número es: " + number1);

                    break;


                case 5:
                    exit = true;
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Ingrese un valor válido");

            }

        }
    }

}