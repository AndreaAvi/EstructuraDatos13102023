/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Tarea 9: Tablas hash
Fecha de entrega: 01/12/2022
Descripción: ADT HashTable, implementando el método para lidiar 
con colisones Open Adressing, con Linear Probing.
->TODAVÍA NO FUNCIONA<-
 */
package tareatablashash;

public class HashTableOA<K, V> {

    public class Entry<K, V> {

        private V value;
        private K key;

        public Entry(K key, V value) {
            this.value = value;
            this.key = key;
        }
    }

    Entry<K, V>[] table;
    int size;

    public HashTableOA(int size) {
        this.size = size;
        table = new Entry[size];
    }

    private int hashFunction(K key) {
        return (key.hashCode() % size);
    }

    private int probe(int x) {
        return x + 1;
    }

    public void add(K key, V value) {
        int index = hashFunction(key);

        for (int i = 0; i < table.length; i++) {
            if (index >= size) {
                return;
            }
            if (table[index] == null) {
                table[index] = new Entry(key, value);
                return;
            }
            index = probe(index);
            System.out.println("Guau se hizo un probe en " + value);
        }
    }

    /* public V valueOf(K key) {
        int index = hashFunction(key);
        for (int i = 0; i < table.length; i++) {
            if (index >= size) {
                return null;
            }
            if (table[index] == null) {
                index = probing(index);
            } else if (!table[index].key.equals(key)) {
                index = probing(index);
            }
        }
        if (index >= size) {
            return null;
        }
        if (table[index] == null) {
            return null;
        } else {
            return table[index].value;
        }
    }*/
    public V valueOf(K key) {
        int index = hashFunction(key);
        for (int i = 0; i < table.length; i++) {
            if (index >= size) {
                return null;
            }
            if (table[index] == null) {
                index = probe(index);
            } else if (!table[index].key.equals(i)) {
                index = probe(index);
            }
        }
        if(index>= size){
            return null;
        }
        if(table[index].key.equals(key)){
            return table[index].value;
        }
        return null;
    }

    /*public V remove(K key) {
        int index = hashFunction(key);
        for (int i = 0; i < table.length; i++) {
            if (index >= size) {
                return null;
            }
            if (table[index] == null) {
                index = probing(index);
            } else if (!table[index].key.equals(key)) {
                index = probing(index);
            }
        }
        if (index >= size) {
            return null;
        }
        if (table[index] == null) {
            return null;
        } else {
            if(table[index].key.equals(key))
        }
        V valueToDelete = table[index].value;
        table[index] = null;
        return valueToDelete;
    }*/
    @Override
    public String toString() {
        String table = "";
        for (int i = 0; i < this.table.length; i++) {
            if (this.table[i] == null) {
                table += "[" + i + "]: null \n";
            } else {
                table += "[" + i + "]: " + this.table[i].value + "\n";
            }
        }
        return table;
    }

}
