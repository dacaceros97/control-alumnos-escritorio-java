/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases2b;

/**
 *
 * @author dcace
 */
public class Alumno {
    int carne;
    String nombre;
    Facultad facultad;
    Clase clases [];

    public Alumno(int carne, String nombre) {
        this.carne = carne;
        this.nombre = nombre;
    }

    public Alumno(int carne, String nombre, Facultad facultad, Clase[] clases) {
        this.carne = carne;
        this.nombre = nombre;
        this.facultad = facultad;
        this.clases = clases;
    }

    
    
    
    
}
