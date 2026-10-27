package src.comprando_agua;

import java.util.Scanner;
/*
* Problema: comprando_agua
* Autor: Juan Eduardo González Hernández
* Grupo: GTID244
* Fecha: 26/10/2026
* Descripción: Recibe el número de marcas y sus precios, y muestra el menor.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0; // cantidad de marcas

        ListaPrecios lista = new ListaPrecios();

        for (int i = 0; i < n && sc.hasNextInt(); i++) {
            lista.insertar(sc.nextInt());
        }

        if (!lista.estaVacia()) {
            System.out.println(lista.menor());
        }
    }
}