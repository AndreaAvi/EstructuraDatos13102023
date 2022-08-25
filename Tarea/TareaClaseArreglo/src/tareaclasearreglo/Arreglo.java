/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Fecha de creación:  24/08/2022
Propósito: Crear una clase en Java llamada Arreglo que tenga los métodos 
solicitados.
Tarea: Clase Arreglo
Fecha de entrega: 25/08/2022
Descripción: En esta clase se definen todos los atributos y métodos solicitados 
para el funcionamiento de un arreglo.
 */
package tareaclasearreglo;

public class Arreglo {

    private int tamanio;
    private Object[] valores;

    //Arreglo( int tamanio ): constructor.
    public Arreglo(int tamanio) {
        this.tamanio = tamanio;
        this.valores = new Object[tamanio];
        if (this.tamanio <= 0) { //<-Tamaño mayor a 0
            System.out.println("Error: Ingrese un tamaño válido");
        }
    }

    //int getLongitud(): retorna el tamaño.
    public int getLongitud() {
        return this.tamanio;
    }

    //setElemento( indice,valor ): establece un elemento en una posición específica.
    public void setElemento(int indice, Object valor) {
        try {
            this.valores[indice] = valor;
        } catch (IndexOutOfBoundsException ie) {//<-Manejo de excepción índice fuera de rango
            System.out.println("Error: Índice fuera de rango, ingrese un valor"
                    + " menor a " + this.tamanio);
        }
    }

    //getElemento( indice ): regresa el elemento en el índice solicitado.
    public Object getElemento(int indice) {
        Object elemento = null;
        try {
            elemento = this.valores[indice];
        } catch (IndexOutOfBoundsException ie) {//<-Manejo de excepción índice fuera de rango
            System.out.println("Error: Índice fuera de rango, ingrese un valor"
                    + " menor a " + this.tamanio);
        }
        return elemento;
    }

    //limpiar( valor ): establece todos los elementos al valor enviado.
    public void limpiar(Object valor) {
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
