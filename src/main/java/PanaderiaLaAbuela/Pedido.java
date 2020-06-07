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

    // Declaramos los atributos de la clase Pedido, creando dos ArrayList de 
    //cada enum
    
    private String referencia;
    private ArrayList<Articulos> articulosPedido;
    private ArrayList<BolsasProductos> bolsaProductosPedido;
    private double total;

    // Creamos un metodo publico para la clse pedido donde se creara un pedido
    // de forma aleatoria.
    public Pedido() {
        Random r = new Random();
        this.referencia = Integer.toString(r.nextInt(10000000));
        this.articulosPedido = new ArrayList<>();
        this.bolsaProductosPedido = new ArrayList<>();
    }

    // Creamos un método que devuelva un articulo
    public void nuevoArticulo(Articulos a) {
        this.articulosPedido.add(a);
        this.calcularPrecio(a);
    }
    
    // Creamos un método que devuelva una BolsaProducto
     public void nuevoBolsaProducto(BolsasProductos b) {
        this.bolsaProductosPedido.add(b);
        this.calcularPrecio(a);
    }


     // Crearemos un metodo que devuelva el calculo del precio del articulo
    private void calcularPrecio(Articulos a) {
        this.total += a.getPrecioArticulo();
    }

    // Crearemos un metodo que devuelva el calculo del precio de una bolsa de producto
    private void restarPrecio(BolsasProductos a) {
        this.total -= 1.5;
    }

    
   //Getters y Setters
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

    
    // Creamos un metodo toString con un for para determinar que contiene el articulo
    @Override
    public String toString() {
         String contenidoArticulo = "";
        for (int i = 0; i < articulosPedido.size(); i++) {
            contenidoArticulo += "- "+ articulosPedido.get(i);
        }
        return ("El pedido contiene: \n"  + contenidoArticulo);
    
        
    }
    
    
}
    

    

