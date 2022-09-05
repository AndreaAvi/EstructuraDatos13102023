/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
*Hecho a partir del código visto en el curso Estructura de Datos 2023-I
Tarea 3: Empresa
Fecha de entrega: 06/09/2022
Descripción: ADT Arreglo, con el uso de tipo d edatos genéricos.
 */
package tarea.empresa;

public class Arreglo<T> {

    private int tamanio;
    private T[] valores;

    //Arreglo( int tamanio ): constructor.
    public Arreglo(int tamanio) {
        this.tamanio = tamanio;
        this.valores = (T[]) new Object[tamanio];
        if (this.tamanio <= 0) { //<-Tamaño mayor a 0
            System.out.println("Error: Ingrese un tamaño válido");
        }
    }

    //int getLongitud(): retorna el tamaño.
    public int getLongitud() {
        return this.tamanio;
    }

    //setElemento( indice,valor ): establece un elemento en una posición específica.
    public void setElemento(int indice, T valor) {
        try {
            this.valores[indice] = valor;
        } catch (IndexOutOfBoundsException ie) {//<-Manejo de excepción índice fuera de rango
            System.out.println("Error: Índice fuera de rango, ingrese un valor"
                    + " menor a " + this.tamanio);
        }
    }

    //getElemento( indice ): regresa el elemento en el índice solicitado.
    public T getElemento(int indice) {
        T elemento = null;
        try {
            elemento = this.valores[indice];
        } catch (IndexOutOfBoundsException ie) {//<-Manejo de excepción índice fuera de rango
            System.out.println("Error: Índice fuera de rango, ingrese un valor"
                    + " menor a " + this.tamanio);
        }
        return elemento;
    }

    //limpiar( valor ): establece todos los elementos al valor enviado.
    public void limpiar(T valor) {
        for (int i = 0; i < this.tamanio; i++) {//<-Blucle for para recorrer y reemplazar cada valor.
            this.valores[i] = valor;
        }
    }

    @Override
    //toString(): regresa en String el estado actual del objeto.
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("ESTADO DEL ARREGLO{ ").append("\n");
        s.append(" Índice").append("\t| Valor");
        for (int i = 0; i < this.tamanio; i++) { //<-Bucle for para recorrer e imprimir cada valor.
            s.append("\n   ").append(i).append("\t|  ").append(this.valores[i]);
        }
        return s.append("\n\t\t}").toString();
    }
}
