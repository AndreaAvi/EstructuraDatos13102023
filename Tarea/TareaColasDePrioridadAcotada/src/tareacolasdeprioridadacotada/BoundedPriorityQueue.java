/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Tarea 8: Colas de prioridad acotada
Fecha de entrega: 22/11/2022
Descripción: Estructura de datos BoundedPriorityQueue, implementada
con Array estático. 
 */
package tareacolasdeprioridadacotada;

public class BoundedPriorityQueue<T> {

    private Queue<T>[] data;
    private int size = 0;

    public BoundedPriorityQueue(int levels) {
        data =  new Queue[levels];
        for (int i = 0; i < data.length; i++) {
            data[i] = new Queue<>();
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int length() {
        return size;
    }

    public void enqueue(int priority, T element) {
        if (priority > data.length) {
            return;
        }
        data[priority].enqueue(element);
        size++;
    }
    
    public T dequeue(){
        for (Queue<T> data : data) {
            if (!data.isEmpty()) {
                size--;
                return data.dequeue();
            }
        }
        return null;
    }
    
     @Override
    public String toString() {
        String boundedPriorityQueue = "";
        for (int i = 0; i < data.length; i++) {
            boundedPriorityQueue += "Nivel " + i +": "+  data[i] + "\n";
        }
        return  boundedPriorityQueue;
    }

}
