/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Tarea 7: Colas
Fecha de entrega: 22/11/2022
Descripción: Estructura de datos Queue, implementada
con Simple linked list
 */
package tareacolas;

public class QueueSLL<T> {

    private class Nodo<T> {

        private T dato;
        private Nodo<T> siguiente;

        public Nodo() {
        }

        public Nodo(T valor) {
            this.dato = valor;
        }

        public Nodo<T> getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo<T> siguiente) {
            this.siguiente = siguiente;
        }

        public T getDato() {
            return dato;
        }

        public void setDato(T dato) {
            this.dato = dato;
        }
    }

    private Nodo<T> head;

    public QueueSLL() {
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int length() {
        if (isEmpty()) {
            return 0;
        }
        int contador = 1;
        Nodo<T> curr = head;
        while (curr.getSiguiente() != null) {
            curr = curr.getSiguiente();
            contador++;
        }
        return contador;
    }

    public void enqueue(T val) {
        if (isEmpty()) {
            head = new Nodo(val);
            return;
        }
        Nodo<T> curr = head;
        while (curr.getSiguiente() != null) {
            curr = curr.getSiguiente();
        }
        curr.setSiguiente(new Nodo(val));
    }
    
    public T dequeue(){
        if (isEmpty()) {
            return null;
        }
        T datoAEliminar = head.getDato();
        head = head.getSiguiente();
        return datoAEliminar;
    }
    
    @Override
    public String toString() {
        String queue = "";
        Nodo<T> curr = head;
        for (int i = 0; i < length(); i++) {
            queue += ("[" + curr.getDato() + "] ");
            curr = curr.getSiguiente();
        }
        return queue;
    }

}
