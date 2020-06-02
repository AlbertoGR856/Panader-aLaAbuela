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
public enum Articulos {

    BOTELLA_MONSTER(1, "botella de monster ", 4),
    BOLSA_PATATAS_FRITAS(2, "bolsa de patatas fritas", 2),
    PACK_LATAS_COCA_COLA(3, "pack de latas de coca-cola ", 3),
    BOLSA_PAPA_DELTA(4, "bolsa de papa-delta ", 1),
    GUSANITOS_RISI(5, "gusanitos RISI", 1.5),
    PAQUETE_MEDIANOCHES(6, "paquete de medianoches ", 1.5),
    PAQUETE_DONUTS(7, "paquete de donuts ", 1.5),
    BOLSA_PALOMITAS_KETCHUP(8, "bolsa de palomitas sabor ketchup ", 1.5),
    JUDIAS_LATA_MERCA_POWER(9, "judías de lata merca-power ", 1.5),
    AZUCAR(10, "azúcar", 1.5),
    BOLSITA_CHUCHERIAS(11, "bolsita de chucherías", 1.5),
    RED_BULL(12, "red bull", 2),
    COCA_COLA(13, "coca-cola", 1.7),
    BARRAS_PAN(14, "2 barras de pan", 1),
    BOTELLA_OXIGENO_ACTIVO(15, "botella de oxígeno activo", 2),
    LAYS_CAMPESINAS(16, "lays sabor campesinas", 2);

    private int referenciaArticulo;
    private String nombreArticulo;
    private double precioArticulo;

    private Articulos(int referenciaArticulo, String nombreArticulo, double precioArticulo) {
        this.referenciaArticulo = referenciaArticulo;
        this.nombreArticulo = nombreArticulo;
        this.precioArticulo = precioArticulo;
    }

    public int getReferenciaArticulo() {
        return referenciaArticulo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public double getPrecioArticulo() {
        return precioArticulo;
    }

    @Override
    public String toString() {
        return this.getNombreArticulo() + " (que cuesta " + this.getPrecioArticulo() + "€)\n";
    }

}
