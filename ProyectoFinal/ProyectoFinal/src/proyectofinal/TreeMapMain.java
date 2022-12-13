/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Proyecto Final: Collections Java
Fecha de entrega: 12/12/2022
Descripción: Desarrollar un programa sencillo que ejemplifique el uso de los 
métodos más importantes de las clases indicadas.
--TreeMap--
 */
package proyectofinal;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapMain {
    public static void main(String[] args) {
        
        //--------Constructor()--------
        //Recibe los tipos de datos que se usaran en su llave, y en su valor.
        //En este caso, los elementos del árbol se ordenarán en orden ascendente.
        System.out.println("-----Se crea el tree map 'personas'-----");
        TreeMap<Integer, String> personas = new TreeMap();
        System.out.println("Estado actual: " + personas);
        System.out.println("Está vacío: " + personas.isEmpty());
        
        //--------put()--------
        //Se agregan elementos al TreeMap, especificando su llave y su valor.
        System.out.println("\n -----Se agregan elementos-----");
        personas.put(12, "Alejandra");
        personas.put(3, "Karina");
        personas.put(5, "Natalie");
        personas.put(4, "María");
        personas.put(15, "Diana");
        personas.put(13, "Daniela");
        System.out.println("Estado actual: " + personas);
        //Nota: El toString() de esta clase se imprime InOrder, por default.
        System.out.println("Está vacío: " + personas.isEmpty());
        
        //------get(key)-------
        //Se recuperan los valores asociados a una llave.
        System.out.println("\n ---Se accede a los elementos, por su llave---");
        System.out.println("12: " + personas.get(12));
        System.out.println("3: " + personas.get(3));
        System.out.println("5: " + personas.get(5));
        System.out.println("4: " + personas.get(4));
        System.out.println("15: " + personas.get(15));
        System.out.println("13: " + personas.get(13));
        //Si no existe, el método regresa null.
        System.out.println("6: " + personas.get(6));
        
        //------keySet()-------
        //Se recupera el conjunto de llaves contenidas en el TreeMap.
        //NOta: El orden de las llaves es InOrder.
        System.out.println("\n -----Se recupera el keySet de 'movies'-----");
        System.out.println("keySet: " + personas.keySet());
        
        //------values()-------
        //Se recupera el conjunto de valores contenidos en el TreeMap.
        System.out.println("\n -----Se recuperan los valores de 'movies'-----");
        System.out.println("values: " + personas.values());
        
        //------entrySet()-------
        //Se recupera el conjunto de entradas (Pares de valores y llaves) 
        //contenidos en el TreeMap.
        System.out.println("\n -----Se recuperan las entradas de 'movies'-----");
        System.out.println("entries: " + personas.entrySet());
        
        //------repace(key, newValue)-------
        //Se reemplaza el valor asociado a la llave indicada, por el valor indicado.
        System.out.println("\n -Se reemplaza el valor en la llave '15', por 'Juana'-");
        personas.replace(15, "Juana");
        System.out.println("Estado actual: " + personas);
        
        //------remove(key)-------
        //Se elimina la entrada asociada a la llave indicada.
        System.out.println("\n --Se elimina la entrada de la llave '13'--");
        personas.remove(13);
        System.out.println("Estado actual: " + personas);
        
        //-----Iteradores-----
        //--Iterar llaves---
        System.out.println("\nIterar llaves: ");
        for (Integer key : personas.keySet()) {
            System.out.println("\t" + key);
        }
        
        //--Iterar valores---
        System.out.println("\nIterar valores: ");
        for (String value : personas.values()) {
            System.out.println("\t" + value);
        }
        
        //--Iterar entradas---
        System.out.println("\nIterar entradas: ");
        for (Map.Entry<Integer, String> entry : personas.entrySet()) {
            System.out.println("\t" + entry);
        }
        
        //-----Métodos de navegación-----
        System.out.println("\n --Métodos de navegación--");
        
        //------firstKey(), firstEntry()-------
        //Regresa la primera llave/entrada del mapa (la menor).
        System.out.println("\n --First--");
        System.out.println("\tFirst key: " + personas.firstKey());
        System.out.println("\tFirst entry: " + personas.firstEntry());
        
        //------lastKey(), lastEntry()-------
        //Regresa la última llave/entrada del mapa (la mayor).
        System.out.println("\n --Last--");
        System.out.println("\tLast key: " + personas.lastKey());
        System.out.println("\tLast entry: " + personas.lastEntry());

        
       //-----Métodos Ceiling, Floor, Higher y Lower-----
       System.out.println("\n --Métodos Métodos Ceiling, Floor, Higher y Lower--");
       
       //------higherKey(), higherEntry()-------
        //Regresa la llave/entrada que es menor entre aquellas que sean mayor que 
        //la llave especificada.
        System.out.println("\n --Higher(5)--");//Dede regresar 12 y el valor 
                                               //asociado a 12.
        System.out.println("\tHigher key: " + personas.higherKey(5));
        System.out.println("\tHigher entry: " + personas.higherEntry(5));
        
        //------lowerKey(), lowerEntry()-------
        //Regresa la llave/entrada que es mayor entre aquellas que sean menor que 
        //la llave especificada.
        System.out.println("\n --Lower(5)--");//Dede regresar 4 y el valor 
                                               //asociado a 4.
        System.out.println("\tLower key: " + personas.lowerKey(5));
        System.out.println("\tLower entry: " + personas.lowerEntry(5));
        
        //------ceilingKey(), ceilingEntry()-------
        //Regresa la llave/entrada que es menor entre aquellas que sean mayor que 
        //la llave especificada. Si la llave/entrada especificada está presente
        //en el mapa, regresa esa llave/entrada.
        System.out.println("\n --Ceiling(5)--");//Dede regresar 5 y el valor 
                                               //asociado a 5.
        System.out.println("\tCeiling key: " + personas.ceilingKey(5));
        System.out.println("\tCeiling entry: " + personas.ceilingEntry(5));
        
        System.out.println("\n --Ceiling(10)--");//Dede regresar 12 y el valor 
                                               //asociado a 12.
        System.out.println("\tCeiling key: " + personas.ceilingKey(10));
        System.out.println("\tCeiling entry: " + personas.ceilingEntry(10));
        
        //------floorKey(key), floorEntry(key)-------
        //Regresa la llave/entrada que es mayor entre aquellas que sean menor que 
        //la llave especificada. Si la llave/entrada especificada está presente
        //en el mapa, regresa esa llave/entrada.
        System.out.println("\n --Floor(5)--");//Dede regresar 5 y el valor 
                                               //asociado a 5.
        System.out.println("\tFloor key: " + personas.floorKey(5));
        System.out.println("\tFloor entry: " + personas.floorEntry(5));
        
        System.out.println("\n --Floor(13)--");//Dede regresar 12 y el valor 
                                               //asociado a 12.
        System.out.println("\tFloor key: " + personas.floorKey(13));
        System.out.println("\tFloor entry: " + personas.floorEntry(13));
        
        //-----Métodos headMap(), tailMap() y subMap()-----
       System.out.println("\n --Métodos headMap(), tailMap() y subMap()--\n");
       
       //--headMap(key)--
       //Regresa todos los pares de llaves-valores del TreeMap, antes del valor
       //especificado.
        System.out.println("\theadMap(5): "+ personas.headMap(5));
        
       //--tailMap(key)--
       //Regresa todos los pares de llaves-valores del TreeMap, después del valor
       //especificado, incluyendo el valor especificado.
        System.out.println("\ttailMap(5): "+ personas.tailMap(5));
        
        //--subMap(key)--
       //Regresa todos los pares de llaves-valores del TreeMap, 
       //a partir de la primera llave, y antes de la segunda.
        System.out.println("\tsubMap(4,12): "+ personas.subMap(4,12));
    }
}
