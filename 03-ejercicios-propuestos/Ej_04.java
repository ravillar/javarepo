import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class Ej_04 {

    public static void main(String[] args) {

        guardarArchivo( cargarLista() );

    }

    public static void guardarArchivo( ArrayList<Empleado> empleados ) {
        try {
            FileWriter myWriter = new FileWriter("empleado.txt");
            System.out.println("Escribiendo arhivo...");
            for(Empleado e : empleados){
                myWriter.write(e.toString()+"\r\n");
            }
            myWriter.close();
            System.out.println("Archivo empleado.txt guradado correctamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error intentando guardar el archivo.");
            e.printStackTrace();
        }

    }

    public static ArrayList<Empleado> cargarLista() {
        System.out.println("Cargando lista de empleados...");
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add( new Empleado( "Aileen", "Howe", "27-11-1994",63489.86 ) );
        empleados.add( new Empleado( "Winter", "Owen", "02-09-1993",87683.14 ) );
        empleados.add( new Empleado( "Laurel", "Parsons", "25-06-1978",88412.14 ) );
        empleados.add( new Empleado( "Lane", "Cherry", "11-10-1978",66732.59 ) );
        empleados.add( new Empleado( "Dennis", "Ashley", "17-12-1974",87007.99 ) );
        empleados.add( new Empleado( "Dennis", "Ewing", "20-02-1992",64945.13 ) );
        empleados.add( new Empleado( "Kamal", "Davidson", "30-05-1982",88445.64 ) );
        empleados.add( new Empleado( "Jolie", "Cardenas", "04-08-1991",69593.02 ) );
        empleados.add( new Empleado( "Sonya", "Mitchell", "17-03-1976",86780.89 ) );
        empleados.add( new Empleado( "Kelsie", "Delgado", "24-08-1996",48334.09 ) );
        empleados.add( new Empleado( "Sydnee", "Chase", "27-04-1988",74721.39 ) );
        empleados.add( new Empleado( "Wing", "Glass", "09-04-1994",72493.66 ) );
        empleados.add( new Empleado( "Inga", "Patrick", "06-10-1997",86959.76 ) );
        empleados.add( new Empleado( "Adara", "Waters", "06-05-1975",69877.53 ) );
        empleados.add( new Empleado( "Rafael", "Mckay", "30-01-1982",56386.36 ) );
        empleados.add( new Empleado( "Sawyer", "Sears", "11-06-1986",53413.02 ) );
        empleados.add( new Empleado( "Jacob", "White", "06-04-1992",87359.84 ) );
        empleados.add( new Empleado( "Sean", "Osborn", "24-12-1997",81857.54 ) );
        empleados.add( new Empleado( "Althea", "Andrews", "14-05-1979",58861.87 ) );
        empleados.add( new Empleado( "Gage", "Casey", "29-04-1991",77818.42 ) );

        return empleados;
    }
}
