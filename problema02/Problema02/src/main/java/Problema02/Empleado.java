/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema02;

/**
 *
 * @author renat
 */
public class Empleado {
    String nombre;
    double salario;
    int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreE) {
        this.nombre = nombreE;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salarioE) {
        this.salario = salarioE;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edadE) {
        edad = edadE;
    }
    
    public void mostrarInformacion(String mensaje){
        System.out.println("\nInformación de empelados registrados:\n\n" +
                mensaje + "\n");
    }
}
