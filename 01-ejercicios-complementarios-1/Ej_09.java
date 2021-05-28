

import java.util.*;

public class Ej_09{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese los datos solicitados por favor: ");
        System.out.print("Frase o texto: ");
        String txt = scan.nextLine();
        System.out.print("Letra: ");
        int letra = scan.nextLine().charAt(0);
        System.out.println("Cantidad de ocurrencias de \"" + (char)letra + "\" en el texto: " + cantidad(txt, letra));
        scan.close();
    }
    public static int cantidad(String txt, int letra){
        int cant=0;//caracter
        for(int i = 0; i<txt.length(); i++){
            if(txt.charAt(i)==letra){
                cant+=1; 
            }
        }
        return cant;
    }
}
