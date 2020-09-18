import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner key = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {

            System.out.println("Bienvenido a multi-calculadora");
            System.out.println("1. Calcular el perímetro de un cuadrado");
            System.out.println("2. Operaciones con cuatro números (Sumas y productos)");
            System.out.println("3. Suma y promedio de cuatro números");
            System.out.println("4. Calcule el valor un artìculo del supermercado");
            System.out.println("5. Salir");

            int option;
            try {
                System.out.println("Escriba la opción que desee:");

                option = key.nextInt();
                switch (option) {
                    case 1:

                        double side;
                        System.out.println("Calcular el perímetro de un cuadrado");
                        System.out.println("Ingrese la dimensión de uno de sus lados");
                        side = key.nextDouble();

                        double perimeter;
                        perimeter = side * 4;

                        System.out.println("El perímetro del cuadrado es de " + perimeter);
                        break;

                    case 2:
                        System.out.println("Ingresar cuatro números, sumar los dos primeros, multiplicar los últimos");

                        int controlCounter = 0;
                        int mySum = 0;
                        int numbers;
                        int product = 1;

                        while (controlCounter < 4) {

                            System.out.println("Ingresa un número");

                            numbers = key.nextInt();

                            if (controlCounter < 2) {
                                mySum += numbers;
                            } else {
                                product *= numbers;
                            }

                            controlCounter += 1;
                        }

                        System.out.println("La suma de los dos primeros números es de " + mySum);
                        System.out.println("El producto de los dos últimos números es de " + product);

                        break;

                    case 3:
                        System.out.println("Suma y promedio de cuatro números");

                        int number;

                        double sum = 0;

                        for (int i = 0; i < 4; i++) {
                            System.out.println("Ingresar un número");

                            number = key.nextInt();

                            sum += number;

                        }

                        double prom = 0;
                        prom = sum / 4;

                        System.out.println("La suma es de " + sum);
                        System.out.println("El promedio es de " + prom);
                        break;

                    case 4:
                        System.out.println("Cálculo del precio de un artìculo del supermercado");

                        int counter = 0;

                        int val;
                        int price;
                        int quantity;
                        int subtotal;
                        double iva;
                        double total;

                        System.out.println("¿Cuántos artìculos quiere cotizar?");

                        val = key.nextInt();


                        for(int i = 0; val > i; i++) {

                            System.out.println("Ingrese el precio del artìculo");
                            price = key.nextInt();

                            System.out.println("Ingrese la cantidad a comprar");

                            quantity = key.nextInt();

                            subtotal = price * quantity;
                            iva = subtotal * 0.19;

                            total = subtotal + iva;

                            counter += 1;

                            System.out.println("Código del producto 000" + counter + ". Valor del artículo por unidad $ " + price);
                            System.out.println("Cantidad a consultar " + quantity);
                            System.out.println("Subtotal consulta $ " + subtotal);
                            System.out.println("Valor del IVA $ " + iva);
                            System.out.println("Valor total $ " + total);
                    }

                        break;


                    case 5:
                        exit = true;
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Ingrese un valor válido");
                        break;
                }
                System.out.println("                         ");
                System.out.println("                         ");

            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número");
                key = new Scanner(System.in);
            }
        }
        System.out.println("Gracias por usar la aplicación");
    }
}