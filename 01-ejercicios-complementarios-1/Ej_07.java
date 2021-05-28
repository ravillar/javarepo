

import java.util.*;

public class Ej_07{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un texto por favor: ");
        String txt = scan.nextLine();
        System.out.println(mayus(txt));
        scan.close();
    }
    public static String mayus(String s){
        String ret="";
        int c;//caracter
        for(int i = 0; i<s.length(); i++){
            c=s.charAt(i);// ascii code
            System.out.println(c);
            //munúsculas  más, vocales acentuadas y ñ
            if((c>=97 && c<=122) ||(c==225 || c==233 || c == 237 || c== 243 || c == 250) || c==241){
               // pasar a mayúscula 
               ret+=(char)(c-32);
            }else{
               ret+=(char)(c);
            }
        }
        return ret;
    }
}
