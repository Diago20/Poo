import java.util.Scanner;
public class Celular {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double a,b,c,iva=1.19,total=0;
        System.out.println("calcular el precio del celular con y sin iva.\n");
        System.out.println("Ingrese la marca de celular: ");
         String marca=in.nextLine();
        System.out.println("Ingrese el valor del celular: ");
        a=in.nextDouble();
        System.out.println("precione :\n"
                + "1 para pago en efectivo\n"
                + "2 para pago con tarjeta devito\n"
                + "3 para pago con tarjeta de credito\n"
                + "4 para pago con efectico y tarjeta devito\n"
                + "5 para pago con efectivo y tarjeta credito");
        b=in.nextDouble();
        if(b>=1&&b<=5){
            if(b==1){
                c=((a*-0.2)+a);
                System.out.println("\nEl precio del "+marca+" sin iva es $"+c);
                c=c*iva;
                System.out.println("El precio del "+marca+" con iva es $"+c);
            }else if(b==2){
                c=((a*-0.1)+a);
                System.out.println("\nEl precio del "+marca+" sin iva es $"+c);
                c=c*iva;
                System.out.println("El precio del "+marca+" con iva es $"+c);
            }else if(b==3){
                c=((a*-0.05)+a);
                System.out.println("\nEl precio del "+marca+" sin iva es $"+c);
                c=c*iva;
                System.out.println("El precio del "+marca+" con iva es $"+c);
            }else if(b==4){
                c=((a*-0.1)+a);
                System.out.println("\nEl precio del "+marca+" sin iva es $"+c);
                c=c*iva;
                System.out.println("El precio del "+marca+" con iva es $"+c);
            }else if(b==5){
                c=((a*-0.05)+a);
                System.out.println("\nEl precio del "+marca+" sin iva es $"+c);
                c=c*iva;
                System.out.println("El precio del "+marca+" con iva es $"+c);
            }
        }else 
            System.out.println("las opciones son de 1 a 3.");
    }
}
