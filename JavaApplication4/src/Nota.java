import java.util.Scanner;
public class Nota {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float a=0,b=0,c=0,d=0;
        
        System.out.println("ingrese la primera nota: ");
        a=in.nextFloat();        
        System.out.println("Ingrese la segunda nota: ");
        b=in.nextFloat();        
        System.out.println("Ingrese la tercera nota: ");
        c=in.nextFloat();
        if(a>=0&&a<=5&&b>=0&&b<=5&&c>=0&&c<=5){
            d=(a+b+c)/3;
            if(d>=4.5&&d<=5){
                System.out.println("Excelente");
            }else if (d>=4&&d<=4.4){
                System.out.println("Felicitaciones");
            }else if (d>=3.5&&d<=3.9){
                System.out.println("sobresaliente");
            }else if(d>=3&&d<=3.4){
                System.out.println("Aceptable");
            }else{
                System.out.println("Perdio");
            }
        }else {
            System.out.println("las notas son de 1.0 a 5.0");
        }            
    }  
}
