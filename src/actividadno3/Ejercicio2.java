
package actividadno3;

import java.util.Scanner;

public class Ejercicio2 {

    /**2.Hacer un programa en Java que cuente y sume 
     * los múltiplos de 5 y 3 (para ser sumado debe 
     * verificarse que sea múltiplo de 5 y 3 a la vez) 
     * comprendidos entre 1 y n (n es determinado por el usuario). 
     * Imprimir la cantidad de múltiplos de 5 y 3.
     */
    public static void main(String[] args) {
         // 1.Declaracion de variables
        Scanner leer = new Scanner(System.in);
        int numero;
        int acumuladorMultiplos =0;
        int contadorMultiplos =0;
        // 2.lectura de numero 
        System.out.println("Dame un numero;");
        numero = leer.nextInt();
        // 3. Contar y sumar múltiplos de 5 y 3 entre 1 y numero
        for (int i = 1; i <= numero; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                acumuladorMultiplos += i;
                contadorMultiplos++;
            }
        }
        // 4. Imprimir la suma y la cantidad de multiplos
        System.out.println("Cantidad de múltiplos de 5 y 3: " 
                + contadorMultiplos);
        System.out.println("Suma de múltiplos de 5 y 3: " 
                + acumuladorMultiplos);
    }
}
