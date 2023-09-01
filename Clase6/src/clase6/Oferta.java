/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

/**
 *
 * @author crist
 */
public class Oferta {
    private int dias;
    private int descuento;

    public Oferta() {
    }

    public Oferta(int dias, int descuento) {
        this.dias = dias;
        this.descuento = descuento;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    
    
}
