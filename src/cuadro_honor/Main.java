package src.cuadro_honor;

import java.util.Scanner;

/*
* Problema: cuadro_honor
* Autor: Juan Eduardo González Hernández
* Grupo: GTID244
* Fecha: 26/10/2026
* Descripción: Daremos una solucion para que reciba el numero de alumnos con sus nombres
y promedios, y el programa imprima el cuadro de honor (9.5 o mas) en orden alfabetico.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // El scanner que leera los nombres y promedios

        // 1) Validamos que si se haya ingresado algo, por si no hay ningun dato para que el programa no truene
        if (!sc.hasNextLine()) {
            System.out.println("No se ingreso ningun dato");
            return;
        }

        /*2) Leemos la cantidad de alumnos y revisamos que sea un numero valido casteandolo a tipo entero*/
        int n;
        try {
            n = Integer.parseInt(sc.nextLine().trim());
        }/*se usa el catch para tomer el error en el caso de que sea un error*/
 catch (NumberFormatException e) {
            System.out.println("No se ingreso ningun dato valido");
            return;
        }

        if (n < 1) {
            System.out.println("No se ingreso ningun dato valido");
            return;
        }

        ListaAlumnos lista = new ListaAlumnos();

        // 3) Creamos el ciclo for que lee dos lineas por alumno, la primera con el nombre y la segunda
        // con el promedio, y se las pasamos a la lista para que ella haga el filtrado
        for (int i = 0; i < n && sc.hasNextLine(); i++) {
            String nombre = sc.nextLine().trim();

            if (!sc.hasNextLine()) {
                break;
            }

            // si el promedio no es un numero saltamos a ese alumno para que no truene
            try {
                double promedio = Double.parseDouble(sc.nextLine().trim());
                lista.insertar(nombre, promedio);
            } catch (NumberFormatException e) {
                // no hacemos nada y seguimos con el siguiente alumno
            }
        }

        // 4) Imprimimos el cuadro de honor ya ordenado
        System.out.print(lista.resultado());
    }
}
