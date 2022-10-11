/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Tarea 5: Listas simplemente ligadas.
Fecha de entrega: 11/10/2022
Descripción: Clase main para poner a prueba la estructura
lista simplemente ligada.
 */
package tarealistassimplementeligadas;

public class TareaListasSimplementeLigadas {

    public static void main(String[] args) {
        //-------Métodos constructores-------
        LinkedList<Integer> listaEnteros = new LinkedList<>();
        listaEnteros.LinkedList(29);
        LinkedList<Character> listaCaracteres = new LinkedList<>();

        
        //-------estaVacia()-------
        System.out.println("\n--Está vacía--");
        System.out.println("listaEnteros: " + listaEnteros.estaVacia());
        System.out.println("listaCaracteres: " + listaCaracteres.estaVacia());
        
        
        //-------getTamanio()-------
        System.out.println("\n--Tamaño--");
        System.out.println("listaEnteros: " + listaEnteros.getTamanio());
        System.out.println("listaCaracteres: " + listaCaracteres.getTamanio());
        
        
        //-------agregarAlFinal(valor)-------
        System.out.println("\n--Agregar al final--");
       
        listaEnteros.agregarAlFinal(23);
        listaEnteros.agregarAlFinal(55);
        listaEnteros.agregarAlFinal(84);
        listaEnteros.agregarAlFinal(97);
        System.out.print("listaEnteros: ");
        listaEnteros.transversal();
        
        listaCaracteres.agregarAlFinal('A');
        listaCaracteres.agregarAlFinal('L');
        listaCaracteres.agregarAlFinal('?');
        listaCaracteres.agregarAlFinal('p');
        listaCaracteres.agregarAlFinal('$');
        System.out.print("listaCaracteres: ");
        listaCaracteres.transversal();
        
        
        //-------agregarAlInicio(valor)-------
        System.out.println("\n--Agregar al inicio--");
       
        listaEnteros.agregarAlInicio(187);
        System.out.print("listaEnteros: ");
        listaEnteros.transversal();
        
        listaCaracteres.agregarAlInicio('B');
        System.out.print("listaCaracteres: ");
        listaCaracteres.transversal();
        
        
        //-------agregarDespuesDe(valor)-------
        System.out.println("\n--Agregar después de--");
       
        listaEnteros.agregarDespuesDe(23,222);
        System.out.print("listaEnteros: ");
        listaEnteros.transversal();
        
        listaCaracteres.agregarDespuesDe('?', 'H');
        System.out.print("listaCaracteres: ");
        listaCaracteres.transversal();
        
        
        //-------eliminar(posición)-------
        System.out.println("\n--Eliminar en posición--");
       
        listaEnteros.eliminar(1);
        System.out.print("listaEnteros: ");
        listaEnteros.transversal();
        
        listaCaracteres.eliminar(2);
        System.out.print("listaCaracteres: ");
        listaCaracteres.transversal();
        
        //-------eliminarElPrimero()-------
        System.out.println("\n--Eliminar el primero--");
       
        listaEnteros.eliminarElPrimero();
        System.out.print("listaEnteros: ");
        listaEnteros.transversal();
        
        listaCaracteres.eliminarElPrimero();
        System.out.print("listaCaracteres: ");
        listaCaracteres.transversal();
        
        //-------eliminarElFinal()-------
        System.out.println("\n--Eliminar el final--");
       
        listaEnteros.eliminarElFinal();
        System.out.print("listaEnteros: ");
        listaEnteros.transversal();
        
        listaCaracteres.eliminarElFinal();
        System.out.print("listaCaracteres: ");
        listaCaracteres.transversal();
        
        //-------buscar(valor)-------
        System.out.println("\n--Buscar valor--");
        System.out.println("222 se encuentra en listaEnteros en la posición: " + listaEnteros.buscar(222));
        System.out.println("p se encuentra en listaCaracteres en la posición: " + listaCaracteres.buscar('p'));
        
        //-------actualizar(aBuscar, valor)-------
        System.out.println("\n--Actualizar--");
        listaEnteros.actualizar(55, 95);
        System.out.print("listaEnteros: ");
        listaEnteros.transversal();
        
        listaCaracteres.actualizar('H', '&');
        System.out.print("listaCaracteres: ");
        listaCaracteres.transversal();
       
        
        

    }

}
