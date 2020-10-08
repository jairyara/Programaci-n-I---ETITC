import java.util.*;

public class Operaciones {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double numberOne, numberTwo, result;
    System.out.println("Introduce el primer número");
    numberOne = sc.nextDouble();
    System.out.println("Introduce el segundo número");
    numberTwo = sc.nextDouble();
    result = sum(numberOne, numberTwo);
    System.out.println("Suma " + result);
    result = subtraction(numberOne, numberTwo);
    System.out.println("Resta " + result);
    result = product(numberOne, numberTwo);
    System.out.println("Multiplicación " + result);
    result = division(numberOne, numberTwo);
    System.out.println("División " + result);
  }

  public static double sum(double a, double b){
    double c;
    c = a + b;
    return c;
  }

  public static double subtraction(double a, double b){
    double c;
    c = a - b;
    return c;
  }
  public static double product(double a, double b){
    double c;
    c = a * b;
    return c;
  }

  public static double division(double a, double b){
    double c;
    c = a / b;
    return c;
  }
  
}