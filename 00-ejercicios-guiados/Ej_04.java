import java.util.*;
public class Ej_04{
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
       System.out.println("Ingrese un numero para obtener el dia de la semana:" );
       int dia = scan.nextInt();
       switch(dia){
           case 1:
            System.out.println("Domingo" );
            break;
           case 2:
            System.out.println("Lunes" );
            break;
           case 3:
            System.out.println("Martes" );
            break;
           case 4:
            System.out.println("Miercoles" );
            break;
           case 5:
            System.out.println("Jueves" );
            break;
           case 6:
            System.out.println("Viernes" );
            break;
           case 7:
            System.out.println("Sabado" );
            break;
       }
    }
}

