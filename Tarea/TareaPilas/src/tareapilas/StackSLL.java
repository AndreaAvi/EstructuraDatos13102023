/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Tarea 6: Pilas
Fecha de entrega: 18/11/2022
Descripción: Estructura de datos Stack, implementada
con Lista Ligada Simple.
 */
package tareapilas;

import nodosimple.Nodo;

public class StackSLL <T>{
   
    Nodo<T> top;

    public StackSLL() {
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    
    public int length(){
        if (isEmpty()) {
            return 0;
        }
        int contador = 1;
        Nodo<T> curr = top;
        while (curr.getSiguiente() != null) {
            curr = curr.getSiguiente();
            contador++;
        }
        return contador;
    }
    
    public T pop(){
        if (isEmpty()) {
            return null;
        }
        T valToPop = top.getDato();
        top = top.getSiguiente();
        return valToPop;
    }
    
    public T peek(){
        if (isEmpty()) {
            return null;
        }
        return top.getDato();
    }
    
    public void push(T val){
        Nodo<T> curr = new Nodo(val);
        curr.setSiguiente(top);
        top = curr;
    }

    @Override
    public String toString() {
        String stack = "";
        Nodo<T> curr = top;
        for (int i = length()-1; i >= 0; i--) {
            stack += ("[" + curr.getDato() + "]\n");
            curr = curr.getSiguiente();
        }
        return stack;
    }
    
}
