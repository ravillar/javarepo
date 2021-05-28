import java.util.*;

public class Ej_01{
    public static void main(String[] args) {
        procesar();
    }
    public static void procesar(){

        System.out.println("Ingrese sus ciudades favoritas por orden de preferencia (ingrese 1 para terminar): ");
        Scanner scan = new Scanner(System.in);
        String ciudad;
        List<String> ciudades= new ArrayList<String>();
        do{
            ciudad = scan.nextLine();
            ciudades.add(ciudad);
        }while(!ciudad.equals("1"));
        scan.close();
        ciudades.remove(new String("1"));
        for(int i= 0; i<ciudades.size(); i++){
            System.out.println("#" + ( i+1 ) + " - " + ciudades.get(i));
        }
    }
}
