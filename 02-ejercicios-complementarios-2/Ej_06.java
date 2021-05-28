import java.util.*;

public class Ej_06{
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Alfa","1111111",1,101);
        Empleado e2 = new Empleado("Bravo","22222222",2,202);
        Empleado e3 = new Empleado("Charlie","33333333",3,303);
        Empleado e4 = new Empleado("Delta","44444444",4,404);
        Empleado e5 = new Empleado("Echo","55555555",5,505);
        Set<Empleado> empleados = new HashSet<>(){{
            add(e1);
            add(e2);
            add(e3);
            add(e4);
            add(e5);
        }};
        Map<String, Integer> dniSueldo = new HashMap<>();
        for(Empleado e : empleados){
            dniSueldo.put(e.dni, e.sueldo());
        }
        System.out.println(dniSueldo.toString());
    }
    
    public static class Empleado{
        String nomApe;
        String dni;
        int horas;
        int valorHora;
        public Empleado(String nom, String dni, int horas, int valor){
            this.nomApe = nom;
            this.dni = dni;
            this.horas = horas;
            this.valorHora = valor;
        }
        public int sueldo(){
            return this.horas * this.valorHora;
        }
    }
}
