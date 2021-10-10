/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ujaen.prog2.pr1.herrerosjuanluispr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Juan Luis
 */
public class Entrada {

    private static String leer() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lectura = br.readLine();
        return lectura;

    }

    public static int entero() throws IOException {
        int numero = 0;
        try {
            numero = Integer.parseInt(Entrada.leer());
        } catch (NumberFormatException ex) {
            numero = -1;
            System.out.println("");
            System.out.println("No ha introducido un número, inténtelo de nuevo");
            System.out.println("");
        }
        return numero;
    }

    public static String cadena() throws IOException {
        String texto = leer();
        return texto;
    }

}
