import java.util.Scanner;

public class PuntoDos {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        Scanner texts = new Scanner(System.in);


        boolean exit = false;


        while (!exit) {

            System.out.println("Indique el tipo de substring que quiere ver");
            System.out.println("1. Substring desde una posición determinada hasta el final del string");
            System.out.println("2. Substring especificando comienzo y fin");
            System.out.println("3. Salir");

            int option = numbers.nextInt();

            String subStr;

            String strings;

            switch (option) {

                case 1:

                    System.out.println("Ingrese su nombre completo");

                    strings = texts.nextLine();

                    System.out.println("Ingrese el número de caracteres a extraer del substring");

                    int number = numbers.nextInt();

                    subStr = strings.substring(number);

                    System.out.println("El contenido del substring es " + subStr);

                    break;

                case 2:

                    System.out.println("Ingrese su nombre completo");

                    strings = texts.nextLine();

                    System.out.println("Ingrese el número inicial para extraer del substring");

                    int start = numbers.nextInt();

                    System.out.println("Ingrese el número final para extraer del substring");

                    int end = numbers.nextInt();

                    subStr = strings.substring(start, end);

                    System.out.println("El contenido del substring es " + subStr);

                    break;

                case 3:
                    exit = true;
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Ingrese un valor válido");

            }

        }
    }

}
