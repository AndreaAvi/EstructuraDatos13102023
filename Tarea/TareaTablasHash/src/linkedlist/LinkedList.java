/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Tarea 9: Tablas hash
Fecha de entrega: 01/12/2022
Descripción: ListaLigada usada en HashTableADT.
 */
package linkedlist;

public class LinkedList<T> {

   public Nodo<T> head;

    public void LinkedList() {
        head = null;
    }

    public void LinkedList(T val) {
        head = new Nodo(val);
    }

    public boolean estaVacia() {
        return head == null;
    }

    public int getTamanio() {
        if (head == null) {
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

    public void agregarAlFinal(T val) {
        if (head == null) {
            head = new Nodo(val);
            return;
        }
        Nodo<T> curr = head;
        while (curr.getSiguiente() != null) {
            curr = curr.getSiguiente();
        }
        curr.setSiguiente(new Nodo(val));
    }

    public void agregarAlInicio(T val) {
        Nodo<T> curr = new Nodo(val);
        curr.setSiguiente(head);
        head = curr;
    }

    public void agregarDespuesDe(T referencia, T val) {
        if (this.buscar(referencia) == -1) {
            return;
        }
        Nodo<T> curr = head;
        while (curr.getSiguiente() != null) {
            if (curr.getDato().equals(referencia)) {
                curr.setSiguiente(new Nodo(val, curr.getSiguiente()));
                return;
            } else {
                curr = curr.getSiguiente();
            }
        }
    }

    public void eliminar(int posicion) {
        if (posicion > this.getTamanio()) {
            return;
        }
        if (posicion == 0) {
            this.eliminarElPrimero();
            return;
        }
        Nodo<T> curr = head;
        Nodo<T> prev = null;
        int index = 0;
        while (index < posicion && curr.getSiguiente() != null) {
            prev = curr;
            curr = curr.getSiguiente();
            index++;
        }
        if (index < posicion) {
            return;
        }
        prev.setSiguiente(curr.getSiguiente());
    }

    public void eliminarElPrimero() {
        if (head == null) {
            return;
        }
        head = head.getSiguiente();
    }

    public void eliminarElFinal() {
        if (head == null) {
            return;
        }
        Nodo<T> curr = head;
        Nodo<T> prev = null;
        while (curr.getSiguiente() != null) {
            prev = curr;
            curr = curr.getSiguiente();
        }
        prev.setSiguiente(null);
        curr = null;
    }

    public int buscar(T valor) {
        int index = 0;
        Nodo<T> curr = head;
        while (curr != null) {
            if (curr.getDato().equals(valor)) {
                return index;
            }
            index++;
            curr = curr.getSiguiente();
        }
        if (index == this.getTamanio()) {
            return -1;
        }
        return index;
    }

    public void actualizar(T aBuscar, T val) {
        if (this.buscar(aBuscar) == -1) {
            return;
        }
        Nodo<T> curr = head;
        while (curr.getSiguiente() != null) {
            if (curr.getDato().equals(aBuscar)) {
                curr.setDato(val);
            } else {
                curr = curr.getSiguiente();
            }
        }
    }

    public void transversal() {
        this.imprimir(this.head);
    }

    private void imprimir(Nodo<T> head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        System.out.print(head);
        imprimir(head.getSiguiente());
    }
    
    
}
