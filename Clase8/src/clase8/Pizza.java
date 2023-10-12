/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crist
 */
public class Pizza implements Receta{

    List<String> lista = new ArrayList<>();
    List<String> preparacion = new ArrayList<>();
    @Override
    public void ingredientes(String ingrediente) {
        lista.add(ingrediente);
    }

    @Override
    public void Preparacion(String Pregaracion) {
        preparacion.add(Pregaracion);
    }
    
    public void mostrarIngrediente(){
        for (String string : lista) {
            System.out.println(string);
        }
    }
    
    public void mostrarPreparacion(){
        for (String string : preparacion) {
            System.out.println(string);
        }
    }
    
}
