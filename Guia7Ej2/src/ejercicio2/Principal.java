package ejercicio2;

public class Principal {

    public static void main(String[] args) {
        Circunferencia circunferencia =new Circunferencia(0);
        System.out.println("ingrese radio");
        circunferencia.crearCircunferencia();
        circunferencia.area();
        circunferencia.perimetro();
    }
    
}