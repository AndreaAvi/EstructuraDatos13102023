/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Tarea 9: Tablas hash
Fecha de entrega: 01/12/2022
Descripción: ADT HashTable, implementando el método para lidiar 
con colisones Separate Chaining.
 */
package tareatablashash;

import  linkedlist.*;

public class HashTableSC<K, V> {

    public class Entry<K, V> {

        private V value;
        private K key;

        public Entry(K key, V value) {
            this.value = value;
            this.key = key;
        }
    }

    private int size;
    private LinkedList<Entry>[] table;

    public HashTableSC(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hashFunction(K key) {
        return key.hashCode() % size;
    }

    public void add(K key, V value) {
        int index = hashFunction(key);
        table[index].agregarAlFinal(new Entry(key, value));
    }

    public V valueOf(K key) {
        int index = hashFunction(key);
        if (table[index].estaVacia()) {
            return null;
        }
        Nodo<Entry> aux = table[index].head;
        while (aux != null && !aux.getDato().key.equals(key)) {
            aux = aux.getSiguiente();
        }
        if (aux == null) {
            return null;
        }
        return (V) aux.getDato().value;
    }

    public V remove(K key) {
        int index = hashFunction(key);
        if (table[index].estaVacia()) {
            return null;
        }
        Nodo<Entry> aux = table[index].head;
        int auxPosicion = 0;
        while (aux != null && !aux.getDato().key.equals(key)) {
            aux = aux.getSiguiente();
            auxPosicion++;
        }
        if (aux == null) {
            return null;
        }
        V valueToDelete = (V) aux.getDato().value;
        table[index].eliminar(auxPosicion);
        return valueToDelete;

    }

    //Se incluye el método toString para ilustrar
    //el funcionamiento de la tabla, sin embargo, este
    //método no se solicitó en la tarea.
    @Override
    public String toString() {
        String table = "";
        for (int i = 0; i < this.table.length; i++) {
            if (this.table[i].estaVacia()) {
                table += "[" + i + "]: null \n";
            } else {
                Nodo<Entry> aux = this.table[i].head;
                String slot = "";
                while (aux.getSiguiente() != null) {
                    slot += aux.getDato().value + "-->";
                    aux = aux.getSiguiente();
                }
                slot += aux.getDato().value + "-->null";
                table += "[" + i + "]: " + slot + "\n";
            }
        }
        return table;
    }
}
