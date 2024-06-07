
package actividadno3;

public class Ejercicio17 {

    /*
    *Generar un arreglo unidimensional de 50 posiciones que se llene 
    *con valores aleatorios y contar la cantidad de positivos, 
    *negativos y ceros del arreglo.
     */
    public static void main(String[] args) {
        // 1.Declaracion de variables
        int arrayRandom[]= new int [50];
        short contadorPositivos =0;
        short contadorNegativos =0;
        short contadorCeros =0;
        // 2. Llenar el array con números aleatorios 
        for(int i=0;i<50;i++){
            arrayRandom[i]= (int)(Math.random()*(21)+(-10));
        // 3.Contar positivos, negativos y ceros
            if(arrayRandom[i]>0)contadorPositivos++;
            else if(arrayRandom[i]<0)contadorNegativos++;
            else contadorCeros++;
        }
        // 4.Imprimir los numeros del array
        for(int i=0;i<50;i++){
            System.out.println(arrayRandom[i]+" ");
        }
        // 5.Imprimir los conteos de positivos,negativos y ceros
        System.out.println("Cantidad Negativos;"+contadorNegativos);
        System.out.println("Cantidad Positivos;"+contadorPositivos);
        System.out.println("Cantidad Ceros;"+contadorCeros);
    }  
}
