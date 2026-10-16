/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09tema3;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class Ejercicio09Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3, num4, recipiente;//declaramos las variables
        Scanner entrada = new Scanner(System.in);//hacemos el escaner
        
        System.out.println("Por favor, introduzca el primer numero: ");//le pediremos los 4 valores al usuario que se acumularan en las variables num, para luego ordenarlas
        num1= entrada.nextInt();
        
        System.out.println("Ahora, introduzca el segundo numero: ");
        num2= entrada.nextInt();
        
        System.out.println("Introduzca el tercer numero: ");
        num3= entrada.nextInt();
        
        System.out.println("Por ultimo, introduzca un cuarto numero: ");
        num4= entrada.nextInt();

        //utilizaremos el metodo burbuja, osea que pondremos una variable mas para ir intercambiando los valores entre variables hasta que esten colocados
        if (num1 > num2) {//esta seria la primera vuelta
            recipiente = num1;//si el primero es mayor, intercambiamos sus posiciones
            num1 = num2;
            num2 = recipiente;
        }

        if (num2 > num3) {//Si el segundo es mayor intercambiamos numeros, asi tambien con los siguientes
            recipiente = num2;
            num2 = num3;
            num3 = recipiente;
        }

        if (num3 > num4) {
            recipiente = num3;
            num3 = num4;
            num4 = recipiente;
        }

        if (num1 > num2) {//Aqui empieza la segunda vuelta, ya tendriamos acomodado el cuarto numero en la anterior vuelta
            recipiente = num1;
            num1 = num2;
            num2 = recipiente;
        }

        if (num2 > num3) {
            recipiente = num2;
            num2 = num3;
            num3 = recipiente;
        }

        if (num1 > num2) {//y esta seria la ultima vuelta que daria, tenemos ya acomodado el tercer numero por lo tanto solo queda el primero y el segundo
            recipiente = num1;
            num1 = num2;
            num2 = recipiente;
        }
        
        System.out.println("El orden de los numeros introducidos es el "+ num1 + " - " + num2 + " - " + num3 + " - " + num4);//por ultimo mostramos el orden 

    }
}
