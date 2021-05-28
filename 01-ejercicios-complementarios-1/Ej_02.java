
import java.util.*;

public class Ej_02{
    public static void main(String[] args) {
        System.out.println("Ingrese dos números para realizar operaciones por favor. ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primero: ");
        int a = scan.nextInt();
        System.out.println("Ingrese el segundo: ");
        int b = scan.nextInt();
        procesar(a, b);
        scan.close();
    }
    public static void procesar(int a, int b){
        System.out.println(a + " + " + b + " = " + ( a + b ) );
        System.out.println(a + " - " + b + " = " + ( a - b ) );
        System.out.println(a + " * " + b + " = " + ( a * b ) );
        System.out.println(a + " / " + b + " = " + ( a / b ) );
        System.out.println(a + " % " + b + " = " + ( a % b ) );
    }
}
