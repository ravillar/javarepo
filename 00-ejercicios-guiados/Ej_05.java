import java.util.*;
public class Ej_05{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in); 
       int continuar = 1;
       while(continuar==1){
           procesar();
           System.out.println("Si desea continuar presione 1, sino cualquier otro numero" );
           continuar = scan.nextInt();
       }
       scan.close();
       
    }    
    public static void procesar(){
       Scanner scan = new Scanner(System.in); 
       int nro;
       System.out.println("Por favor ingrese un numero: " );
       nro = scan.nextInt();
       for(int i=1; i<=10; i++){
            System.out.println(nro + " * " + i + " = " + (nro * i) );
       }
    }
}


