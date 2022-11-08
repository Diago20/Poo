import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int aux=117772;
        float a=0,b=0,mes=30,c=0,smlv=1000000;
        
        
        System.out.println("cuantos SMLV gana: ");
        a=in.nextFloat();
        System.out.println("Ingresar los dias trabajados: ");
        b=in.nextFloat();
        if(a>=0&&a<=1.9){
            c=((a*smlv)/mes)*b;
            System.out.println("Usted gana: "+"$"+c+" + tiene derecho a un aux de: $"+aux);
        }else if (a>=2){
            c=((a*smlv)/mes)*b;
            System.out.println("Usted gana: "+"$"+c+" y no tiene derecho a aux");
        }
        
    }
}
