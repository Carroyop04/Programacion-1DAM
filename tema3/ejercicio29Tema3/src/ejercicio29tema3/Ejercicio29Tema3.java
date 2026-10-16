/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29tema3;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class Ejercicio29Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//creamos el escaner
        int numero, aleatorio, contador=0;//declaramos las variables
        
        aleatorio = (int) ((Math.random())*100+1);//ponemos el numero aleatorio desde 1 hasta 100, convirtiendolo en int para quitarle los decimales
        
        System.out.println("Introduce un numero");//pedimos al usuario un valor para que trate de adivinar el numer
        numero = entrada.nextInt();
        
        do {
            contador++;//por cada vuelta se sumara un valor al contador
            if (numero > aleatorio){//si el numero es mayor al aleatorio se le indicara al usuario y dandole otro intento
                System.out.println("el numero es menor al introducido, intentalo de nuevo");
                numero = entrada.nextInt();
            } else if(numero < aleatorio){//si el usuario introduce un numero menor al aleatorio se le indicara ademas de que lo vuelva a intentar
                System.out.println("El numero aleatorio es mayor al introducido, intentalo de nuevo");
                numero = entrada.nextInt();
            }
            
        } while (numero != aleatorio);//esto se ejecutaria mientras que el numero sea diferente al aleatorio
        System.out.println("Enhorabuena, lo adivinaste");
        System.out.println("has acertado el numero "+ aleatorio+ " en "+ contador+ " intentos");//cuando salga del bucle se le felicitara y se le indicara cuantos intentos ha tardado en adivinarlo con el contador
    }
    
}
