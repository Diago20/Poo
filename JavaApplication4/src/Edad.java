import java.util.Scanner;
public class Edad {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int a=0;
        System.out.println("Que edad tienes: ");
        a=in.nextInt();
        
        if(a>=18)
            System.out.println("Ya eres mayor de edad.");
        else
            System.out.println("Eres menor de edad");
        System.out.println(" ");
        System.out.println("Fin.");
        
    }
}
