import java.util.Scanner;
public class Volleyball {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b;
        String c="";
        System.out.println("Ingrese su nombre: ");
        c=in.nextLine();
        System.out.println("Ingrese la estatura: ");
        a=in.nextInt();
        System.out.println("Ingrese su peso: ");
        b=in.nextInt();
        
        if(a>=180 && b<=70){
            System.out.println(c+" Esta aprobado en el equipo. ");
        }else{
            System.out.println(c+" No esta aprobado en el equipo "+c);
        }        
    }    
}
