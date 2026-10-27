package src.supermercado;

public class ListaProductos {
    private Nodo cabeza;

    /*creamos la funcion insertar para que se vaya organizando segun su precio siendo del mas caro al mas barato*/
    public void insertar(String nombre, double precio) {
        Nodo n = new Nodo(nombre, precio);

        // Si el nuevo producto es mas caro directamente se agrega al inicio
        if (cabeza == null || precio >= cabeza.precio) {
            n.siguiente = cabeza;
            cabeza = n;
            return;
        }

/*si no es el mas aro se agrega al siguiente y se evalua de nuevo asi hasta que llegue a la cola*/
        Nodo a = cabeza;
        while (a.siguiente != null && a.siguiente.precio > precio) {
            a = a.siguiente;
        }
        n.siguiente = a.siguiente;
        a.siguiente = n;
    }

/*ingresamos la cadena que se convertira en el ticket*/
    public String resultado() {
        StringBuilder sb = new StringBuilder();
        double total = 0;
        int numero = 1;
/*agregamos los productos a la lista en este caso siendo el ticket*/
        for (Nodo a = cabeza; a != null; a = a.siguiente) {
            sb.append(numero).append(" | ")
              .append(a.nombre).append(" | ")
              .append(formato(a.precio)).append("\n");
            total += a.precio;
            numero++;
        }

        sb.append("\n").append(formato(total)).append("\n");
        return sb.toString();
    }

/*cremos la funcion para darle el formato correcto siendo el redondeo de los valores ingresados*/
    private String formato(double valor) {
        double r = Math.round(valor * 100) / 100.0;
        if (r == (long) r) {
            return "" + (long) r;
        }
        return "" + r;
    }
}
