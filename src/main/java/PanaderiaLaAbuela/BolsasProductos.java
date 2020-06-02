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

    BOLSA_1(13, "bolsita de chucherías, red bull,\n"
            + "coca-cola, 2 barras de pan, botella de\n"
            + "oxígeno activo, lays sabor campesinas,\n"
            + "botella de monster "),
    BOLSA_2(14, " bolsa de patatas fritas, pack de latas de coca-cola, "
            + "bolsa de papa-delta, gusanitos\n"
            + "RISI, paquete de medianoches,"),
    BOLSA_3(15, "bolsa de patatas fritas, pack de latas de coca-cola, "
            + "paquete de donuts, bolsa de palomitas sabor ketchup, "
            + "judías de lata merca-power, azúcar."),
    BOLSA_4(16, "pack de latas de coca-cola, bolsita de chucherías, red bull, "
            + "coca-cola, 2 barras de pan, botella de oxígeno activo, "
            + "lays sabor campesinas"),
    BOLSA_5(17, "configurable pero no tendrá descuento");

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

    @Override
    public String toString() {
        return "BolsasProductos{" + "referenciaBolsaProductos=" + referenciaBolsaProductos + ", nombreBolsaProductos=" + nombreBolsaProductos + '}';
    }

}
