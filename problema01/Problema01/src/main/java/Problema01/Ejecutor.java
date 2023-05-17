/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Problema01;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Producto d = new Producto();
        boolean bandera = true;
        String opcion;
        double precio;
        int cantidad;

        while (bandera) {
            System.out.println("Ingrese el precio del producto:");
            precio = entrada.nextDouble();
            d.setPrecioProducto(precio);
            
            System.out.println("Ingrese la cantidad de productos:");
            cantidad = entrada.nextInt();
            d.setCantidadProducto(cantidad);
            
            System.out.printf("\nDatos del producto:\nPrecio unitario: $%.2f"
                    + "\nCantidad de productos: %d\nEl subtotal de la compra"
                    + "es: $%.2f\nEl valor correspondiente "
                    + "del descuento es: $%.2f\nPrecio Final del producto:"
                    + " $%.2f\n", d.getPrecioProducto(), d.getCantidadProducto(),
                    cantidad * precio, d.calcularDescuento(precio, cantidad),
                    d.calcularPrecioFinal());
            
            System.out.println("\nDesea salir? Precione s:");
            entrada.nextLine();
            opcion = entrada.nextLine();
            if(opcion.equals("s")){
                bandera = false;
            }
        }
    }
}
