/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14tema4;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class Ejercicio14Tema4 {

    public static int pedirNumero() {//declaramos el metodo pedirNumero para que se acumule el valor que introduzca el usuario en una variable que se devolvera a una variable en el metodo main
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce un numero");
        numero = entrada.nextInt();
        return numero;
    }
    
    public static boolean comprobarNumero(int numero){//declararemos el metodo booleano comprobarNumero para saber si el numero es positivo o no
        boolean comprobacion = true;//de normal el valor booleano sera true diciendo que el numero es positivo
        if(numero <0){//pero si el numero es menor que 0 se dira que el valor es false indicando que el numero es negativo
            comprobacion = false;
        }
        return comprobacion;//al final se devolvera la comprobacion
    }
    
    public static void calculosResultado(int numero){//aqui declaramos el metodo calculosResultado, donde se calculara e imprimira todos los numeros multiplos de 3 que hay desde 1 hasta el valor que introduzca el usuario
        int i;//declaramos el contador
        for(i=0;i<numero;i++){//con este bucle se ejecutara desde que el contador sea 0, mientras que sea menor al numero que dio el usuario y por cada vuelta se le sumara un valor
            if(i%3==0){//si el resto de la division entre el contador y el numero del usuario es 0, se imprimira el numero del contador
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int numero = pedirNumero();//declararemos el numero sea el resultado del metodo pedirNumero(osea el valor que introdujo el usuario)
        Scanner entrada = new Scanner(System.in);//crearemos el escaner
        while (!comprobarNumero(numero)) {//mientras que el metodo comprobarNumero que esta cogiendo la variable numero no sea true se ejecutara este bucle
            System.out.println("el numero es menor que 0, introduce un numero correcto");//en cada vuelta se le indicara que lo ha introduzido mal, invitandolo a que lo vuelva introducir de buena manera
            comprobarNumero(numero = entrada.nextInt());//entonces el numero que coge el metodo se le cambiara su valor por el siguiente que introduzca el usuario 
        }
        calculosResultado(numero);//y por ultimo se haran los calculos y la muestra de resultados con el numero positivo
    }

}
