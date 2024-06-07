
package actividadno3;

import java.util.Scanner;

public class Ejercicio9 {

    /**
     * 9. Leer N cantidad de notas (validar rango de notas), 
     * imprimir el promedio de lasnotas, la nota más alta y la más baja.
     */
    public static void main(String[] args) {
        // 1. Declaracion de variables
        Scanner leer = new Scanner(System.in);
        int cantidadNotas;
        double suma = 0;
        double notaMasAlta = Double.MIN_VALUE;
        double notaMasBaja = Double.MAX_VALUE;
        // 2.Cantidad de notas
        System.out.println("Ingrese la cantidad de notas:");
        cantidadNotas = leer.nextInt();
        // 3.Leer las notas
        for (int i=0;i <cantidadNotas;i++) {
            System.out.println("Ingrese la nota #" + (i + 1));
            double nota = leer.nextDouble();
            // 4. Validar que la nota esté dentro del rango (0-50)
            if (nota < 0 || nota > 50) {
                System.out.println
        ("La nota ingresada está fuera del rango válido (0-50).");
                return; 
            }
           //4.Calcular la suma, nota más alta y más baja
            suma += nota;
            notaMasAlta = Math.max(notaMasAlta, nota);
            notaMasBaja = Math.min(notaMasBaja, nota);
        }
        
        // 5. Calcular el promedio
        double promedio = suma / cantidadNotas;
        
        // 6. Imprimir el promedio la nota mas alta y mas baja
        System.out.println("Promedio de las notas: " + promedio);
        System.out.println("Nota más alta: " + notaMasAlta);
        System.out.println("Nota más baja: " + notaMasBaja);
    }
}