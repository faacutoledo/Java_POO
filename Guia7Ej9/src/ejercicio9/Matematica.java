package ejercicio9;

public class Matematica {

    private double numero1;
    private double numero2;

    public Matematica() {
    }

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double devolverMayor() {
        if (this.numero1 > this.numero2) {
            return this.numero1;
        } else {
            return this.numero2;
        }
        /*
        System.out.printf("el valor de num1: %.1f y El valor de num2: %.1f \n",num1, num2);
        System.out.printf("El valor más grande es: %.1f \n", Math.max(num1, num2));
         */
    }

    public void calcularPotencia() {
        if (numero1 > numero2) {
            System.out.printf("La potencia de %.0f elevado a %.0f es %d \n", numero1, numero2, (int) Math.pow((int) numero1, (int) numero2));
        } else {

            System.out.printf("La potencia de %.0f elevado a %.0f es %d \n", numero2, numero1, (int) Math.pow((int) numero2, (int) numero1));
        }
        /*
            System.out.println(Math.pow(Math.max(Math.round(num1), Math.round(num2)),Math.min(Math.round(num1), Math.round(num2))));

         */

    }

    public void calcularRaiz() {
        if (numero1 < numero2) {
            System.out.printf("La raiz de %.2f es %.2f \n", numero1, Math.sqrt(Math.abs(numero1)));
        } else {

            System.out.printf("La raiz de %.2f es %.2f \n", numero2, Math.sqrt(Math.abs(numero2)));
        }
        /*
        System.out.println(Math.sqrt(Math.min(Math.abs(num1),Math.abs(num2))));
        */
    }
}
