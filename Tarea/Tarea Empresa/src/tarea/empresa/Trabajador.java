/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
*Hecho a partir del código visto en el curso Estructura de Datos 2023-I
Tarea 3: Empresa
Fecha de entrega: 06/09/2022
Descripción: Clase Trabajador 
 */
package tarea.empresa;

public class Trabajador {

    private int numeroTrabajador;
    private String nombres;
    private String paterno;
    private String materno;
    private int horasExtra;
    private double sueldoBase;
    private int anioIngreso;
    public static final double MONTO_H_EXTRA = 276.5;
    public static final double PRESTACION_ANT = 0.3;

    public Trabajador() {
    }

    public Trabajador(int numeroTrabajador, String paterno, String materno, int horasExtra, double sueldoBase, int anioIngreso) {
        this.numeroTrabajador = numeroTrabajador;
        this.paterno = paterno;
        this.materno = materno;
        this.horasExtra = horasExtra;
        this.sueldoBase = sueldoBase;
        this.anioIngreso = anioIngreso;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumeroTrabajador(int numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double calcularSueldo() {
        double total = 0.0;
        total = sueldoBase;
        total += (horasExtra * MONTO_H_EXTRA);
        total += (2022 - anioIngreso) * PRESTACION_ANT * sueldoBase;
        return total;
    }


    @Override
    public String toString() {
        return "Trabajador{" + "numeroTrabajador: " + numeroTrabajador + ", nombres: " + nombres + ", paterno: " + paterno + ", materno: " + materno + ", horasExtra: " + horasExtra + ", sueldoBase: " + sueldoBase + ", anioIngreso: " + anioIngreso + '}';
    }

}
