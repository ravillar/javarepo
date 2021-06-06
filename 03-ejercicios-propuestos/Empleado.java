import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Empleado {

    private String apellido;
    private String nombre;
    private LocalDate fechaNac;
    private Double sueldo;

    public Empleado(String nombre, String apellido, String fechaNac, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
        this.fechaNac = LocalDate.parse(fechaNac, formatter);
    }

    public String toString() {
        String str = String.format(
            Locale.US, "%s,%s,%s,%.2f", this.nombre, this.apellido
            , this.fechaNac.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")), this.sueldo
        );
        return str ;
    }

    public int calcularEdad() {
        return Period.between(this.fechaNac, LocalDate.now()).getYears();
    }

    public String getNombre() {
        return this.nombre; 
    }

    public String  getApellido() {
        return this.apellido;
    }
    public Double getSueldo() {
        return this.sueldo; 
    }
    public String getFechaNac() {
        return this.fechaNac.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")); 
    }

}
