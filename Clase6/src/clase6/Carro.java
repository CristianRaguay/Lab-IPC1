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
public class Carro {
    private String modelo;
    private String placa;
    private String linea;
    private int alquiler;
    private String marca;

    public Carro(String modelo, String placa, String linea, int alquiler, String marca) {
        this.modelo = modelo;
        this.placa = placa;
        this.linea = linea;
        this.alquiler = alquiler;
        this.marca = marca;
    }

    public Carro() {
    }
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public int getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(int alquiler) {
        this.alquiler = alquiler;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public boolean buscarCarro(Carro[] carros){
        for (Carro carro : carros) {
            if (carro != null) {
                if (carro.getPlaca() != this.placa) {
                    return true;
                }
            }
        }
        return false;
    }
}
