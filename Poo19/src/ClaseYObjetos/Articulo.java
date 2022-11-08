package ClaseYObjetos;

import javax.swing.JOptionPane;

public class Articulo {

    double articulo;
    double cantidad;
    double iva;
    int metodo;
    double efectivo;
    double debito;
    double credito;
    double total;

    public void leerDatos() {
        articulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio unitario del articulo: "));
        if (articulo != 0) {
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de articulos: "));
            if (cantidad != 0) {
                iva = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el iva entre 1 al 100"));
                if (iva >= 1 && iva <= 100) {
                    total = (articulo * cantidad);
                    total = (total) * ((iva * 0.01) + 1);
                    metodo = Integer.parseInt(JOptionPane.showInputDialog("1. pago en efectivo\n2. pago con tarjeta debito\n3. pago con tarjeta credito"));
                    if (metodo >= 1 && metodo <= 3) {
                        switch (metodo) {
                            case 1:
                                efectivo = total + (total * -0.15);
                                System.out.println("El total del pago en efectivo es de: $" + efectivo);
                                break;
                            case 2:
                                debito = total + (total * -0.1);
                                System.out.println("El total del pago con debito es de: $" + debito);
                                break;
                            case 3:
                                credito = total + (total * -0.05);
                                System.out.println("El total del pago con credito es de: $" + efectivo);
                                break;
                            default:
                                break;
                        }
                    } else {
                        System.out.println("El metodo solo tiene la opcion del 1 al 3.");
                    }
                } else {
                    System.out.println("El iva tiene que ser mayor a 1 y menor de 100.");
                }
            } else {
                System.out.println("El articulo tiene que ser mayor a 0.");
            }
        } else {
            System.out.println("La cantididad tiene que ser mayor que 0.");
        }
    }
}
