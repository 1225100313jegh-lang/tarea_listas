package src.supermercado;

import java.util.Scanner;

/*
* Problema: supermercado
* Autor: Juan Eduardo González Hernández
* Grupo: GTID244
* Fecha: 26/10/2026
* Descripción: Recibe N productos con su precio y imprime el ticket ordenado de
* mayor a menor precio, seguido del total de la compra. El orden se hace en el
* lado lógico de la lista al insertar cada producto.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0; // cantidad de productos

        ListaProductos lista = new ListaProductos();

        for (int i = 0; i < n && sc.hasNext(); i++) {
            String nombre = sc.next();
            double precio = Double.parseDouble(sc.next());
            lista.insertar(nombre, precio);
        }

        System.out.print(lista.resultado());
    }
}
