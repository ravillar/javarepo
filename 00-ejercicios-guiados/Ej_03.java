import java.util.*;

public class Ej_03{
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
        int nota;
        System.out.println("Ingrese un numero (nota de la evaluacion):" );
        nota = scan.nextInt();
        if(nota>92){
            System.out.println("Excelente" );
        }else if(nota > 84){
            System.out.println("Sobresaliente" );
        }else if (nota > 74){
            System.out.println("Distinguido" );
        }else if (nota > 59){
            System.out.println("Bueno" );
        }else{
            System.out.println("Desaprobado" );
        }
    }
} 
