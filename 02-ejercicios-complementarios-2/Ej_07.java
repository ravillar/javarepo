import java.util.*;

public class Ej_07{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzBuzzFunction(1,6)));
        System.out.println(Arrays.toString(fizzBuzzFunction(1,8)));
    }
    public static String[] fizzBuzzFunction(int a, int b){
        int len = (b-a);
        String[] arr = new String[len];
        int aux ;
        for(int i=0; i<len;i++){
            aux = a + i;
            arr[i]="";
            if(aux % 2==0){
                arr[i] += "Fizz";
            }
            if(aux % 3==0){
                arr[i] += "Buzz";
            }
            if(arr[i]==""){
                arr[i] = Integer.toString(aux);
            }
        }
        return arr;
    }
    
}
