
import java.util.*;

public class Ej_06{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese dos números por favor: ");
        System.out.print("Base: ");
        int b = scan.nextInt();
        System.out.print("Exponente: ");
        int e = scan.nextInt();
        int p = potencia(b, e);
        System.out.println(b + " elevado a la " + e + " = " + p);
        scan.close();
    }
    public static int potencia(int b, int e){
        int p=1;
        for(int i=1; i<=e; i++){
            p*=b;
        }
        return p;
    }
}
