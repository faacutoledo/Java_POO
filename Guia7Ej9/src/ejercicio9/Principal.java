package ejercicio9;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Matematica matematica = new Matematica();

        matematica.setNumero1(Math.random() * 20);
        matematica.setNumero2(Math.random() * 20);
        System.out.println("el numero 1 es : "+ matematica.getNumero1());
        System.out.println("el numero 2 es : "+ matematica.getNumero2());
        System.out.printf("\n El valor mayor es %.2f \n",matematica.devolverMayor());
        
        matematica.calcularPotencia();
        matematica.calcularRaiz();
        
        
    }

}