/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16tema3;

/**
 *
 * @author César
 */
public class Ejercicio16Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, contador=0;//declaramos las variables
        
        System.out.println("Estos son los numeros impares entre el 20 y el 160");
        
        for(i=20;i<=160;i++){//hacemos un bucle en el que i es igual a 20 y se ejecutara mientras que sea menor o igual a 160, por cada vuelta se le sumara un valor a i
            if(i%2==1){//si el numero es impar (si se divide entre dos su resto es 1) se imprimira el numero y se sumara un valor al contador
                System.out.print(i+" - ");
                contador++;
            }
        }
        
        System.out.println("Hasta aqui los numeros impares");
        System.out.println("La cantidad de numeros impares ha sido: "+contador);//y por ultimo mostramos el contador de numeros impares
    }
    
}
