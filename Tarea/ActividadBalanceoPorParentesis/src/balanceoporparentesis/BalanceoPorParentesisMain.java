/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Actividad extra: Balanceo por paréntesis.
Fecha de entrega: 18/11/2022
Descripción: Hacer un programa que dado una cadena de texto que contiene 
paréntesis , utilizar el algoritmo de pila vacía para verificar el correcto 
balanceo de paréntesis para los dos archivos de texto que se anexan en la 
actividad.
Paréntesis: {},[],().
 */
package balanceoporparentesis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BalanceoPorParentesisMain {

    public static void main(String[] args) throws IOException {
        
        String direccionTexto1 = "C:\\Users\\Andi\\Documents\\EstructuraDatos13102023\\Tarea\\ActividadBalanceoPorParentesis\\src\\texto1.txt";
        String direccionTexto2 = "C:\\Users\\Andi\\Documents\\EstructuraDatos13102023\\Tarea\\ActividadBalanceoPorParentesis\\src\\texto2.txt";

        String texto1 = leerTxt(direccionTexto1);
        System.out.println("\n\n-----------------------Texto 1-----------------------");
        System.out.println(texto1);
        System.out.println("-------------------------------------------------------");
        System.out.println("Los paréntesis del texto 1 están balanceados: " + BalanceoPorParentesis.estaBalanceada(texto1));

        String texto2 = leerTxt(direccionTexto2);
        System.out.println("\n\n-----------------------Texto 2-----------------------");
        System.out.println(texto2);
        System.out.println("-------------------------------------------------------");
        System.out.println("Los paréntesis del texto 2 están balanceados: " + BalanceoPorParentesis.estaBalanceada(texto2));
   
    }

    //Se crea un método para leer los archivos de texto, 
    //y regresarlos en forma de String;
    public static String leerTxt(String direccion) {
        String texto = "";
        try {
            BufferedReader lector = new BufferedReader(new FileReader(direccion));
            String linea;
            while ((linea = lector.readLine()) != null) {
                texto += linea + "\n";
            }

        } catch (Exception e) {
            System.out.println("No se encontró el archivo");
        }
        return texto;
    }
}
