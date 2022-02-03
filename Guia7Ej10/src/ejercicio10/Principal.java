///////////// CONSIGNA //////////////////////

/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20
*/

package ejercicio10;

import java.util.Arrays;


public class Principal {

   
    public static void main(String[] args) {
        
        double[] vectorA = new double[50];
        double[] vectorB = new double[20];
         
        for (int i = 0; i < vectorA.length-1; i++) {
            vectorA[i]= Math.round(Math.random()*10);
            System.out.print("["+vectorA[i]+"]");
        }
        
        Arrays.sort(vectorA); /// Ordenado de menor a mayor
        
        System.out.println("");
        
        for (int i = 0; i < vectorA.length-1; i++) {
            System.out.print("["+vectorA[i]+"]");
        }
        
        for (int i = 0; i < vectorB.length-1; i++) {
            
            if (i<10) {
                vectorB[i]=vectorA[i];
            }else{
                vectorB[i]=0.5;
            }
                        
        }
        
        
        ///////////// MOSTRAR ARREGLOS
        System.out.println("");
        System.out.println("VECTOR A");
        
        for (int i = 0; i < vectorA.length-1; i++) {
            System.out.print("["+vectorA[i]+"]");
        }
        System.out.println("");
        System.out.println("VECTOR B");
        
        for (int i = 0; i < vectorB.length-1; i++) {
            System.out.print("["+vectorB[i]+"]");
        }
        
        
        
        
    }
    
}
