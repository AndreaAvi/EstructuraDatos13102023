/*
Autora: Andrea Marcela Cáceres Avitia (Estructura de Datos 2023-I)
Fecha de creación:  24/08/2022 
Propósito: Crear una clase en Java llamada Arreglo que tenga los métodos 
solicitados.
Tarea: Clase Arreglo
Fecha de entrega: 25/08/2022
Descripción: Esta clase define un objeto alumno.
 */
package clasealumno;

public class Alumno {

    private String nombre;
    private int edad;
    private String noCuenta;

    public Alumno() {
    }

    public Alumno(String nombre, int edad, String noCuenta) {
        this.nombre = nombre;
        this.edad = edad;
        this.noCuenta = noCuenta;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{ " + "nombre: " + nombre + ", edad: " + edad + ", no. Cuenta: " + noCuenta + '}';
    }
    
}
