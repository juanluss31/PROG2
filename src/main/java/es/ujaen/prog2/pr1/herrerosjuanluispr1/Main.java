/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ujaen.prog2.pr1.herrerosjuanluispr1;

import java.io.IOException;

/**
 *
 * @author Juan Luis
 */
public class Main {

    public static void main(String[] args) throws IOException {

        ejerciciosPractica ejercicios = new ejerciciosPractica();

        int seleccion = -1;

        do {

            //Menú    
            System.out.println("");
            System.out.println("Menú");
            System.out.println("");
            System.out.println("1- Descomposición en factores primos");
            System.out.println("2- Dibujar esquina de un cuadrado");
            System.out.println("3- Puntuación capicúa");
            System.out.println("0- Salir");
            System.out.println("");

            //Leemos el número
            seleccion = Entrada.entero();

            switch (seleccion) {

                case 0:
                    System.out.println("");
                    System.out.println("Hasta luego.");
                    break;
                case 1:
                    ejercicios.primos();
                    break;
                case 2:
                    ejercicios.dibujo();
                    break;
                case 3:
                    ejercicios.juego();
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;

            }

        } while (seleccion != 0);

    }

}
