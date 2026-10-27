package src.cuadro_honor;

public class ListaAlumnos {
    private Nodo cabeza;

    // el promedio minimo para entrar al cuadro de honor
    private static final double MINIMO = 9.5;

    /*1) Filtramos y ordenamos en el lado logico de la lista: si el promedio no llega
    al minimo ni lo enganchamos, y si llega lo metemos en su lugar alfabetico*/
    public void insertar(String nombre, double promedio) {
        if (promedio < MINIMO) {
            return;
        }

        Nodo n = new Nodo(nombre, promedio);

        // si la lista esta vacia o el nombre va antes que la cabeza, el nuevo pasa a ser la cabeza
        if (cabeza == null || nombre.compareTo(cabeza.nombre) < 0) {
            n.siguiente = cabeza;
            cabeza = n;
            return;
        }

        // 2) Si no, partimos desde la cabeza como actual y avanzamos mientras el siguiente
        // vagon tenga un nombre que va antes (o igual) al nuestro
        Nodo a = cabeza;
        while (a.siguiente != null && a.siguiente.nombre.compareTo(nombre) <= 0) {
            a = a.siguiente;
        }

        // primero enganchamos el nuevo con el que sigue y luego el de atras con el nuevo
        n.siguiente = a.siguiente;
        a.siguiente = n;
    }

    // 3) Recorremos el tren completo y vamos guardando cada nombre con su salto de linea
    public String resultado() {
        StringBuilder sb = new StringBuilder();
        for (Nodo a = cabeza; a != null; a = a.siguiente) {
            sb.append(a.nombre).append("\n");
        }
        return sb.toString();
    }
}
