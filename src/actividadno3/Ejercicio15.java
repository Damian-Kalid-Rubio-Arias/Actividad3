
package actividadno3;

import java.util.Scanner;

public class Ejercicio15 {

    /**
     * Realizar un programa que genere una matriz 5x6 y 
     * se rellene dinámicamente con los números impares partiendo 
     * desde n (n es dada por el usuario) y se imprima.
     */
    public static void main(String[] args) {
        // 1. definir variables
        int numero;
        Scanner leer = new Scanner(System.in);
        // 2.Verificar que el numero incial sea 0
        do{
        System.out.println("Ingrese el número inicial:"+" ");
        numero= leer.nextInt();
        if (numero%2==0) {
                System.out.println("El número inicial debe ser impar. "
                        + "Inténtelo de nuevo.");
            }
        } while (numero %2==0);
        // 2. Crear una matriz 5x6
        int[][] matriz = new int[5][6];
        // 3. Llenar la matriz con números impares empezando desde numero
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = numero;
                numero += 2; 
            }
        }
        // 4. Imprimir la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}