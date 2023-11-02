/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase13;

/**
 *
 * @author crist
 */
public class Nodo {
    private Object valor;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(Object valor) {
        this.valor = valor;
        this.siguiente = null;
        this.anterior= null;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo Anterior) {
        this.anterior = Anterior;
    }
    
    
}
