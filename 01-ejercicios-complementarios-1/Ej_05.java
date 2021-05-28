
import java.util.*;

public class Ej_05{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese dos números multiplicar por favor: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int s = suma(a, b);
        System.out.println(a + " * " + b + " = " + s);
        scan.close();
    }
    public static int suma(int a, int b){
        return a * b;
    }
}
