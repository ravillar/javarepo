import java.util.*;
import java.io.File;
import java.io.IOException;

public class Ej_03 {

    public static void main(String[] args) {

        try {
            leerEImpimirArchivo();
        } catch (IOException e) {
            System.out.println("Error al intentar leer el archivo");
            e.printStackTrace();
        }        
    }

    public static void leerEImpimirArchivo() throws IOException {
        File archivo = new File("alumnos.txt");
        Scanner lector = new Scanner(archivo);
        int cont = 0;
        while (lector.hasNextLine()) {
            String data = lector.nextLine();
            cont ++;
            System.out.printf("#%d - %s%n", cont, data);
        }
        lector.close();
    }

}

