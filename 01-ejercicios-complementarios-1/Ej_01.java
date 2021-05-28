import java.util.*;

public class Ej_01{
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre por favor: ");
        Scanner scan = new Scanner(System.in);
        String nombre = scan.nextLine();
        System.out.println("Hola "+nombre);
        scan.close();
    }
}
