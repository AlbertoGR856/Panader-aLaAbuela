/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanaderiaLaAbuela;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author GR6
 */
public class Prueba {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean addElement = true;
        int sel; 
        System.out.println("Bienvenido a la panadería de la Abuela");
        System.out.println("Seleccione sus articulos");
        System.out.println("Las bolsas de prodcutos a excepcion de la numero 5 "
                + "tienen un descuento de 1,5€");
       do {
            System.out.println("Tenemos disponible: \n"
                    + "1. Botella de Monster (" + Articulos.BOTELLA_MONSTER.getPrecioArticulo() + "€)\n"
                    + "2. Bolsa de patatas fritas(" + Articulos.BOLSA_PATATAS_FRITAS.getPrecioArticulo() + "€)\n"
                    + "3. Pack de latas de coca-cola (" + Articulos.PACK_LATAS_COCA_COLA.getPrecioArticulo() + "€)\n"
                    + "4. Bolsa papa-delta(" + Articulos.BOLSA_PAPA_DELTA.getPrecioArticulo() + "€)\n"
                    + "5. Gusanitos RISI (" + Articulos.GUSANITOS_RISI.getPrecioArticulo() + "€)\n"
                    + "6. Paquete de medianoches (" + Articulos.PAQUETE_MEDIANOCHES.getPrecioArticulo() + "€)\n"
                    + "7. Paquete de donuts (" + Articulos.PAQUETE_DONUTS.getPrecioArticulo() + "€)\n"
                    + "8. Bolsa de palaomitas sabor Ketchup (" + Articulos.BOLSA_PALOMITAS_KETCHUP.getPrecioArticulo() + "€)\n"
                    + "9. Judías de lata merca-power (" + Articulos.JUDIAS_LATA_MERCA_POWER.getPrecioArticulo() + "€)\n"
                    + "10. Azúcar(" + Articulos.AZUCAR.getPrecioArticulo() + "€)\n"
                    + "11. Bolsita de chucherías (" + Articulos.BOLSITA_CHUCHERIAS.getPrecioArticulo() + "€)\n"
                    + "12. Red Bull (" + Articulos.RED_BULL.getPrecioArticulo() + "€)"
                    + "13. Coca-Cola (" + Articulos. COCA_COLA.getPrecioArticulo() + "€)"
                    + "14. Barras de pan (" + Articulos.BARRAS_PAN.getPrecioArticulo() + "€)"
                    + "15. Botella de oxígeno activo (" + Articulos.BOTELLA_OXIGENO_ACTIVO.getPrecioArticulo() + "€)"
                    + "16. Lays sabor campesinas (" + Articulos.LAYS_CAMPESINAS.getPrecioArticulo() + "€)");
            System.out.print("Selecciona un producto: ");
     
              System.out.print("Selecciona un elemento: ");
            try{
            sel = s.nextInt();
            }catch(InputMismatchException ime){
                System.out.println("Introduce un valor correcto. Código de error: " + ime.hashCode());
                s.next();//Limpiamos el buffer
                System.out.print("Selecciona un elemento: ");
                sel = s.nextInt();
            }
       }
}
