package ClaseYObjetos.tercerEjercicio;

import javax.swing.JOptionPane;

public class Articulo {

    int articulo;
    int precio;
    double iva;
    int metodo;
    double total;
    double total1;

    public void leerDatos() {
        articulo = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de articulos"));
        if (articulo != 0) {
            precio = Integer.parseInt(JOptionPane.showInputDialog("Diguite el precio unitario del producto: "));
            if (precio != 0) {
                iva = Integer.parseInt(JOptionPane.showInputDialog("Diguite el iva del la venta:"));
                if (iva >= 1 && iva <= 100) {
                    metodo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el metodo de pago"
                            + "\n1. efectivo"
                            + "\n2. tarjeta devito"
                            + "\n3. tarjeta credito.\n"));
                    if (metodo >= 1 && metodo <= 3) {

                    } else {
                        System.out.println("Las opciones son de 1 a 3.");
                    }

                } else {
                    System.out.println("El valor ingresado no es el adecuado.");
                }
            } else {
                System.out.println("El precio no puede ser nulo.");
            }
        } else {
            System.out.println("El articulo tiene que ser mayor a 0");
        }
    }

    public void leerTotal() {
        total = (articulo * precio);
        total1 = total * ((iva * 0.01) + 1);
    }

    public void leerMetodo() {
        switch (metodo) {
            case 1:
                total = total1 + (total1 * -0.15);
                System.out.println("El total a pagar en efectivo es de: $" + total
                        + "\n con un descuentode de: " + (total - total1));
                break;
            case 2:
                total = total1 + (total1 * -0.1);
                System.out.println("El total a pagar con la tarjeta debito es de: $" + total1
                        + "\n con un descuentode de: " + (total - total1));
                break;
            case 3:
                total = total + (total * -0.05);
                System.out.println("El total a pagara con la tejeta de credito es de: $" + total
                        + "\n con un descuentode de: " + (total - total1));
                break;
        }

    }
}
