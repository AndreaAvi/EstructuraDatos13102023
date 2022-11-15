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

public class BalanceoPorParentesis {

    public static boolean estaBalanceada(String texto) {

        StackAL<Character> parentesis = new StackAL<>();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                parentesis.push(c);
            }
            if (c == '}') {
                if (!parentesis.peek().equals('{')) {
                    return false;
                }
                parentesis.pop();
            }
            if (c == ']') {
                if (!parentesis.peek().equals('[')) {
                    return false;
                }
                parentesis.pop();
            }
            if (c == ')') {
                if (!parentesis.peek().equals('(')) {
                    return false;
                }
                parentesis.pop();
            }
        }
        return parentesis.isEmpty();
    }
}
