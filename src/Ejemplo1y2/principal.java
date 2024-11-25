/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplo1y2;

import Ejemplo1y2.base.Estudiante;
import Ejemplo1y2.base.Producto;

/**
 *
 * @author zunig
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Producto producto=new Producto("Celular de alta calidad",3399000.00);
       Estudiante estudiante=new Estudiante("Valentina Zuñiga",20);
       
       producto.mostrarProducto();
        System.out.println("");
       estudiante.mostrarDatos();
        System.out.println("");
    }
    }
    