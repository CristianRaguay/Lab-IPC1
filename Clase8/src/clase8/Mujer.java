/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

/**
 *
 * @author crist
 */
public class Mujer extends Persona{

    public Mujer(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void levantarPeso() {
        System.out.println("La muijer puede levantar 100kg pero debe de entrenar mas que un hombre");
    }

    @Override
    public void corre() {
        System.out.println("El hombre corre los 100m en 10 seg, por su constitucion fisica no puede igualar a un hombre");
    }
    
}
