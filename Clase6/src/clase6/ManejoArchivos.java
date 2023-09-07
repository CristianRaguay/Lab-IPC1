/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author crist
 */
public class ManejoArchivos {
    
    public String leerArchivos(String ruta){
        String dato = "";
        try {
            File file = new File(ruta);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            dato = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dato;
    }
    
    public boolean escribirArchivo(String ruta, String texto){
        try {
            File file = new File(ruta);
            
            if (file.exists()) {
                String datos = leerArchivos(ruta);
                datos = "\n"+texto;
                texto = datos;
            }
            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(texto);
            bw.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean esccrituraBinario(String ruta, byte [] texto){
        try {
            File file = new File(ruta);
            FileOutputStream fo = new FileOutputStream(file);
            BufferedOutputStream buffer = new BufferedOutputStream(fo);
            
            buffer.write(texto);
            
            buffer.close();
            return true;
        } catch (IOException e) {
            System.err.println(e);
            return false;
        }
    }
    
    public boolean escribirTextoBinario(String ruta, String texto){
        try {
            File file = new File(ruta);
            if (file.exists()) {
                String dato = leerTextoBinario(ruta);
                dato += texto;
                texto = dato;
            }
            FileOutputStream fo = new FileOutputStream(file);
            DataOutputStream data = new DataOutputStream(fo);
            
            data.writeUTF(texto);
            
            data.close();
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    }
    
    public Integer leerBinario(String ruta){
        int texto = 0;
        try {
            File file = new File(ruta);
            FileInputStream input = new FileInputStream(file);
            BufferedInputStream buffer = new BufferedInputStream(input);
            
            texto = buffer.read();
            
            buffer.close();
            return texto;
        } catch (IOException e) {
            System.err.println(e);
            return 0;
        }
    }
    
    public String leerTextoBinario(String ruta){
        String texto = "";
        try {
            File file = new File(ruta);
            FileInputStream fs = new FileInputStream(file);
            DataInputStream data = new DataInputStream(fs);
            
            texto = data.readUTF();
            data.close();
            return texto;
        } catch (Exception e) {
            System.err.println(e);
            return texto;
        }
    }
    
}
