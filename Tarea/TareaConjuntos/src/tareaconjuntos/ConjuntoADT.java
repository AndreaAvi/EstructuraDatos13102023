/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Tarea 4: Conjuntos
Fecha de entrega: 21/09/2022
Descripción: Conjunto ADT
 */
package tareaconjuntos;

import java.util.ArrayList;

import java.util.Iterator;

public class ConjuntoADT<T> implements Iterable<T> {

    private ArrayList<T> datos = new ArrayList<>();

    public ConjuntoADT() {
    }

    public int longitud() {
        return datos.size();
    }

    public boolean contiene(T elemento) {
        return datos.contains(elemento);
    }

    public void agregar(T elemento) {
        if (!datos.contains(elemento)) {
            datos.add(elemento);
        }
    }

    public void eliminar(T elemento) {
        if (datos.contains(elemento)) {
            datos.remove(elemento);
        }
    }

    public boolean equals(ConjuntoADT<T> otroConjunto) {
        if (datos.size() != otroConjunto.longitud()) {
            return false;
        }
        for (int i = 0; i < datos.size(); i++) {
            if (!otroConjunto.contiene(datos.get(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean esSubConjunto(ConjuntoADT<T> otroConjunto) {
        for (int i = 0; i < datos.size(); i++) {
            if (!otroConjunto.contiene(datos.get(i))) {
                return false;
            }
        }
        return true;
    }

    public ConjuntoADT<T> union(ConjuntoADT<T> otroConjunto) {
        ConjuntoADT<T> union = new ConjuntoADT<>();
        for (int i = 0; i < datos.size(); i++) {
            union.agregar(datos.get(i));
        }
        for (int i = 0; i < otroConjunto.longitud(); i++) {
            union.agregar(otroConjunto.datos.get(i));
        }
        return union;
    }

    public ConjuntoADT<T> interseccion(ConjuntoADT<T> otroConjunto) {
        ConjuntoADT<T> interseccion = new ConjuntoADT<>();
        for (int i = 0; i < otroConjunto.longitud(); i++) {
            if (datos.contains(otroConjunto.datos.get(i))) {
                interseccion.agregar(otroConjunto.datos.get(i));
            }
        }
        return interseccion;
    }

    public ConjuntoADT<T> diferencia(ConjuntoADT<T> otroConjunto) {
        ConjuntoADT<T> diferencia = new ConjuntoADT<>();
        for (int i = 0; i < datos.size(); i++) {
            if (!otroConjunto.datos.contains(datos.get(i))) {
                diferencia.agregar(datos.get(i));
            }
        }
        return diferencia;
    }

    @Override
    public String toString() {
        return datos.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return datos.iterator();
    }

}
