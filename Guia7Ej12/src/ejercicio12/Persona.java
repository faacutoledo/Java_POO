package ejercicio12;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void crearPersona() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el nombre del usuario");
        this.nombre = leer.next();
        System.out.println("Ingrese año de nacimiento");
        int anio = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese día de nacimiento");
        int dia = leer.nextInt();

        Date fecha = new Date();
        fecha.setDate(dia);
        fecha.setMonth(mes-1);
        fecha.setYear(anio-1900);

        this.fechaNacimiento = fecha;
    }

}
