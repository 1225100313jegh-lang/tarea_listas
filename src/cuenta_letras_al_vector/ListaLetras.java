package src.cuenta_letras_al_vector;

public class ListaLetras {
    private Nodo cabeza;
    private Nodo cola;

    // 1) Creamos la secuencia para todo el abecedario
    public ListaLetras() {
        for (char l = 'a'; l <= 'z'; l++) {
            Nodo n = new Nodo(l);
            if (cabeza == null) cabeza = n;
            else cola.siguiente = n;
            cola = n;
        }
    }

    /*Hacemos el ciclo while para que realize la busqueda de cada letra primero verificando que eista otr
	y que el nodo no apunte a nul y luego compara para saber si es la letra que esta buscando si no es pasa
	a la siguiente letra*/
    public void contar(char letra) {
        Nodo actual = cabeza;
        while (actual != null && actual.letra != letra) {
            actual = actual.siguiente;
        }
        if (actual != null) actual.cuenta++;
    }

    /*Se hacen ambas cadenas para mostrar el resultado tanto en digitos como en una cadena concatenada*/
    public String resultado() {
        StringBuilder sb = new StringBuilder();

        // Primera línea: los 26 números
        for (Nodo a = cabeza; a != null; a = a.siguiente) {
            sb.append(a.cuenta);
            sb.append(a.siguiente != null ? " " : "\n");
        }

        // Una línea por cada letra que sí apareció
        for (Nodo a = cabeza; a != null; a = a.siguiente) {
            if (a.cuenta > 0) {
                sb.append("La letra ").append(a.letra)
                  .append(" aparece ").append(a.cuenta)
                  .append(" veces\n");
            }
        }

        return sb.toString();
    }
}