/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author César
 */
public class Ejercicio09 {

    final static float PI = 3.141592f; //Aqui definiremos la constanste
    
    /**
     * @param args the command line arguments
     * @author César Arroyo
     */
    public static void main(String[] args) {
        float radio, resultado; //aqui definimos las variables
        radio= 3.55f;
        resultado= radio * 2* PI; //con poner el nombre en mayusculas de la constante ya estariamos usandola
        System.out.println("La longitud de una circunferencia cuyo radio vale "+ radio+" seria igua a: "+resultado+" metros");//aqui imprimiriamos el resultado dado
        
    }
    
}
