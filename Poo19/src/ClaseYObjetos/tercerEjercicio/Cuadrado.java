package ClaseYObjetos.tercerEjercicio;

import javax.swing.JOptionPane;

public class Cuadrado {

    int lado;
    int area;
    int perimetro;

    public void leerLado() {
        lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida del lado: "));
    }

    public void leerArea() {
        area = lado * lado;
    }

    public void leerPerimetro() {
        perimetro = lado * 4;
    }

    public void mostrarResultados() {
        System.out.println("El lado es: "+lado);
        System.out.println("El area del cuadrado es: " + area);
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }
}
