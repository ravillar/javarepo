import java.util.*;

public class Ej_03{
    public static void main(String[] args) {
        List<Integer> baraja= new ArrayList<Integer>();

        baraja.add(1);
        baraja.add(2);
        baraja.add(3);
        baraja.add(4);
        baraja.add(5);
        baraja.add(6);
        baraja.add(7);
        baraja.add(10);
        baraja.add(11);
        baraja.add(12);
        
        System.out.println("\nOrden ascendente... ");
        printbaraja(baraja);
        System.out.println("\nOrden descendente... " );
        Collections.reverse(baraja);
        printbaraja(baraja);
        System.out.println("\nOrden aleatorio... " );
        Collections.shuffle(baraja);
        printbaraja(baraja);

    }
    public static void printbaraja(List baraja){
        for(int i= 0; i<baraja.size(); i++){
            System.out.println("baraja[" + i + "] = " + baraja.get(i));
        }

    }
}
