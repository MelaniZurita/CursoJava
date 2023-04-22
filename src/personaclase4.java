import java.time.LocalDateTime;

public class personaclase4 {
    public String nombre;
    public String apellido;
    public LocalDateTime fechaNacimiento;

    public int obtenerEdad() {
        return LocalDateTime.now().getYear() - fechaNacimiento.getYear();
    }

    public personaclase4() {
    }

    public personaclase4(String unNombre) {
        this.nombre = unNombre;
    }

    public personaclase4(String unNombre, LocalDateTime fechaNac) {
        this.nombre = unNombre;
        this.fechaNacimiento = fechaNac;

    }
}
