/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pre = new Scanner(System.in);//Aqui declaramos primero los dos scanners para saber cuantas unidades tiene el usuario y el precio de ese objete
        Scanner uni = new Scanner(System.in);
        
        float precio, unidades, total;//Declaramos las variables
        
        System.out.println("introduce el precio del modelo de ordenador que desea comprar: ");
        precio = pre.nextFloat();//Aqui recopilamos el precio del objeto que nos ha dicho el cliente para posteriormente pedirle las unidades
        
        System.out.println("Cuantas unidades quieres comprar?");
        unidades = uni.nextFloat();//y aqui se recopilaria cuantas unidades se va a llevar el usuario
        
        total= precio* unidades;//la cuenta para saber el precio es facil, multiplicaremos el precio por el numero de unidades
        System.out.println("El precio total de su compra es de: "+ total+ " Euros");//por ultimo lo imprimimos el resultado
    }
    
}
