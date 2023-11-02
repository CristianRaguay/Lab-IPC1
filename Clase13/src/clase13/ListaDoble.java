/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase13;

/**
 *
 * @author crist
 */
public class ListaDoble {

    private Nodo inicio;
    private Nodo fin;

    public ListaDoble() {
        inicio = null;
        fin = null;
    }

    public void agregar(Object valor) {
        Nodo nuevo = new Nodo(valor);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
            fin = nuevo;
        }
    }

    public void imprimir() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println(aux.getValor());
            aux = aux.getSiguiente();
        }
    }

    public void imprimirDerAIzq() {
        Nodo aux = fin;
        while (aux != null) {
            System.out.println(aux.getValor());
            aux = aux.getAnterior();
        }
    }
    
    public void eliminar(int valor){
        Nodo aux = inicio;
        while (aux.getSiguiente() !=  null) {
            if ((int) aux.getSiguiente().getValor() == valor) {
                Nodo sig = aux.getSiguiente().getSiguiente();
                aux.setSiguiente(sig);
                sig.setAnterior(aux);
                //System.out.println(aux.getSiguiente().getValor());
                break;
            }
            aux = aux.getSiguiente();
       }
        System.out.println("Dato no encontrado");
    }

}
