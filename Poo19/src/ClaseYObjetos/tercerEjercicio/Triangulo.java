package ClaseYObjetos.tercerEjercicio;

import javax.swing.JOptionPane;

public class Triangulo {

    int lado1;
    int lado2;
    int base;
    int isoceles;
    int equilatero;
    int escaleno;

    public void leerLados() {
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite la base del triangulo: "));
        lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un lado del triangulo: "));
        lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un lado del triangulo: "));
    }

    public void leerEscaleno() {
        if (base != lado1 && base != lado2 && lado1 != lado2) {
            System.out.println("El trinagilo no es equilatero");
            System.out.println("El triangulo no es isoceles");
            System.out.println("El trinagulo es escaleno.");

        } else {
            System.out.println("El triangulo no es escaleno.");            
        }
    }

    public void leerEquilatero() {
        if (base == lado1 || base == lado2) {
            if (lado1 == lado2) {
                System.out.println("El triangulo no es isoceles");
                System.out.println("EL triangulo es equilatero.");                
            }else{
                System.out.println("EL triangulo no es equilatero.");
                System.out.println("En triangulo es isoceles.");                
            }
        }else if (lado1==lado2){
            System.out.println("El triangulo no es equilatero.");
            System.out.println("El triangulo es isoceles.");
        }
    }

    public void mostrarResultados() {
        System.out.println(escaleno);
    }

}
