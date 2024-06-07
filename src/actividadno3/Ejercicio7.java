
package actividadno3;

import java.util.Scanner;

public class Ejercicio7 {

    /**
     *7. Realizar un programa en Java que dado n cantidad 
     * de números determine si esprimo o no y si ese número 
     * primo es múltiplo de 3, se debe contar. Imprimir cantidad 
     * de primos y cantidad de múltiplos de 3
     */
    public static void main(String[] args) {
        // 1.Declaracion de variables
        Scanner leer = new Scanner(System.in);
        int cantidadNumeros ;
        int contadorPrimos =0;
        int contadorMultiplos=0;
        
        //2.Encontrar los numeros primos 
        System.out.println("Dame un numero:");
        cantidadNumeros = leer.nextInt();
          for (int i=0; i <cantidadNumeros; i++) {
            System.out.println("Ingrese un número:");
            int numero = leer.nextInt();
            // 3. Verificar si el número es primo
            if (esPrimo(numero)) {
                contadorPrimos++;
                // 4. Verificar si el número primo es múltiplo de 3
                if (numero % 3 == 0) {
                    contadorMultiplos++;
                }
            }
        }
        /* 5. Imprimir la cantidad de numeros primos y mnumeros primos
         *multiplos de 3
         */
        System.out.println("Cantidad de números primos: " 
                + contadorPrimos);
        System.out.println("Cantidad de números primos que son múltiplos de 3: "
                + contadorMultiplos);
    }
        // Método para determinar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
    