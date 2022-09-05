/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
*Hecho a partir del código visto en el curso Estructura de Datos 2023-I
Tarea 3: Empresa
Fecha de entrega: 06/09/2022
Descripción: ADT a partir del ADT Arreglo que almacena la información del 
archivo junio.dat y ejecuta los puntos solicitados.
 */
package tarea.empresa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NominaADT {

    private String nombreCompania;
    private Arreglo<Trabajador> empleados;
    private String rutaArchivo;

    public NominaADT() {
    }

    public NominaADT(String rutaArchivo, String nombreCompania) throws IOException {
        this.rutaArchivo = rutaArchivo;
        this.nombreCompania = nombreCompania;
        String lineaActual;
        int contador = 0;

        //Leer archivo
        BufferedReader br = new BufferedReader(new FileReader(this.rutaArchivo));

        while ((lineaActual = br.readLine()) != null) {
            contador++;
        }

        br = new BufferedReader(new FileReader(this.rutaArchivo));
        br.readLine();

        empleados = new Arreglo<>(contador - 1);

        //Separar por renglores y campos
        for (int i = 1; i < contador; i++) {

            lineaActual = br.readLine();
            Trabajador trab1 = new Trabajador();
            trab1.setNumeroTrabajador(Integer.parseInt(lineaActual.split(",")[0]));
            trab1.setNombres(lineaActual.split(",")[1]);
            trab1.setPaterno(lineaActual.split(",")[2]);
            trab1.setMaterno(lineaActual.split(",")[3]);
            trab1.setHorasExtra(Integer.parseInt(lineaActual.split(",")[4]));
            trab1.setSueldoBase(Integer.parseInt(lineaActual.split(",")[5]));
            trab1.setAnioIngreso(Integer.parseInt(lineaActual.split(",")[6]));
            empleados.setElemento(i - 1, trab1);

        }
    }

    public void calcularSueldo() {
        for (int i = 0; i < empleados.getLongitud(); i++) {
            System.out.println("Trabajador: " + empleados.getElemento(i));
            System.out.println("Sueldo total: " + empleados.getElemento(i).calcularSueldo() + "\n");
        }
    }

    //Este método creado en clase arroja el primer trabajador que cumple con los
    //requisitos solicitados, es decir, si hay dos trabajadores con la misma 
    //antiguedad, sólo se tomará en cuenta al primero.
    public void obtenerMaxMin() {
        int min = 2999999;
        int max = 0;
        Trabajador trabMin = null;
        Trabajador trabMax = null;

        for (int i = 0; i < empleados.getLongitud(); i++) {
            if (empleados.getElemento(i).getAnioIngreso() > max) {
                max = empleados.getElemento(i).getAnioIngreso();
                trabMax = empleados.getElemento(i);
            }

            if (empleados.getElemento(i).getAnioIngreso() < min) {
                min = empleados.getElemento(i).getAnioIngreso();
                trabMin = empleados.getElemento(i);
            }

        }
        System.out.println("Trabajador con mayor antiguedad: " + trabMax);
        System.out.println("Trabajador con menor antiguedad: " + trabMin);
    }

}
