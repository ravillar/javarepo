
import java.util.*;

public class Ej_04{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número para calcular su factorial por favor: ");
        int n = scan.nextInt();
        int f = factorial(n);
        System.out.println("El factorial de " + n + " es: " + f);
        scan.close();
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
}
