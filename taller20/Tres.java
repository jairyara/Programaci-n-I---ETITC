import java.util.Scanner;

public class Tres {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String name = scanner.nextLine();

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
    }
}