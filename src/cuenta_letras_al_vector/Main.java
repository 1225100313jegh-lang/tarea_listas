package src.cuenta_letras_al_vector;

import java.util.Scanner;
/**
* Problema: cuenta_letras_al_vector
* Autor: Juan Eduardo González Hernández 
* Grupo: GTID244
* Fecha: 26/10/2026
* Descripción: Daremos una solucion para que reciba una palabra de entrada y el programa cuente cuantas
veces se repite cada letra del avecedario.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // El scanner que leerá la palabra
        String s = sc.hasNextLine() ? sc.nextLine().trim() : ""; // por si la cadena está vacía

        ListaLetras lista = new ListaLetras();

        for (int i = 0; i < s.length(); i++) {
            lista.contar(s.charAt(i));
        }

        System.out.print(lista.resultado());
    }
}