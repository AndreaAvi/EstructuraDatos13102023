/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
*Hecho a partir del código visto en el curso Estructura de Datos 2023-I
Tarea 3: Empresa
Fecha de entrega: 06/09/2022
Descripción: En esta clase principal se comprueba el correcto funcionamiento de 
la ADT Nomina.
 */
package tarea.empresa;

import java.io.IOException;

public class TareaEmpresa {

    public static void main(String[] args) throws IOException {
        NominaADT nomina = new NominaADT(
                "C:\\Users\\Andi\\Documents\\EstructuraDatos13102023\\Tarea\\Tarea Empresa\\src\\tarea\\empresa\\junio.dat", "Compañía, S.A. de C.V.");

        System.out.println("-------Sueldos totales-------");
        nomina.calcularSueldo();
        
        System.out.println("----Trabajadores con mayor y menor antiguedad----");
        
        nomina.obtenerMaxMin();
        

    }
}
