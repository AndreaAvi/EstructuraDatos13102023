/*
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  20/08/2022
Propósito: Hacer un programa que 
    -Lea el archivo "presenciaredes.csv" 
    -Mostrar en pantalla la diferencia de seguidores (followers) en Twitter 
    entre el mes de enero y junio.
    -Permita calcular la diferencia de visualizaciones de YouTube entre los 
    meses seleccionados por teclado (enero a junio).
    -Calcular el promedio de crecimiento de Twitter y Facebook entre los meses 
    de enero a junio.
Tarea: Ejercicio Redes sociales
Fecha de entrega: 23/08/2022
 */
package ejercicioredessociales;

import java.awt.FlowLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EjercicioRedesSociales {

    public static void main(String[] args) throws FileNotFoundException {

        //1. Lea el archivo "presenciaredes.csv" 
        String[][] valores
                = LeerAlmacenarCSV(
                        "C:\\Users\\Andi\\Documents\\EstructuraDatos13102023\\"
                        + "Tarea\\EjercicioRedesSociales\\presenciaredes.csv");

        //2. Mostrar en pantalla la diferencia de seguidores (followers) en Twitter 
        //   entre el mes de enero y junio.
        diferenciaEntreDosMeses(
                valores, "TWITTER", "SEGUIDORES", "ENERO", "JUNIO");

        //3. Permita calcular la diferencia de visualizaciones de YouTube entre 
        //   los meses seleccionados por teclado (enero a junio).
        seleccionarMeses(valores, "Youtube", "visualizaciones");

        //4. Calcular el promedio de crecimiento de Twitter y Facebook entre los 
        //   meses de enero a junio.
        promedioCrecimiento(valores, "Twitter", "Enero", "Junio");
        promedioCrecimiento(valores, "Facebook", "Enero", "Junio");

    }

    //Este método lee, imprime y almacena el documento .CSV en un arreglo bidimensional.
    //Nota: Para acceder al archivo se requiere de la ubicación absoluta del mismo.
    public static String[][] LeerAlmacenarCSV(String direccion) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(direccion));
        String[][] valores = new String[19][15]; //<-Se usan las dimensiones del documento.
        scanner.useDelimiter(",");//<-Se establece la "," como delimitador de elementos.
        String valorSig = "";
        String valorSig2 = "";
        for (int i = 0; i != 19; i++) {
            for (int j = 0; j != 15; j++) {
                valorSig = scanner.next();
                if (valorSig.charAt(0) == '"') {//<- Dado que el documento contiene 
                    //comas dentro de los números, estas 
                    //se discriminan mediante este if.
                    valorSig2 = scanner.next();
                    valores[i][j]
                            = valorSig.substring(1)
                            + valorSig2.substring(0, valorSig2.length() - 1);
                    System.out.print(valores[i][j] + " , ");
                } else {
                    valores[i][j] = valorSig;
                    System.out.print(valores[i][j] + " , ");
                }
            }
        }
        scanner.close();
        return valores;//Se arroja un arreglo con todos los valores.
    }

    //Este método, dados los valores, la red social, el concepto, y dos meses; 
    //puede obtener la diferencia entre dos valores numéricos.
    public static int diferenciaEntreDosMeses(String[][] valores, String redSocial, String concepto, String mes1, String mes2) {
        int mes1Index = 0;
        int mes2Index = 0;
        int resultado = 0;
        //Las cadenas se convierten a mayúsculas para evitar errores.
        redSocial = redSocial.toUpperCase();
        concepto = concepto.toUpperCase();
        mes1 = mes1.toUpperCase();
        mes2 = mes2.toUpperCase();
        for (int i = 0; i < valores.length; i++) {
            for (int j = 3; j < valores[i].length; j++) {
                //Los índices sirven para identificar la fila de interés, 
                //de acuerdo con los meses solicitados.
                if (valores[i][j].contains(mes1)) {
                    mes1Index = j;
                }
                if (valores[i][j].contains(mes2)) {
                    mes2Index = j;
                }
                //Una vez que se hayan identificado los valores de interés, se realiza la resta.
                if (valores[i][0].contains(redSocial) && valores[i][1].contains(concepto)) {
                    resultado
                            = Integer.parseInt(valores[i][mes2Index])
                            - Integer.parseInt(valores[i][mes1Index]);
                    break;
                }
            }
        }
        //Se arroja un error en caso de que se hayan seleccionado datos no válidos.
        if (resultado < 0) {
            JOptionPane.showMessageDialog(
                    null, "<html>Por favor ingrese meses de Enero a Junio <br> "
                    + "Recuerde que 'Mes 1' debe ser menor que 'Mes 2'<html>",
                    "Ingrese datos válidos", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "\nEn " + redSocial
                    + " la diferencia de " + concepto + " de " + mes1
                    + " a " + mes2 + " es de: " + resultado + ".",
                    "Diferencia de " + concepto + " en " + redSocial,
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return resultado; //<-Se arroja el resultado de la resta.
    }

    //Este método funciona para seleccionar datos de meses mediante el teclado, 
    //también se utilizan estos datos para hallar la diferencia de visualizaciones 
    //solicitada.
    public static void seleccionarMeses(String[][] valores, String redSocial, String concepto) {
        //Declaración del panel y de los campos de texto
        String mes1 = "";
        String mes2 = "";
        JTextField textoMes1 = new JTextField(10);
        JTextField textoMes2 = new JTextField(10);
        JPanel panelIngreso = new JPanel();
        //Agrega campos de texto al panel y asigna etiquetas
        panelIngreso.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelIngreso.add(new JLabel("<html>Calcule la diferencia de "
                + "visualizaciones de YouTube<br> entre los meses "
                + "seleccionados (de enero a junio).<br><html>"));
        panelIngreso.add(new JLabel("Mes 1: "));
        panelIngreso.add(textoMes1);
        panelIngreso.add(Box.createHorizontalStrut(15));
        panelIngreso.add(new JLabel("Mes 2:"));
        panelIngreso.add(textoMes2);

        //Muestra el panel y acepta la opción ok
        int m = JOptionPane.showConfirmDialog(null, panelIngreso,
                "Por favor ingrese los meses que desea comparar", JOptionPane.OK_CANCEL_OPTION);
        //Cancela el programa si se ingresa la opción cancel
        if (m == JOptionPane.CANCEL_OPTION) {
            System.exit(0);
        }
        mes1 = textoMes1.getText();
        mes2 = textoMes2.getText();
        //Se manda a llamar al método para obtener la diferencia solicitada.
        diferenciaEntreDosMeses(valores, redSocial, concepto, mes1, mes2);
    }

    //Este método calcula el promedio de crecimiento de seguidores, dada una 
    //red social y dos meses para delimitar un periodo de tiempo.
    public static float promedioCrecimiento(String[][] valores, String redSocial, String mes1, String mes2) {
        float promedio = 0;
        int mes1Index = 0;
        int mes2Index = 0;
        int noValores = 0;
        redSocial = redSocial.toUpperCase();
        mes1 = mes1.toUpperCase();
        mes2 = mes2.toUpperCase();
        for (int i = 0; i < valores.length; i++) {
            for (int j = 3; j < valores[i].length; j++) {
                if (valores[i][j].contains(mes1)) {
                    mes1Index = j;
                }
                if (valores[i][j].contains(mes2)) {
                    mes2Index = j;
                }
            }
        }
        noValores = mes2Index - mes1Index + 1;
        for (int i = 0; i < valores.length; i++) {
            for (int j = 3; j < valores[i].length; j++) {
                if (valores[i][0].contains(redSocial) && valores[i][1].contains("CRECIMIENTO") && !valores[i][1].contains("PORCENTAJE")) {
                    promedio
                            += Integer.parseInt(valores[i][j]);

                }
            }
        }
        promedio = promedio / noValores;
        JOptionPane.showMessageDialog(
                null, "\nEl promedio de crecimiento de " + redSocial + " de "
                + mes1 + " a " + mes2 + " es de " + promedio,
                "Promedio de crecimiento de " + redSocial,
                JOptionPane.INFORMATION_MESSAGE);
        return promedio;
    }
}
