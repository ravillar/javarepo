

import java.util.*;

public class Ej_08{
    public static void main(String[] args) {
        System.out.println("Ingrese los datos solictados por favor. ");
        procesar();
    }
    public static void procesar(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nombre y Apellido: ");
        String nombre = scan.nextLine();
        System.out.print("Edad: ");
        String edad = scan.nextLine();
        System.out.print("Dirección: ");
        String direccion = scan.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = scan.nextLine();
        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombre);
        scan.close();
    }
}
