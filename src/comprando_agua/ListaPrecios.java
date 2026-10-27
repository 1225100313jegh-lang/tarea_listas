package src.comprando_agua;

public class ListaPrecios {
    private Nodo cabeza;
    private Nodo cola;

    // Engancha un vagón nuevo al final del tren
    public void insertar(int precio) {
        Nodo n = new Nodo(precio);
        if (cabeza == null) cabeza = n;
        else cola.siguiente = n;
        cola = n;
    }
	/*hacemos el caso nulo por si no se agrega ninguna marca*/
    public boolean estaVacia() {
        return cabeza == null;
    }

    // El metodo recorrera los precios y tomara el que es menor en este caso siendo una lista simple con solo un enlace y un puntero hacia la derecha
    public int menor() {
        int min = cabeza.precio;
        for (Nodo a = cabeza.siguiente; a != null; a = a.siguiente) {
            if (a.precio < min) min = a.precio;
        }
        return min;
    }
}
