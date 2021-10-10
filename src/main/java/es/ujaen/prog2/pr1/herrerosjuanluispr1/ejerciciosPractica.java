/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ujaen.prog2.pr1.herrerosjuanluispr1;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Juan Luis
 */
public class ejerciciosPractica {

    public void primos() throws IOException {

        System.out.println("");
        System.out.println("Menú -> Descomposición en factores primos");
        System.out.println("Introduce el número (2-100):");

        int numero = -1;
        do {

            System.out.println("");

            numero = Entrada.entero();

            // Filtro
            if (numero < 2 || numero > 100) {
                numero = -1;
                System.out.println("Introduzca un número dentro del rango permitido (2-100)");
                System.out.println("");
            }

        } while (numero == -1);

        //Descomponemos en factores primos
        ArrayList<Integer> lista = new ArrayList<>();//Guardo los factores en un array para mostrarlos después

        //Calculamos los numeros primos
        int dividendo = numero, divisor = 2;
        do {
            if (dividendo % divisor == 0) {
                dividendo = dividendo / divisor;
                lista.add(divisor);
            } else {
                divisor++;
            }
        } while (dividendo > 1);

        //Mostramos los factores
        System.out.println("");
        System.out.println("Los factores primos de " + numero + " son:");
        System.out.print("[");

        for (int i = 0; i < lista.size(); i++) {

            if (i != (lista.size() - 1)) {
                System.out.print(lista.get(i) + ", ");
            } else {
                System.out.println(lista.get(i) + "]");
            }

        }

        System.out.println("");

    }

    public void dibujo() throws IOException {

        System.out.println("");
        System.out.println("Menú -> Dibujo esquina");
        System.out.println("Introduce el lado del cuadrado (mínimo 2):");

        int lado = -1;
        do {

            System.out.println("");

            lado = Entrada.entero();

            //Filtro
            if (lado < 2) {
                lado = -1;
                System.out.println("");
                System.out.println("No introduzca un valor inferior a 2");
                System.out.println("");
            }

        } while (lado == -1);

        System.out.println("");
        System.out.println("0- Esquina superior izquierda");
        System.out.println("1- Esquina superior derecha");
        System.out.println("2- Esquina inferior derecha");
        System.out.println("3- Esquina inferior izquierda");
        System.out.println("");
        System.out.println("Introduce la esquina seleccionada (0-3):");

        int esquina = -1;
        do {

            System.out.println("");

            esquina = Entrada.entero();

            //Filtro
            if (esquina < 0 || esquina > 3) {
                esquina = -1;
                System.out.println("");
                System.out.println("Introduzca un número dentro del rango permitido (0-3)");
                System.out.println("");
            }

        } while (esquina == -1);

        //Dibujamos el cuadrado
        System.out.println("");

        if (esquina == 0) { //Superior izquierda
            for (int i = 0; i < lado; i++) {
                for (int j = 0; j < lado - i; j++) {
                    System.out.print(" #");
                }

                for (int j = lado; j > lado - i; j--) {
                    System.out.print(" ·");
                }
                System.out.println("");
            }
        }

        if (esquina == 1) { //Superior derecha
            for (int i = lado; i > 0; i--) {
                for (int j = 0; j < lado - i; j++) {
                    System.out.print(" ·");
                }

                for (int j = lado; j > lado - i; j--) {
                    System.out.print(" #");
                }
                System.out.println("");
            }
        }

        if (esquina == 2) { //Inferior derecha
            for (int i = 0; i < lado; i++) {
                for (int j = 1; j < lado - i; j++) {
                    System.out.print(" ·");
                }

                for (int j = lado; j >= lado - i; j--) {
                    System.out.print(" #");
                }
                System.out.println("");
            }
        }

        if (esquina == 3) { //Inferior izquierda
            for (int i = lado; i > 0; i--) {
                for (int j = 0; j <= lado - i; j++) {
                    System.out.print(" #");
                }

                for (int j = lado - 1; j > lado - i; j--) {
                    System.out.print(" ·");
                }
                System.out.println("");
            }
        }

    }

    public void juego() throws IOException {

        System.out.println("");
        System.out.println("Menú -> Medidor capicúa");
        System.out.println("Introduce la palabra capicúa:");

        String read = Entrada.cadena();

        //Eliminamos posibles espacios
        String palabra = read.replace(" ", "");

        //Creamos otro string que contenga la palabra invertida
        StringBuilder stringBuilder = new StringBuilder(palabra);
        String palabrainvertida = stringBuilder.reverse().toString();

        //Creamos un string que contenga la posición de las letras que coinciden
        String posicion = new String();
        int puntos = 0;

        if (palabra.length() % 2 == 0) {//Si la longitud de la palabra es par
            for (int i = 0; i < palabra.length() / 2; i++) {
                if (palabra.charAt(i) == palabrainvertida.charAt(i)) {
                    puntos++;
                    posicion = (posicion + "#");
                } else {
                    posicion = (posicion + "·");
                }
            }
        }

        if (palabra.length() % 2 != 0) {//Si la longitud de la palabra es impar
            for (int i = 0; i <= palabra.length() / 2; i++) {
                if (palabra.charAt(i) == palabrainvertida.charAt(i)) {
                    puntos++;
                    posicion = (posicion + "#");
                } else {
                    posicion = (posicion + "·");
                }
            }
        }

        System.out.println("");
        System.out.println("Puntuación: " + puntos);
        System.out.println(palabra);
        System.out.print(posicion);

        //El string posicion está construido hasta la mitad de la palabra
        //por lo que debemos darle la vuelta y escribirlo a continuación
        //como si de un espejo se tratase
        StringBuilder stringBuilder1 = new StringBuilder(posicion);
        String posicioninvertida = stringBuilder1.reverse().toString();

        if (palabra.length() % 2 != 0) {
            System.out.print(posicioninvertida.substring(1, posicion.length()));
            System.out.println("");
        }

        if (palabra.length() % 2 == 0) {
            System.out.print(posicioninvertida.substring(0, posicion.length()));
            System.out.println("");
        }

    }

}
