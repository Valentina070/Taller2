/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo1y2.base;

/**
 *
 * @author zunig
 */
public class Estudiante {
    String nombre;
    int edad;
    
    //Constructor por defecto
    public Estudiante() {
    this.nombre="Desconocido";
    this.edad=0;
}
        
    //Constructor por parametro
    public Estudiante(String nombre, int edad) {
    this.nombre=nombre;
    this.edad=edad;
    }
    
    //Metodo
     public void mostrarDatos(){
       System.out.println("Estudiante");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
     }
}
