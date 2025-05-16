/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase que gestiona el cálculo de descuentos para una compra de productos.
 * Proporciona funcionalidad para aplicar descuentos basados en la cantidad de productos.
 * 
 * @author pgcar
 * @version 1.0
 */

package tarea6ed;



public class Tarea6EDClase {
    private static final double DESCUENTO_MENOR = 0.95;
    private static final double DESCUENTO_MAYOR = 0.8;
    private static final int DESCUENTO_CANTIDAD = 5;
    
        /**
     * Aplica un descuento al precio de los productos basado en la cantidad comprada.
     * 
     * @param precioProducto El precio original del producto
     * @param numProductos El número de productos comprados
     */
    
    public void aplicarDescuento(double precioProducto, int numProductos){     double totalPagar;
    if(numProductos>3)
        precioProducto-=DESCUENTO_CANTIDAD;
            if (numProductos!=0){
            totalPagar = precioProducto*DESCUENTO_MAYOR;
            mostrarTotal(totalPagar);
        }else {
            totalPagar = precioProducto*DESCUENTO_MENOR;
            mostrarTotal(totalPagar);
        }   
    }

        /**
     * Muestra el total a pagar después de aplicar los descuentos.
     * 
     * @param totalPagar El monto total a pagar después de los descuentos
     */

    private void mostrarTotal(double totalPagar) {
        System.out.println("El total a pagar es:"+totalPagar);
        System.out.println("Enviado");
    }
}
