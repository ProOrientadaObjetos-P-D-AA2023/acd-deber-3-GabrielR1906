/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema01;

/**
 *
 * @author Gabriel
 */
public class Producto {
    double precioProducto;
    int cantidadProducto;
    double descuento;
    double precioFinal;

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioP) {
        precioProducto = precioP;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadP) {
        cantidadProducto = cantidadP;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double desc) {
        descuento = desc;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioF) {
        precioFinal = precioF;
    }
    
    
    public  double calcularDescuento(double precioProducto,
            int cantidadProducto){
        if((precioProducto >= 1000) && (cantidadProducto >= 10)){
                descuento = (precioProducto * cantidadProducto) * 0.1;
                return descuento;
        } else {
            if (precioProducto < 1000) {
                descuento = precioProducto * 0.05;
                return descuento;
            }   
        }
        return descuento;
    }
    
    public double calcularPrecioFinal(){
        precioFinal = (precioProducto * cantidadProducto) - descuento;
        return precioFinal;
    }
}
