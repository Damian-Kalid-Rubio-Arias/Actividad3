
package actividadno3;

public class Ejercicio16 {

    /**
     *16. Realizar una matriz 5x5, inicializarla totalmente en 1 
     * y luego en la diagonal trasversa colocar el número cero (0). 
     * Imprimir la matriz
     */
    public static void main(String[] args) {
        // 1. Declaracion de variables
        int[][] matriz = new int[5][5];
        // 2. Iniciar la matriz en 1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = 1;
            }
        }
        // 3. Reemplazar los elementos en la diagonal transversal por 0
        for (int i = 0; i < 5; i++) {
            matriz[i][i] = 0;
        }
        // 3. Imprimir la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
    
    

