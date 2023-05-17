/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Problema02;

import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Empleado e = new Empleado();
        
        boolean bandera = true;
        String opcion;
        String nombre;
        double salario = 0;
        int edad;
        double porcentaje;
        double salarioP = 0;
        double salarioT;
        String mensaje = "";
        int n = 1;
        
        while (bandera){
            System.out.println("Ingrese el nombre del empleado:");
            nombre = entrada.nextLine();
            e.setNombre(nombre);
            
            System.out.println("Ingrese el salario del empleado:");
            salario = entrada.nextDouble();
            e.setSalario(salario);
            
            System.out.println("Ingrese la edad del empleado:");
            edad = entrada.nextInt();
            e.setEdad(edad);
            
            salarioP = (salarioP + salario) / 2;
            
            salarioT = salario;
            if(salario < salarioP){
                System.out.println("Ingrese el porcentaje de aumento salarial:");
                porcentaje = entrada.nextDouble();
                salarioT = ((porcentaje * salario) / 100) + salario;
            }
            
            mensaje = String.format("%sNombre del empleado numero %d: %s\n"
                    + "Edad del empleado numero %d: %d\nSalario actual del"
                    + " empleado %d: $%.2f\nSalario con porcentaje de "
                    + "aumento salarial: $%.2f\n\n", mensaje, n,
                    e.getNombre(), n, e.getEdad(), n, e.getSalario(),
                    salarioT);
            n = n + 1;
            
            System.out.println("Ingrese s para salir, cuqluier otra "
                    + "letra para continuar:");
            entrada.nextLine();
            opcion = entrada.nextLine();
            if(opcion.equals("s")){
                bandera = false;
            }
        }
        e.mostrarInformacion(mensaje);
    }
    
}
