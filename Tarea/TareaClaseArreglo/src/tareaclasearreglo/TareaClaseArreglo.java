/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Fecha de creación:  24/08/2022
Propósito: Crear una clase en Java llamada Arreglo que tenga los métodos 
solicitados.
Tarea: Clase Arreglo
Fecha de entrega: 25/08/2022
Descripción: En esta clase se implementa la clase Arreglos y se comprueba 
que esta funciona de manera correcta.
 */
package tareaclasearreglo;

import clasealumno.Alumno;

public class TareaClaseArreglo {

    public static void main(String[] args) {

        //----------PRUEBA CON ENTEROS----------
        Arreglo numeros = new Arreglo(5);//<-Declaración del objeto mediante constructor.

        //Se rellena el arreglo con los primeros 5 múltiplos de 2, con setElemento().
        for (int i = 0; i < numeros.getLongitud(); i++) {
            numeros.setElemento(i, i * 2);
        }

        //Pruebas de métodos.
        System.out.println("Longitud: " + numeros.getLongitud());
        System.out.println("Elemento (3): " + numeros.getElemento(3));
        System.out.println(numeros);
        numeros.limpiar(0);
        System.out.println("Arreglo limpio: \n" + numeros);

        //----------PRUEBA CON CARACTERES----------
        Arreglo letras = new Arreglo(5);//<-Declaración del objeto mediante constructor.

        //Se rellena el arreglo con las primeras 5 letras mayúsculas con setElemento().
        for (int i = 0; i < letras.getLongitud(); i++) {
            letras.setElemento(i, Character.toString((char) (i + 65)));
        }

        //Pruebas de métodos.
        System.out.println("Longitud: " + letras.getLongitud());
        System.out.println("Elemento (3): " + letras.getElemento(3));
        System.out.println(letras);
        letras.limpiar(null);
        System.out.println("Arreglo limpio: \n" + letras);

        //----------PRUEBA CON OBJETOS(ALUMNOS)----------
        Arreglo alumnos = new Arreglo(5);//<-Declaración del objeto mediante constructor.

        //Se rellena el arreglo con 5 objetos alumno, con setElemento().
        alumnos.setElemento(0, new Alumno("Helena", 19, "142536"));
        alumnos.setElemento(1, new Alumno("Montse", 15, "857496"));
        alumnos.setElemento(2, new Alumno("Ana", 17, "654789"));
        alumnos.setElemento(3, new Alumno("María", 20, "455214"));
        alumnos.setElemento(4, new Alumno("Isabel", 20, "447785"));

        //Pruebas de métodos.
        System.out.println("Longitud: " + alumnos.getLongitud());
        System.out.println("Elemento (3): " + alumnos.getElemento(3));
        System.out.println(alumnos);
        alumnos.limpiar(new Alumno("SIN NOMBRE", 0, "00000000"));
        System.out.println("Arreglo limpio: \n" + alumnos);

    }

}
