/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiaLaAbuela;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author GR6
 */
public class Pedido {

    private String referencia;
    private ArrayList<Articulos> articulosPedido;
    private ArrayList<BolsasProductos> bolsaProductosPedido;
    private double total;

    public Pedido() {
        Random r = new Random();
        this.referencia = Integer.toString(r.nextInt(10000000));
        this.articulosPedido = new ArrayList<>();
        this.bolsaProductosPedido = new ArrayList<>();
    }

    public void nuevoArticulo(Articulos a) {
        this.articulosPedido.add(a);
        this.calcularPrecio(a);
    }

    private void calcularPrecio(Articulos a) {
        this.total += a.getPrecioArticulo();
    }

    private void restarPrecio(BolsasProductos a) {
        this.total -= 1.5;
    }

   
    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public ArrayList<Articulos> getArticulosComanda() {
        return articulosPedido;
    }

    public void setArticulosComanda(ArrayList<Articulos> articulosComanda) {
        this.articulosPedido = articulosComanda;
    }

    public double getSubtotal() {
        return total;
    }

    public void setSubtotal(double subtotal) {
        this.total = subtotal;
    }

    @Override
    public String toString() {
         String contenidoArticulo = "";
        for (int i = 0; i < articulosPedido.size(); i++) {
            contenidoArticulo += "- "+ articulosPedido.get(i);
        }
        return ("El pedido contiene: \n"  + contenidoArticulo);
        
        String contenidoBolsaProducto  = "";
        for (int i = 0; i < bolsaProductosPedido.size(); i++) {
            contenidoBolsaProducto  += "- "+ bolsaProductosPedido.get(i);
        }
        return ("El pedido contiene: \n"  + contenidoBolsaProducto );
        
    }
    
    
}
    

    

