/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Tarea 4: Conjuntos
Fecha de entrega: 21/09/2022
Descripción: Prueba de métodos de la ADTConjunto
 */
package tareaconjuntos;

public class TareaConjuntos {

    public static void main(String[] args) {

        //-------Método constructor-------
        ConjuntoADT<Integer> A = new ConjuntoADT<>();
        ConjuntoADT<Integer> B = new ConjuntoADT<>();

        //-------agregar()-------
        //Conjunto A
        A.agregar(1);
        A.agregar(2);
        A.agregar(4);
        A.agregar(6);
        A.agregar(5);
        A.agregar(10);
        A.agregar(12);
        A.agregar(10);//<- No se permiten elementos duplicados, 
        //                 el segundo 10 no se agregará.
        //Conjunto B
        B.agregar(1);
        B.agregar(2);
        B.agregar(4);
        B.agregar(5);
        B.agregar(6);

        //-------longitud()-------
        System.out.println("\n--Longitud--");
        //Conjunto A
        System.out.println("A# : " + A.longitud());
        //Conjunto B
        System.out.println("B# : " + B.longitud());

        //-------contiene(elemento)-------
        System.out.println("\n--Contiene--");
        //Conjunto A
        System.out.println("12 ϵ A : " + A.contiene(12)); //true
        //Conjunto B
        System.out.println("12 ϵ B : " + B.contiene(12)); //false

        //-------eliminar(elemento)-------
        System.out.println("\n--Eliminar--");
        A.eliminar(12);
        System.out.println("Se eliminó el elemento 12 del conjunto A");
        System.out.println("12 ϵ A : " + A.contiene(12)); //false
        System.out.println("A# : " + A.longitud());

        //-------equals(otroConjunto)-------
        System.out.println("\n--Equals--");
        System.out.println("A = B : " + A.equals(B));//false

        //-------esSubConjunto(otroConjunto)-------
        System.out.println("\n--Es subconjunto--");
        System.out.println("B ϵ A : " + B.esSubConjunto(A));//true

        //-------union(otroConjunto)-------
        System.out.println("\n--Unión--");
        System.out.println("A ∪ B : " + A.union(B));

        //-------intersección(otroConjunto)-------
        System.out.println("\n--Intersección--");
        System.out.println("A ∩ B : " + A.interseccion(B));

        //-------diferencia(otroConjunto)-------
        System.out.println("\n--Diferencia--");
        System.out.println("A - B : " + A.diferencia(B));
        System.out.println("B - A : " + B.diferencia(A));

        //-------iterator()-------
        System.out.println("\n--Iterator--");
        System.out.print("A :");
        for (int C : A) {
            System.out.print(C + ", ");
        }

    }

}
