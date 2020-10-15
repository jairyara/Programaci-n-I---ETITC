import java.util.Scanner;

public class Dos {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String name = scanner.nextLine();

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            System.out.print(" ");
        }
    }
}