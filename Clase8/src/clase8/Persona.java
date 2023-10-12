/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

/**
 *
 * @author crist
 */
public abstract class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 12;
    }
    
    
    public abstract void levantarPeso();
    public abstract void corre();
    
    public void presenterme(){
        System.out.println("Hola, Mi nombre es: "+nombre+" y tengo"+edad+" anios");
    }
    
    
}
