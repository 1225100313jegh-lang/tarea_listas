package src.cuadro_honor;

/*lo tomaremos como vagones del tren cada alumno es un Nodo el cual tendra
tanto el nombre en tipo String, su promedio en tipo double y el enlace de
la lista en tipo Nodo para el enlace con el siguiente alumno.*/
public class Nodo {
    String nombre;
    double promedio;
    Nodo siguiente;

    public Nodo(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }
}
