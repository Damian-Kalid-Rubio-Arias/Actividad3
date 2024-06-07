
package actividadno3;

import java.util.Scanner;

public class Ejercicio1 {
    /* 1. Hacer un programa en Java que sume los siguientes 
     *25 impares que le siguen al número n 
     *(n es determinado por el usuario). 
     *Imprimir los 25 impares y la suma.
    */
    public static void main(String[] args) {
        // 1.Declaracion de variables
        Scanner leer = new Scanner(System.in);
        int numero;
        int acumuladorImpares =0;
        int contadorImpares =0;
        // 2.lectura de numero 
        System.out.println("Dame un numero;");
        numero = leer.nextInt();
        // 3.Encontrar y sumar los primeros 25 numeros impares
        while(contadorImpares<25){
            numero++;
            if(numero %2!=0){
                acumuladorImpares+=numero;
                System.out.print(numero+" ");
                contadorImpares++;
            }
        }
        //Imprimir la suma de los numeros impares
        System.out.println("Suma:"+acumuladorImpares);
        
    }
}
