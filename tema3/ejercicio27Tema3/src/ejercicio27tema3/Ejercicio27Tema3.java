/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27tema3;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class Ejercicio27Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, opcion=0, resultado;//declaramos las variables
        Scanner entrada= new Scanner(System.in);//hacemos el escaner
        System.out.println("Introduce un numero");//le pedimos a un usuario 2 numeros que se acumularan en las variables num
        num1=entrada.nextInt();
        
        System.out.println("Introduce otro numero numero");
        num2=entrada.nextInt();
        
        while(opcion!=5){//y se ejecutara un bucle mientras que nuestra opcion sea diferente a 5
            System.out.println("Que quieres hacer en este programa?: \n 1.-Sumar los numeros \n 2.-Restar los numeros \n 3.-Multiplicar los numeros \n 4.-Dividir los numeros \n 5.-Salir del programa");
            opcion=entrada.nextInt();//le pedimos al usuario una opcion para saber que quiere hacer,
            switch(opcion){
                case 1: {//si introduce 1 se ejecutara la suma
                    resultado=num1+num2;
                    System.out.println("la suma entre "+ num1 +" y "+ num2+ " es: "+resultado);
                    break;//en cada uno pondremos un break para que se repita el bucle sin ser infinitamente esta opcion
                }
                case 2: {//con el dos se ejecutara la resta
                    resultado=num1-num2;
                    System.out.println("la resta entre "+ num1 +" y "+ num2+ " es: "+ resultado);
                    break;
                }
                case 3: {//con el tres se ejecutara la multiplicacion
                    resultado=num1*num2;
                    System.out.println("la multiplicacion entre "+ num1 +" y "+ num2+ " es: "+resultado);
                    break;
                }
                case 4: {//y con el cuatro se ejecutara la division
                    try {//dentro del try pondremos la division para que si hubieramos introducido antes un valor como 0 nos lo capte el catch y se lo haga saber al usuario, poniendo como resultado un 0
                        resultado=num1/num2;
                    }
                    catch(ArithmeticException error){
                        System.out.println("ha tenido el Error de: " + error.getMessage());//con el error.getmessage le dira al usuario el error en concreto que ha tenido
                        resultado=0;
                    }
                    System.out.println("la division entre "+ num1 +" y "+ num2+ " es: "+resultado);
                    break;
                }
                case 5: {//y por ultimo si introduce cinco el bucle se cerrara y nos mandara un mensaje de despedida
                    System.out.println("Hasta la proxima");
                    break;
                }
            }
        }
    }
}
