/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

/**
 *
 * @author crist
 */
public class Hombre extends Persona{

    public Hombre(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void levantarPeso() {
        System.out.println("El hombre puede levantar 100kg sin tanto problema");
    }

    @Override
    public void corre() {
        System.out.println("El hombre corre los 100m en 9.5 seg");
    }
    
}
