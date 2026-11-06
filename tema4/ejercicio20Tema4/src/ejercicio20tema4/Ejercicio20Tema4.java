/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20tema4;

import java.util.Scanner;

/**
 *
 * @author César
 */
public class Ejercicio20Tema4 {

    public static final String descubridor = "Colon";//Aqui estaria declarada la constante del descubridor de America
    public static final String capital = "Madrid";//declaramos la constante capital como pide el enunciado

    public static int respuestaPrimera(String respuesta, int nota) {//hacemos el metodo primera respuesta que necesita la respuesta del usuario y la nota actual del examen
        if (respuesta.equals(capital)) {//si la respuesta del usuario es la misma que la constante se le dara la enhorabuena y se le devolvera 5 puntos mas a su nota
            System.out.println("respuesta correcta, siguiente pregunta");
            return nota + 5;
        } else {
            System.out.println("No es correcto. La respuesta correcta seria Madrid");//si no le madara cual era la respuesta correcta y se le devolvera su nota sin sumar nada
        }
        return nota;
    }

    public static int respuestaSegunda(String respuesta, int nota) {//Ahora haremos exactamente lo mismo que el anterior metodo pero en vez la capital de españa sera con el descubridor de America

        if (respuesta.equals(descubridor)) {
            System.out.println("respuesta correcta, siguiente pregunta");
            return nota + 5;
        } else {
            System.out.println("No es correcto. La respuesta correcta seria Colon");
        }
        return nota;
    }

    public static void main(String[] args) {
        int nota = 0;//le declararemos que su nota sea 0 y segun sus respuestas se le sumara algunos puntos o no
        Scanner entrada = new Scanner(System.in);//aqui hacemos el escaner

        System.out.println("EXAMEN DE CULTURA GENERAL");//el mensaje inicial del examen

        System.out.println("1 PREGUNTA: Cual es la capital de Espania?");//le preguntaremos dentro del main la pregunta para que no tengamos que meter en cada metodo un Scanner y alargar tanto el codigo
        nota = respuestaPrimera(entrada.nextLine(), nota);//La nota sera igual al valor que le devuelva el metodo respuestaPrimera, para ello le mandaremos al metodo su nota actual y el siguiente parametro que introduzca el usuario

        System.out.println("2 PREGUNTA: Quien descubrio America?");//exactamente lo mismo que en la anterior pregunta se hara aqui pero con la segunda pregunta
        nota = respuestaSegunda(entrada.nextLine(), nota);

        System.out.println("NOTA DEL EXAMEN: " + nota);//por ultimo se le imprimira la nota del examen al usuario
    }

}
