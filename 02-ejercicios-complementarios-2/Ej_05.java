import java.util.*;

public class Ej_05{
    public static void main(String[] args) {
        Integer[] horas = {6, 7, 8, 4, 5};
        Integer[] valorHora = {350, 345, 550, 600, 320};
        Integer[] total = new Integer[5];
        Integer totalFinal=0;
        
        for(int i= 0; i<horas.length; i++){
            total[i] = horas[i] * valorHora[i];
            totalFinal+= total[i];
        }
        
        System.out.println("Horas: " + Arrays.toString(horas));
        System.out.println("Valor por hora: " + Arrays.toString(valorHora));
        System.out.println("Totales: " + Arrays.toString(total));
        System.out.println("Total final: $ " + totalFinal);

    }
    
}
