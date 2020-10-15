import java.util.Scanner;

public class Cuatro {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String name = scanner.nextLine();
        String capitalize = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.print(capitalize);

/*
        for (int i = 0; i < name.length(); i++) {
            if (i % 2 == 0)
                System.out.print(String.valueOf(name.charAt(i)).toLowerCase());
            else
                System.out.print(String.valueOf(name.charAt(i)).toUpperCase());
        }
*/
    }
}