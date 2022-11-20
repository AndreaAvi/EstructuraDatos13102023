/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Tarea 7: Colas
Fecha de entrega: 22/11/2022
Descripción: Estructura de datos Queue, implementada
con ArrayList.
 */
package tareacolas;

import java.util.ArrayList;

public class QueueAL<T> {

    private ArrayList<T> datos;

    public QueueAL() {
        datos = new ArrayList<>();
    }

    public boolean isEmpty() {
        return datos.isEmpty();
    }

    public int length() {
        return datos.size();
    }

    public void enqueue(T val) {
        datos.add(val);
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        return datos.remove(0);
    }

    @Override
    public String toString() {
        String queue = "";
        for (int i = 0; i < length(); i++) {
            queue += ("[" + datos.get(i) + "] ");
        }
        return queue;
    }

}
