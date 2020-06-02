/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiaLaAbuela;

/**
 *
 * @author GR6
 */
public enum BolsasProductos {
    
    BOLSA_1(1, "botella de monster "),
    BOLSA_2(2, "bolsa de patatas fritas"),
    BOLSA_3(3, "pack de latas de coca-cola "),
    BOLSA_4(4, "bolsa de papa-delta "),
    BOLSA_5(5, "gusanitos RISI");
    
    private int referenciaBolsaProductos;
    private String nombreBolsaProductos;

    private BolsasProductos(int referenciaBolsaProductos, String nombreBolsaProductos) {
        this.referenciaBolsaProductos = referenciaBolsaProductos;
        this.nombreBolsaProductos = nombreBolsaProductos;
    }

    public int getReferenciaBolsaProductos() {
        return referenciaBolsaProductos;
    }

    public void setReferenciaBolsaProductos(int referenciaBolsaProductos) {
        this.referenciaBolsaProductos = referenciaBolsaProductos;
    }

    public String getNombreBolsaProductos() {
        return nombreBolsaProductos;
    }

    public void setNombreBolsaProductos(String nombreBolsaProductos) {
        this.nombreBolsaProductos = nombreBolsaProductos;
    }
    
    
    
}
