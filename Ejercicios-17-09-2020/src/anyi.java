import javax.swing.JOptionPane;


public class anyi {

    public static void main(String[] args) {

        /*Realizar la carga del lado de un cuadrado, mostrar por pantalla el perÃ­metro del mismo (El perÃ­metro de un cuadrado se calcula multiplicando el valor del lado por cuatro
         */
        int lado;
        int perimetro;

        lado = Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese un lado del cuadrado"));

        perimetro = lado * 4;
        JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es " + perimetro);

        /*


Escribir un programa en el cual se ingresen cuatro nÃºmeros, calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto.

         */
        int num1;
        int num2;
        int num3;
        int num4;
        int suma;
        int producto;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese el segundo numero"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese el tercer numero"));
        num4 = Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese el cuarto numero"));

        suma = num1 + num2;
        producto = num3 * num4;
        JOptionPane.showMessageDialog(null, "La suma de los dos primeros numeros es " + suma);
        JOptionPane.showMessageDialog(null, "La multiplicaciÃ³n de los Ãºltimos dos nÃºmeros es " + producto);

        /*
        Realizar un programa que lea cuatro valores numÃ©ricos e informar su suma y promedio.
         */
        int valor1;
        int valor2;
        int valor3;
        int valor4;
        int sumaValor;
        float promedio;

        valor1 = Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese el primer valor"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese el segundo valor"));
        valor3 = Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese el tercer valor"));
        valor4 = Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese el cuarto valor"));

        sumaValor = valor1 + valor2 + valor3 + valor4;
        promedio = suma / 4;

        JOptionPane.showMessageDialog(null, "La suma de los valores es" + sumaValor);

        JOptionPane.showMessageDialog(null, "El promedio de los valores es" + promedio);

        /*
     Se debe desarrollar un programa que pida el ingreso del precio de un artÃ­culo y la cantidad que lleva el cliente. Debe desplegar el valor de la compra, el valor iva, el valor neto a pagar
         */
        double precio;
        double paga;
        double neto;
        double iva;


        precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto"));
        paga = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor pagado"));

        iva = (19 * precio) / 100;
        neto = precio + iva;

        JOptionPane.showMessageDialog(null, "El valor de la compra es " + precio + "\nel valor del iva es " + iva + "\n El valor neto a pagar es " + neto);

    }

}
