/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo1y2.base;

/**
 *
 * @author zunig
 */
public class Producto {
    String nombre;
    double precio;
    
    //constructores parametrizados para nombre y precio
    public Producto(String nombre,double precio) {
    this.nombre=nombre;
    this.precio=precio;
    }
    public void mostrarProducto(){
       System.out.println("Producto");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Precio: "+precio);
}
}

