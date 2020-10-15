import java.util.Scanner;

public class PuntoUno {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);

        System.out.println("Validación de dos strings");

        System.out.println("Ingrese la primera frase");

        String str1 = text.nextLine();

        System.out.println("Ingrese la segunda frase");

        String str2 = text.nextLine();

        if(str1==str2) {
            System.out.println("Str1 y str2 son los mismos objetos");
        }else {
            System.out.println("Str1 y str2 son DISTINTOS objetos");
        }
        if(str1.equals(str2)){
            System.out.println("str1 y str2 tienen el mismo contenido");
        }else {
            System.out.println("str1 y str2 tienen distinto contenido");
        }

    }
}
