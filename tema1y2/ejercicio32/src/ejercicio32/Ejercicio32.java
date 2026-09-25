/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dinero, b50, b20, b10, b5, m2, m1;//declaramos las variables
        
        Scanner cartera = new Scanner(System.in);//hacemos el scanner para saber la cantidad de dinero que nos dice el usuario
        System.out.println("Por favor, indique una cantidad de dinero: ");
        dinero = cartera.nextInt();//Aqui se almacenaria la cifra de dinero que ha introducido el usuario
        
        b50=dinero/50; //tendremos que dividirlo entre 50 para saber cuantos billetes de 50 son
        b20=dinero%50/20; //y para saber los demas tendremos que ir cogiendo el resto de la division anterior y dividirlo entre el numero en cuestion, en este caso seria 20
        b10=dinero%50%20/10;
        b5=dinero%50%20%10/5;
        m2=dinero%50%20%10%5/2;
        m1=dinero%50%20%10%5%2;
        
        //y aqui estaria la impresion de todo como nos pide el ejercicio
        System.out.println(dinero +" Euros se descomponen en "+b50+ " billetes de 50, "+b20+" billetes de 20, "+b10+" billetes de 10, "+b5+ " billetes de 5, "+m2+" monedas de 2 euros y "+m1+" monedas de 1 euro");
    }
    
}
