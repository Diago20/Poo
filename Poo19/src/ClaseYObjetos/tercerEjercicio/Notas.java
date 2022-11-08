package ClaseYObjetos.tercerEjercicio;

import javax.swing.JOptionPane;

public class Notas {

    double nota1;
    double nota2;
    double nota3;
    double promedio;

    public void leerNotas() {
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota 'las nota son de 0 a 5':"));
        if (nota1 >= 0 && nota1 <= 5) {
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota 'las nota son de 0 a 5': "));
            if (nota2 >= 0 && nota2 <= 5) {
                nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera nota 'las nota son de 0 a 5': "));
                if (nota3 >= 0 && nota3 <= 5) {
                    promedio = (nota1 + nota2 + nota3) / 3;
                } else {
                    System.out.println("Las notas son de '0 a 5'");
                }
            } else {
                System.out.println("Las notas son de '0 a 5'");
            }
        } else {
            System.out.println("Las notas son de '0 a 5'");
        }
    }

    public void leerDefinitiva() {
        if (promedio >= 4.5 && promedio <= 5) {
            System.out.println("Felicitaciones tu nota es: " + promedio);
        } else if (promedio >= 4 && promedio <= 4.4) {
            System.out.println("Su nota es excelente aprovaste con: " + promedio);
        } else if (promedio >= 3 && promedio <= 3.9) {
            System.out.println("su nota es aceptable aprovaste con: " + promedio);
        } else if (promedio >= 1 && promedio <= 2.9) {
            System.out.println("perdiste la asignatura con: " + promedio);
        } else if (promedio >= 0 && promedio <= 0.9) {
            System.out.println("mijo, eso no es lo suyo");
        }
    }
}
