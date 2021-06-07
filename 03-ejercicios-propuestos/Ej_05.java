import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.stream.Collectors;
public class Ej_05 {

    public static void main(String[] args) {

        List<Empleado> listaEmpleados = leerArchivo();

        if(listaEmpleados != null){

            Scanner sc = new Scanner(System.in);

            System.out.println("\nLista de empleados sin ordenar\n");
            imprimirLista( listaEmpleados );

            Empleado joven = empleadoMasJoven(listaEmpleados);
            System.out.printf("%n%s %s es el empleado más joven y tiene %d años de edad.%n"
                    , joven.getNombre(), joven.getApellido(), joven.calcularEdad());

            Empleado mayor = empleadoMayor(listaEmpleados);
            System.out.printf("%n%s %s es el empleado de mayor edad y tiene %d años.%n"
                    , mayor.getNombre(), mayor.getApellido(), mayor.calcularEdad());

            Empleado menorSueldo = empleadoMenorSueldo(listaEmpleados);
            System.out.printf("%n%s %s es el empleado con sueldo más bajo $ %.2f.%n"
                    , menorSueldo.getNombre(), menorSueldo.getApellido(), menorSueldo.getSueldo());

            Empleado mayorSueldo = empleadoMayorSueldo(listaEmpleados);
            System.out.printf("%n%s %s es el empleado con el sueldo más alto $ %.2f.%n"
                    , mayorSueldo.getNombre(), mayorSueldo.getApellido(), mayorSueldo.getSueldo());

            separador(sc);
            System.out.println("\nEmpleados ordenados alfabéticamente por Nombre Ascendente\n");
            listaEmpleados.sort((e1, e2) -> e1.getNombre().compareTo(e2.getNombre())); 
            imprimirLista( listaEmpleados );

            separador(sc);
            System.out.println("\nEmpleados ordenados alfabéticamente por Apellido Descendente\n");
            Comparator<Empleado> comparador = (e1, e2) -> e1.getApellido().compareTo(e2.getApellido());
            listaEmpleados.sort(comparador.reversed()); 
            imprimirLista( listaEmpleados );

            separador(sc);
            System.out.println("\nEmpleados con letra R inicial en Apellido\n");
            List<Empleado> filtrados = listaEmpleados
                .stream()
                .sorted( (e1, e2) -> e1.getApellido().compareTo( e2.getApellido() ) )
                .filter( e -> e.getApellido().toLowerCase().startsWith("r") ).collect( Collectors.toList() );

            imprimirLista( filtrados );

            sc.close();
        }

    }

    public static List<Empleado> leerArchivo() {
        System.out.println("Leyendo archivo datos.txt ...");
        try{

            File archivo = new File("datos.txt");
            Scanner lector = new Scanner(archivo);

            List<Empleado> empleados = new ArrayList<>();

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                empleados.add( empleadoDesdeString( linea ) );
            }

            lector.close();
            return empleados;
        }catch(IOException e){

            System.out.println("Error al intentar leer el archivo");
            e.printStackTrace();
            return null;
        }
    }

    public static void imprimirLista(List<Empleado> lista) {
        String formato = "%-12.12s  %-12.12s  %-12.12s  %-6.6s %-12.12s%n";
        System.out.printf(formato, "Nombre", "Apellido", "Fecha Nac.", "Edad", "Sueldo");
        for(Empleado e : lista){
            System.out.printf(formato, e.getNombre(), e.getApellido(), e.getFechaNac(), e.calcularEdad(), e.getSueldo());
        }
    }

    public static void separador(Scanner scan){
        System.out.print("\nPresione ENTER para continuar: ");
            scan.nextLine();
    }
    
    // crea una instancia de empleado a partir de un string 
    public static Empleado empleadoDesdeString(String linea) {
        String[] campos = linea.split(",");
        return new Empleado(campos[0], campos[1], campos[2], Double.parseDouble(campos[3]) ); 
    }

    public static Empleado empleadoMasJoven(List<Empleado> lista) {
        return lista
            .stream()
            .min(Comparator.comparing(Empleado::calcularEdad))
            .get();
    }

    public static Empleado empleadoMayor(List<Empleado> lista) {
        return lista
            .stream()
            .max(Comparator.comparing(Empleado::calcularEdad))
            .get();
    }
    public static Empleado empleadoMayorSueldo(List<Empleado> lista) {
        return lista
            .stream()
            .max(Comparator.comparing(Empleado::getSueldo))
            .get();
    }

    public static Empleado empleadoMenorSueldo(List<Empleado> lista) {
        return lista
            .stream()
            .min(Comparator.comparing(Empleado::getSueldo))
            .get();
    }
}
