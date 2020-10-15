import java.util.Scanner;

public class PuntoCuatro {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        Scanner texts = new Scanner(System.in);

        System.out.println("Ingrese su nombre");

        String name = texts.nextLine();

        String subStr = name.substring(0,7);

        String user = subStr.replaceAll(" ","");

        System.out.println("Su user name es " + user );

        System.out.println("Ingrese su correo");

        String str1 = texts.nextLine();

        System.out.println("Confirme su correo");

        String str2 = texts.nextLine();

        if(str1==str2) {
            System.out.println("Correo duplicado");
        }else {
            System.out.println("Correo verificado");
        }
        if(str1.equals(str2)){
            System.out.println("Los correos coinciden");
        }else {
            System.out.println("Los correos no coinciden");
        }

        int value = 0;

        System.out.println("Ingrese su número de documento");

        value = numbers.nextInt();

        String str0 = "     " + String.valueOf(value) + "    ";

        System.out.println(str0);

        System.out.println("Quitando espacios");

        String str3 = str0.trim();

        System.out.println("Su número de documento es: " + str3);

    }

}
