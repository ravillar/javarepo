import java.util.*;

public class Ej_02{
    public static void main(String[] args) {
        List<Integer> nros= new ArrayList<Integer>();
        nros.add(10);
        nros.add(20);
        nros.add(30);
        nros.add(40);
        nros.add(50);
        System.out.println("Inicialmente... " + nros.size());
        printNros(nros);
        nros.set(0,0);
        nros.add(60);
        System.out.println("Luego de la modificación... " + nros.size());
        printNros(nros);

    }
    public static void printNros(List nros){
        System.out.println("Tamaño del ArrayList: " + nros.size());
        for(int i= 0; i<nros.size(); i++){
            System.out.println("nros[" + i + "] = " + nros.get(i));
        }

    }
}
