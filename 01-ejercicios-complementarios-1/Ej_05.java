
import java.util.*;

public class Ej_05{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese dos números multiplicar por favor: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int m = multiplicar(a, b);
        System.out.println(a + " * " + b + " = " + m);
        scan.close();
    }
    public static int multiplicar(int a, int b){
        int m=0;
        for(int i=1; i<=b; i++){
            m+=a;
        }
        return m;
    }
}
