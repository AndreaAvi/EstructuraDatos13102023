/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Tarea 6: Pilas
Fecha de entrega: 18/11/2022
Descripción: Prueba de ADT Stack, con ArrayList y con ListaLigada;
 */
package tareapilas;


public class TareaPilas {
    
    public static void main(String[] args) {
        
        //Stack implementada con ArrayList;
        System.out.println("\n-----Stack implementada con ArrayList-----");
        
        //-------Constructor-------
        StackAL<String> animales = new StackAL<>();
        
        //-------isEmpty()------- (cuando no tiene elementos)
        System.out.println("Está vacía: " + animales.isEmpty());
        
        //-------length()------- (cuando no tiene elementos)
        System.out.println("Tamaño: " + animales.length());
        
        //-------push()-----
        System.out.println("\n -----Se agregan elementos-----\n");
        animales.push("Gato");
        animales.push("Vaca");
        animales.push("Caballo");
        animales.push("Perro");
        animales.push("Gallina");
        
        
        //-------isEmpty()------- (cuando tiene elementos)
        System.out.println("Está vacía: " + animales.isEmpty());
        
        //-------length()------- (cuando tiene elementos)
        System.out.println("Tamaño: " + animales.length());
        
        //-------toString()-------
        System.out.println("\nAnimales: \n" + animales);
        
        //-------pop()-------
        System.out.println("Se quita el primer elemento: " + animales.pop());
        
        //-------toString()-------
        System.out.println("\nAnimales: \n" + animales);
        
        //-------peek()-------
        System.out.println("Ahora, el primer elemento es: " + animales.peek());
        
        //-------toString()-------
        System.out.println("\nAnimales: \n" + animales);
        
        //-------isFull()-------
        //No se incuyó este método, puesto que se implementó ArrayList, por lo
        //que no hay un límite de elementos.
        
        
        //---------------------------------------------------------------------
        
        
        //Stack implementada con ListaLigadaSimple;
        System.out.println("\n-----Stack implementada con ListaLigadaSimple-----");
        
        //-------Constructor-------
        StackSLL<String> paises = new StackSLL<>();
        
        //-------isEmpty()------- (cuando no tiene elementos)
        System.out.println("Está vacía: " + paises.isEmpty());
        
        //-------length()------- (cuando no tiene elementos)
        System.out.println("Tamaño: " + paises.length());
        
        //-------push()-----
        System.out.println("\n -----Se agregan elementos-----\n");
        paises.push("México");
        paises.push("Australia");
        paises.push("Perú");
        paises.push("Chile");
        paises.push("Japón");
        
        
        //-------isEmpty()------- (cuando tiene elementos)
        System.out.println("Está vacía: " + paises.isEmpty());
        
        //-------length()------- (cuando tiene elementos)
        System.out.println("Tamaño: " + paises.length());
        
        //-------toString()-------
        System.out.println("\nPaíses: \n" + paises);
        
        //-------pop()-------
        System.out.println("Se quita el primer elemento: " + paises.pop());
        
        //-------toString()-------
        System.out.println("\nPaíses: \n" + paises);
        
        //-------peek()-------
        System.out.println("Ahora, el primer elemento es: " + paises.peek());
        
        //-------toString()-------
        System.out.println("\nPaíses: \n" + paises);
        
        //-------isFull()-------
        //No se incuyó este método, puesto que se implementó ListaLigada, por lo
        //que no hay un límite de elementos.

    }
    
}
