/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Proyecto Final: Collections Java
Fecha de entrega: 12/12/2022
Descripción: Desarrollar un programa sencillo que ejemplifique el uso de los 
métodos más importantes de las clases indicadas.
--LinkedHashMap--
 */
package proyectofinal;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapMain {
    public static void main(String[] args) {
        
        //--------Constructor()--------
        //Recibe los tipos de datos que se usaran en su llave, y en su valor.
        System.out.println("-----Se crea el LinkedHashMap 'vehiculos'-----");
        LinkedHashMap<String, String> vehiculos = new LinkedHashMap();
        System.out.println("Estado actual: " + vehiculos);
        System.out.println("Está vacío: " + vehiculos.isEmpty());
        
        //--------put()--------
        //Se agregan elementos al LinkedHashMap, especificando su llave y su valor.
        System.out.println("\n -----Se agregan elementos-----");
        vehiculos.put("aéreo", "avión");
        vehiculos.put("terrestre", "auto");
        vehiculos.put("espacial", "nave espacial");
        vehiculos.put("marino", "barco");
        System.out.println("Estado actual: " + vehiculos);
        //Nota: El toString() de esta clase se imprime InOrder, por default.
        System.out.println("Está vacío: " + vehiculos.isEmpty());
        
        //------get(key)-------
        //Se recuperan los valores asociados a una llave.
        System.out.println("\n ---Se accede a los elementos, por su llave---");
        System.out.println("aéreo: " + vehiculos.get("aéreo"));
        System.out.println("terrestre: " + vehiculos.get("terrestre"));
        System.out.println("espacial: " + vehiculos.get("espacial"));
        System.out.println("marino: " + vehiculos.get("marino"));
        //Si no existe, el método regresa null.
        System.out.println("submarino: " + vehiculos.get("submarino"));
        
        //------keySet()-------
        //Se recupera el conjunto de llaves contenidas en el LinkedHashMap.
        //Nota: Se observa que el orden es exactamente el mismo que se tenía 
        //cuando entraron las llaves.
        System.out.println("\n -----Se recupera el keySet de 'vehiculos'-----");
        System.out.println("keySet: " + vehiculos.keySet());
        
        //------values()-------
        //Se recupera el conjunto de valores contenidos en el LinkedHashMap.
        System.out.println("\n -----Se recuperan los valores de 'vehiculos'-----");
        System.out.println("values: " + vehiculos.values());
        
        //------entrySet()-------
        //Se recupera el conjunto de entradas (Pares de valores y llaves) 
        //contenidos en el LinkedHashMap.
        System.out.println("\n -----Se recuperan las entradas de 'vehiculos'-----");
        System.out.println("entries: " + vehiculos.entrySet());
        
        //------repace(key, newValue)-------
        //Se reemplaza el valor asociado a la llave indicada, por el valor indicado.
        System.out.println("\n -Se reemplaza el valor en la llave 'aéreo', por 'helicóptero'-");
        vehiculos.replace("aéreo", "helicóptero");
        System.out.println("Estado actual: " + vehiculos);
        
        //------remove(key)-------
        //Se elimina la entrada asociada a la llave indicada.
        System.out.println("\n --Se elimina la entrada de la llave 'espacial'--");
        vehiculos.remove("espacial");
        System.out.println("Estado actual: " + vehiculos);
        
        //-----Iteradores-----
        //--Iterar llaves---
        System.out.println("\nIterar llaves: ");
        for (String key : vehiculos.keySet()) {
            System.out.println("\t" + key);
        }
        
        //--Iterar valores---
        System.out.println("\nIterar valores: ");
        for (String value : vehiculos.values()) {
            System.out.println("\t" + value);
        }
        
        //--Iterar entradas---
        System.out.println("\nIterar entradas: ");
        for (Map.Entry<String, String> entry : vehiculos.entrySet()) {
            System.out.println("\t" + entry);
        }
    }
}
