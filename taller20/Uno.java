import java.util.Scanner;

public class Uno {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String name = scanner.nextLine();

        for (int i = 0; i <= name.length(); i++) {
            System.out.println(name.substring(0, i));
        }
    }
}