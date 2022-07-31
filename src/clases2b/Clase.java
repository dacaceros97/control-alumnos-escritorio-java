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
public class Clase {
    int id_clase;
    String nombre;
    int prerequisito;
    Catedratico catedratico;
    Tarea tareas [];
    
    Clase (int id, String n, Catedratico c, Tarea t[]){
        this.id_clase = id;
        this.nombre = n;
        this.catedratico = c;
        this.tareas = t;
    }
}
