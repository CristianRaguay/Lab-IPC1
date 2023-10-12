/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author crist
 */
public class HiloLabel extends Thread {

    JLabel label;
    int tiempo;
    int xInicio;
    int xFin;
    int yInicio;
    int yFin;
    int tamanio;

    public HiloLabel(JLabel label, int tiempo, int xInicio, int xFin, int yInicio, int yFin, int tamanio) {
        this.label = label;
        this.tiempo = tiempo;
        this.xInicio = xInicio;
        this.xFin = xFin;
        this.yInicio = yInicio;
        this.yFin = yFin;
        this.tamanio = tamanio;
    }

    @Override
    public void run() {
        while (true) {            
            mover();
        }
//        System.out.println("Hola mundo");
//        Thread.yield();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(HiloLabel.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }

    private void mover() {
        try {
            Thread.sleep(tiempo);
            if (xInicio<xFin) {
                label.setBounds(xInicio, yInicio, tamanio, tamanio);
                xInicio+=2;
            }
            
            if (yInicio<yFin) {
                label.setBounds(xInicio, yInicio, tamanio, tamanio);
                yInicio+=2;
            }
            
            if (xInicio>xFin && yInicio>yFin) {
                this.stop();
            }
            
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
