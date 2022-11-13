/*
*Código hecho en clase (Estructura de Datos 2023-I)
Tarea 6: Pilas
Fecha de entrega: 18/11/2023
Descripción: Nodo simple
 */
package nodosimple;

public class Nodo<T> {
    
    private T dato;
    private Nodo<T> siguiente;
    
    public Nodo() {
    }

    public Nodo(T valor) {
        this.dato = valor;
    }

    public Nodo(T dato, Nodo<T> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
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

    @Override
    public String toString() {
        
        return "|"+dato+"| -->"; 
    }
}
