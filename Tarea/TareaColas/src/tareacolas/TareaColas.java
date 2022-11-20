/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Tarea 7: Colas
Fecha de entrega: 22/11/2022
Descripción: Prueba de ADT Queue, con ArrayList y con ListaLigada.
 */
package tareacolas;

public class TareaColas {

    public static void main(String[] args) {
        //Queue implementada con ArrayList;
        System.out.println("\n-----Queue implementada con ArrayList-----");
        
        //-------Constructor-------
        QueueAL<String> colores = new QueueAL<>();
        
        //-------isEmpty()------- (cuando no tiene elementos)
        System.out.println("Está vacía: " + colores.isEmpty());
        
        //-------length()------- (cuando no tiene elementos)
        System.out.println("Tamaño: " + colores.length());
        
        //-------enqueue()-----
        System.out.println("\n -----Se agregan elementos-----\n");
        colores.enqueue("Rojo");
        colores.enqueue("Rosa");
        colores.enqueue("Morado");
        colores.enqueue("Negro");
        colores.enqueue("Azul");
        
        
        //-------isEmpty()------- (cuando tiene elementos)
        System.out.println("Está vacía: " + colores.isEmpty());
        
        //-------length()------- (cuando tiene elementos)
        System.out.println("Tamaño: " + colores.length());
        
        //-------toString()-------
        System.out.println("\nColores: \n" + colores);
        
        //-------dequeue()-------
        System.out.println("\nSe quita el primer elemento en entrar: " + colores.dequeue());
        
        //-------toString()-------
        System.out.println("\nColores: \n" + colores);
        
        
        //---------------------------------------------------------------------
   
        
        //Queue implementada con Simple Linked List;
        System.out.println("\n-----Queue implementada con Simple Linked List-----");
        
        //-------Constructor-------
        QueueSLL<String> profesiones = new QueueSLL<>();
        
        //-------isEmpty()------- (cuando no tiene elementos)
        System.out.println("Está vacía: " + profesiones.isEmpty());
        
        //-------length()------- (cuando no tiene elementos)
        System.out.println("Tamaño: " + profesiones.length());
        
        //-------enqueue()-----
        System.out.println("\n -----Se agregan elementos-----\n");
        profesiones.enqueue("Docente");
        profesiones.enqueue("Médica/o");
        profesiones.enqueue("Ingeniera/o");
        profesiones.enqueue("Presidente");
        profesiones.enqueue("Contador/a");
        
        
        //-------isEmpty()------- (cuando tiene elementos)
        System.out.println("Está vacía: " + profesiones.isEmpty());
        
        //-------length()------- (cuando tiene elementos)
        System.out.println("Tamaño: " + profesiones.length());
        
        //-------toString()-------
        System.out.println("\nProfesiones: \n" + profesiones);
        
        //-------dequeue()-------
        System.out.println("\nSe quita el primer elemento en entrar: " + profesiones.dequeue());
        
        //-------toString()-------
        System.out.println("\nProfesiones: \n" + profesiones);

    }
    
}
