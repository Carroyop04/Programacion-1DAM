/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17tema4;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class Ejercicio17Tema4 {

    public static char generarLetra() {//hacemos el metodo del numero aleatorio
        char letra=(char) ((int) (Math.random() * 26 + 97));//al math random lo multiplicamos por 26 que son la cantidad de letras que hay, le sumamos 97 para que empieze desde ahi, con el int lo redondeamos y por ultimo con el char lo convertimos a letra
        return letra;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//hacemos el scanner
        char letra, intento;
        
        letra = generarLetra();//declaramos la variable letra que guardara la letra aleatoria generada con el metodo
        int contador = 0;//declaramos el contador
        System.out.println("Introduce una letra: ");
        intento = entrada.nextLine().charAt(0);//se guardara en la variable intento la letra que introduzca el usuario

        while (letra != intento){//este bucle se ejecutara mientras que la letra sea diferente al intento del usuario
            contador++;//en cada vuelta se sumara un valor al contador
            if (intento < letra) {//con el if le haremos saber al usuario que si el intento introducido esta antes que la letra aleatoria, o con el otro else if lo contrario, si esta despues que la letra aleatoria
                System.out.println("La letra esta despues en el abecedario que la que has introducido");
            } else if (intento > letra) {
                System.out.println("La letra esta antes en el abecedario que la que has introducido");
            }
            intento = entrada.nextLine().charAt(0);//y despues de decirle si esta antes o despues, se guardara la letra introducida por el usuario denuevo en la variable intento
        }

        System.out.println("Has acertado, y has tenido: " + contador + " intentos");//por ultimo se le dara la enhorabuena y le mostrara el contador de intentos que ha tenido para adivinarla
    }
}
