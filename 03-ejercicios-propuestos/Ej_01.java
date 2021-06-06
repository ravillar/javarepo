import java.util.*;

public class Ej_01{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros a multiplicar...");
        System.out.print("Ingrese a: ");
        int a = scan.nextInt();
        System.out.print("Ingrese b: ");
        int b = scan.nextInt();
        System.out.printf("Multiplicación de a por b: %d * %d = %d%n", a, b, multiplicar(a, b) );
        scan.close();
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
}
