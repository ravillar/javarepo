import java.util.*;

public class Ej_02{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número entero para calcular su factorial... ");
        long n = scan.nextLong();
        System.out.printf( "El factorial de %d es: %d %n", n, factorial(n) );
        scan.close();
    }
    public static long factorial(long n){
        if(n==1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
}
