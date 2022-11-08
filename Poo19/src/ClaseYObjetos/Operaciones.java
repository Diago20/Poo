package ClaseYObjetos;

import javax.swing.JOptionPane;

public class Operaciones {

    int number1;
    int number2;
    int sum;
    int reduce;
    int multiplication;
    int divice;

    public void leerNumbers() {
        number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    }

    public void sum() {
        sum = number1 + number2;
    }

    public void reduce() {
        reduce = number1 - number2;
    }

    public void multiplication() {
        multiplication = number1 * number2;
    }

    public void divice() {
        divice = number1 / number2;
    }

    public void mostrarResultados() {
        System.out.println("La suma es: " + sum);
        System.out.println("La resta es: " + reduce);
        System.out.println("La multiplicacion es: " + multiplication);
        System.out.println("La divicion es: " + divice);
    }

}
