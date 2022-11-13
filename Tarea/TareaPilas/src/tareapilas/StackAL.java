/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Tarea 6: Pilas
Fecha de entrega: 18/11/2022
Descripción: Estructura de datos Stack, implementada
con ArrayList.
 */
package tareapilas;

import java.util.ArrayList;

public class StackAL<T> {

    private ArrayList<T> datos;
    private int top;

    public StackAL() {
        datos = new ArrayList<>();
        top = -1;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public int length() {
        return datos.size();
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        top--;
        return datos.remove(datos.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return datos.get(top);
    }

    public void push(T value) {
        datos.add(value);
        top++;
    }

    @Override
    public String toString() {
        String stack = "";
        for (int i = top; i >= 0; i--) {
            stack += ("[" + datos.get(i) + "]\n");
        }
        return stack;
    }

}
