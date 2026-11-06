/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26tema4;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class Ejercicio26Tema4 {

    public static int pedirNumero() {//hacemos el metodo de pedir numero
        int num;
        Scanner entrada = new Scanner(System.in);//creamos el escaner, con el le pedimos al usuario que introduzca un numero
        System.out.println("Introduce un numero para saber si es primo o no");
        num = entrada.nextInt();//se acumulara en la variable que posteriormente se devolvera 
        return num;
    }

    public static boolean esPrimo(int num) {//creamos el metodo booleano que necesita el numero
        int i = 2;//declaramos el contador
        boolean comprobacion = true;//declaramos el booleano sea false para que te devuelva eso de normal

        while (comprobacion && num != i) {//este bucle se ejecutara mientras que el comprobacion sea true y el numero y el contador sean diferentes
            if (num % i == 0) {//si el numero entre el contador sale a 0 comprobacion se cambiara a false
                comprobacion = false;
            } 
                i++;//y sele sumara por cada vuelta un valor al contador
        }

        return comprobacion;
    }

    public static void main(String[] args) {
        int num = pedirNumero();//declararemos la variable numero que sera el metodo pedirNumero que se explico anteriormente
        boolean comprobacion;//se declarara un valor booleano que sera lo que nos devolvera el metodo esPrimo
        comprobacion = esPrimo(num);
        if (comprobacion == true) {//si el booleano es true le dira al usuario que es primo, si no le dira que no es primo
            System.out.println("tu numero " + num + " es primo");
        } else {
            System.out.println("tu numero " + num + " no es primo");
        }
    }

}
