import java.util.*;

public class Ej_02{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int continuar = 1;
       while(continuar==1){
           procesar();
           System.out.println();
           System.out.println("Si desea continuar presione 1, sino cualquier otro numero" );
           continuar = scan.nextInt();
       }
       scan.close();
    }

    public static void procesar(){
       Scanner scan = new Scanner(System.in);
       int a;
       int b;
       int c;
       System.out.println("Ingrese el primer numero: " );
       a = scan.nextInt();
       System.out.println("Ingrese el segundo numero: " );
       b = scan.nextInt();
       System.out.println("Ingrese el tercer numero: " );
       c = scan.nextInt();
       System.out.println("El primer nro ingresado es: " + a);
       System.out.println("El segundo nro ingresado es: " + b);
       System.out.println("El tercer nro ingresado es: " + c);
    }
} 
