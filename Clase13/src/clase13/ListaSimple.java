/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase13;

/**
 *
 * @author crist
 */
public class ListaSimple {
    
    private Nodo inicio;

    public ListaSimple() {
        this.inicio = null;
    }
    
    
    
    public void agregarValor(Object valor){
        Nodo nuevo = new Nodo(valor);
        if (inicio == null) {
            inicio = nuevo;
        }else{
            Nodo aux = inicio;
            while (aux.getSiguiente() !=  null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    
    public void imprimir(){
        Nodo aux = inicio;
        while (aux !=  null) {
            System.out.println(aux.getValor());
            aux = aux.getSiguiente();
       }
    }
    
    public void buscar(int dato){
        Nodo aux = inicio;
        while (aux !=  null) {
            System.out.println(aux.getValor());
            if ((int) aux.getValor() == dato) {
                System.out.println(aux.getValor());
                break;
            }
            aux = aux.getSiguiente();
       }
        System.out.println("Dato no encontrado");
    }
    
    public void eliminar(int valor){
        Nodo aux = inicio;
        while (aux.getSiguiente() !=  null) {
            if ((int) aux.getSiguiente().getValor() == valor) {
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                //System.out.println(aux.getSiguiente().getValor());
                break;
            }
            aux = aux.getSiguiente();
       }
        System.out.println("Dato no encontrado");
    }
    
    public void agregarOrdenado(int valor){
        Nodo nuevo = new Nodo(valor);
        if (inicio == null) {
            inicio = nuevo;
        }else{
            Nodo aux = inicio;
            while (aux !=  null) {
                if (aux.getSiguiente() == null) {
                    aux.setSiguiente(nuevo);
                    break;
                }
                if ((int) aux.getValor() < valor && (int)aux.getSiguiente().getValor() > valor) {
                    Nodo temp = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(temp);
                    break;
                }
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    
}
