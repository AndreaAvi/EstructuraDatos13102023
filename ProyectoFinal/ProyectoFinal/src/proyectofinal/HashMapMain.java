/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Proyecto Final: Collections Java
Fecha de entrega: 12/12/2022
Descripción: Desarrollar un programa sencillo que ejemplifique el uso de los 
métodos más importantes de las clases indicadas.
--HashMap--
 */
package proyectofinal;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

    public static void main(String[] args) {

        //--------Constructor()--------
        //Recibe los tipos de datos que se usaran en su llave, y en su valor.
        //Su capacidad y load factor es el default, 
        //es decir, capacidad 8 y load factor de 0.6.
        System.out.println("-----Se crea el hash map 'movies'-----");
        HashMap<String, String> movies = new HashMap();
        System.out.println("Estado actual: " + movies);
        System.out.println("Está vacío: " + movies.isEmpty());

        //--------put()--------
        //Se agregan elementos al HashMap, especificando su llave y su valor.
        System.out.println("\n -----Se agregan elementos-----");
        movies.put("Horror", "Midsommar");
        movies.put("Drama", "Lady Bird");
        movies.put("SciFi", "Arrival");
        System.out.println("Estado actual: " + movies);
        System.out.println("Está vacío: " + movies.isEmpty());

        //------get(key)-------
        //Se recuperan los valores asociados a una llave.
        System.out.println("\n ---Se accede a los elementos, por su llave---");
        System.out.println("Horror: " + movies.get("Horror"));
        System.out.println("Drama: " + movies.get("Drama"));
        System.out.println("SciFi: " + movies.get("SciFi"));
        //Si no existe, el método regresa null.
        System.out.println("Comedies: " + movies.get("Comedies"));
        
        //------keySet()-------
        //Se recupera el conjunto de llaves contenidas en el HashMap.
        //Nota: Se observa que el orden parece ser aleatorio, aunque sabemos
        //que este es resultado de el hashing realizado por cada llave.
        System.out.println("\n -----Se recupera el keySet de 'movies'-----");
        System.out.println("keySet: " + movies.keySet());
        
        //------values()-------
        //Se recupera el conjunto de valores contenidos en el HashMap.
        System.out.println("\n -----Se recuperan los valores de 'movies'-----");
        System.out.println("values: " + movies.values());
        
        //------entrySet()-------
        //Se recupera el conjunto de entradas (Pares de valores y llaves) 
        //contenidos en el HashMap.
        System.out.println("\n -----Se recuperan las entradas de 'movies'-----");
        System.out.println("entries: " + movies.entrySet());
        
        //------repace(key, newValue)-------
        //Se reemplaza el valor asociado a la llave indicada, por el valor indicado.
        System.out.println("\n -Se reemplaza el valor en la llave 'SciFi', por 'Annihilation'-");
        movies.replace("SciFi", "Annihilation");
        System.out.println("Estado actual: " + movies);
        
        //------remove(key)-------
        //Se elimina la entrada asociada a la llave indicada.
        System.out.println("\n --Se elimina la entrada de la llave 'Drama'--");
        movies.remove("Drama");
        System.out.println("Estado actual: " + movies);
        
        //-----Iteradores-----
        //--Iterar llaves---
        System.out.println("\nIterar llaves: ");
        for (String key : movies.keySet()) {
            System.out.println("\t" + key);
        }
        
        //--Iterar valores---
        System.out.println("\nIterar valores: ");
        for (String value : movies.values()) {
            System.out.println("\t" + value);
        }
        
        //--Iterar entradas---
        System.out.println("\nIterar entradas: ");
        for (Map.Entry<String, String> entry : movies.entrySet()) {
            System.out.println("\t" + entry);
        }
    }
}
