/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Tarea 9: Tablas hash
Fecha de entrega: 01/12/2022
Descripción: Prueba de ADT HashTable, implementando el método para lidiar 
con colisones Separate Chaining.
 */
package tareatablashash;

public class TareaTablasHash {

    public static void main(String[] args) {

        //-------Constructor con tamaño de tabla-------
        HashTableSC<Integer, String> alumnos = new HashTableSC<>(5);

        //---------add(key, value)---------
        System.out.println("\n -----Se agregan elementos-----\n");
        alumnos.add(319017517, "Andrea");
        alumnos.add(419018227, "Patricio");
        alumnos.add(309454789, "Juan");
        alumnos.add(318471169, "Pedro");
        alumnos.add(316774833, "Jessica");
        System.out.println(alumnos);

        //--------valueOf(key)-------
        //(con llave existente)
        System.out.println("El elemento con la llave 319017517 es : "
                + alumnos.valueOf(319017517) + "\n");
        //(con llave inexistente)
        System.out.println("El elemento con la llave 23 es : "
                + alumnos.valueOf(23) + "\n");

        //--------remove(key)-------
        //(con llave existente)
        System.out.println("Se elimina el elemento con la llave 419018227: "
                + alumnos.remove(419018227) + "\n");
        System.out.println("Tabla actualizada: \n" + alumnos);
        //(con llave inexistente)
        System.out.println("Se elimina el elemento con la llave 23: "
                + alumnos.remove(23) + "\n");
        System.out.println("Tabla actualizada: \n" + alumnos);

    }
}
