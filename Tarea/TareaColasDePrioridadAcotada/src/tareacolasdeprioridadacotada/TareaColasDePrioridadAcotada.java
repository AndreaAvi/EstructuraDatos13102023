/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Tarea 8: Colas de prioridad acotada
Fecha de entrega: 22/11/2022
Descripción: Prueba de ADT BoundedPriorityQueue, con Array estático.
Simulación de ejemplo "Evacuación de barco". 
 */
package tareacolasdeprioridadacotada;

public class TareaColasDePrioridadAcotada {

    public static void main(String[] args) {

        //Constructor con número de niveles
        BoundedPriorityQueue<String> barco = new BoundedPriorityQueue<>(7);

        //-------isEmpty()------- (cuando la cola está vacía)
        System.out.println("El barco salvavidas está vacío: " + barco.isEmpty());

        //Se agregan los elementos, con su prioridad
        System.out.println("\n -----Se suben las personas-----\n");
        barco.enqueue(4, "Maestre");
        barco.enqueue(2, "Niños");
        barco.enqueue(4, "Mecánico");
        barco.enqueue(3, "Mujeres");
        barco.enqueue(2, "3a Edad");
        barco.enqueue(1, "Niñas");
        barco.enqueue(3, "Hombres");
        barco.enqueue(4, "Vigia");
        barco.enqueue(5, "Capitán");
        barco.enqueue(4, "Timonel");

        //-------isEmpty()------- (cuando la cola no está vacía)
        System.out.println("El barco salvavidas está vacío: " + barco.isEmpty());

        //Se imprime la Priority Bounded Queue para ver su estado y la manera 
        //en que se agregaron,según su prioridad.
        //-------toString()------- 
        System.out.println("\nBarco salvavidas:\n" + barco);

        //-------length()------- (número total de elementos en la cola)
        System.out.println("Personas en los barcos salvavidas: " + barco.length());

        //-------dequeue()------- (se quita el elemento con mayor prioridad)
        //**Esto no fue parte del ejemplo en clase, pero se incluye para
        //demostrar que el método funciona.
        System.out.println("\nSe tira por la borda a: " + barco.dequeue()
                + " y " + barco.dequeue());

        //-------toString()------- 
        System.out.println("\nBarco salvavidas:\n" + barco);

        //-------length()------- (número total de elementos en la cola)
        System.out.println("Personas en los barcos salvavidas: " + barco.length());

    }
}
