import java.util.*;

public class Ej_04{
    public static void main(String[] args) {
        List<String> estudiantes= new ArrayList<String>();

        estudiantes.add("Estudiante Alfa");
        estudiantes.add("Estudiante Bravo");
        estudiantes.add("Estudiante Charlie");
        estudiantes.add("Estudiante Delta");
        estudiantes.add("Estudiante Echo");
        estudiantes.add("Estudiante Foxtrot");
        estudiantes.add("Estudiante Golf");
        estudiantes.add("Estudiante Hotel");
        estudiantes.add("Estudiante India");
        estudiantes.add("Estudiante Juliet");
        estudiantes.add("Estudiante Kilo");
        estudiantes.add("Estudiante Lima");
        
        System.out.println("\nEstudiantes... ");
        printestudiantes(estudiantes);
        List<String> cursoA = estudiantes.subList(0,4);
        List<String> cursoB = estudiantes.subList(4,8);
        List<String> cursoC = estudiantes.subList(8,12);
        System.out.println("\nCruso A... " );
        printestudiantes(cursoA);
        System.out.println("\nCruso B... " );
        printestudiantes(cursoB);
        System.out.println("\nCruso C... " );
        printestudiantes(cursoC);

    }
    public static void printestudiantes(List estudiantes){
        for(int i= 0; i<estudiantes.size(); i++){
            System.out.println("estudiantes[" + i + "] = " + estudiantes.get(i));
        }

    }
}
