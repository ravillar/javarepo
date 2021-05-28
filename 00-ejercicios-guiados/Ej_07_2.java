import java.util.*;

public class Ej_07_2{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int continuar = 1;
       int a;
       int b;
       int c;
       while(continuar==1){
           System.out.println("Ingrese el primer numero :" );
           a = scan.nextInt();
           System.out.println("Ingrese el segundo numero :" );
           b = scan.nextInt();
           System.out.println("Ingrese el tercer numero :" );
           c = scan.nextInt();
           System.out.println("El primer nro ingresado es: " + a);
           System.out.println("El segundo nro ingresado es: " + b);
           System.out.println("El tercer nro ingresado es: " + c);
           System.out.println();
           System.out.println("Si desea continuar presione 1, sino cualquier otro numero" );
           continuar = scan.nextInt();
       }
       scan.close();

    }

} 
