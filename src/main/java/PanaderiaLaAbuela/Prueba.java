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
        
        // Creamos un teclado
        Scanner s = new Scanner(System.in);
        // Declaramos las variables que vamos a utilizar
        boolean addElement = true;
        int sel;
        String cont;
        // Creamos un objeto para agregar los articulos y bolsas de productos
        Pedido pedido = new Pedido();
        // Se muestran por consola los distintos valores
        System.out.println("Bienvenido a la panadería de la Abuela");
        System.out.println("Seleccione sus articulos");
        System.out.println("Las bolsas de prodcutos a excepcion de la numero 5 "
                + "tienen un descuento de 1,5€");
        
        // Se crea una estructura de repeticion do para seleccionar uno de los articulos
        // o bolsas de productos
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
                    + "13. Coca-Cola (" + Articulos.COCA_COLA.getPrecioArticulo() + "€)"
                    + "14. Barras de pan (" + Articulos.BARRAS_PAN.getPrecioArticulo() + "€)"
                    + "15. Botella de oxígeno activo (" + Articulos.BOTELLA_OXIGENO_ACTIVO.getPrecioArticulo() + "€)"
                    + "16. Lays sabor campesinas (" + Articulos.LAYS_CAMPESINAS.getPrecioArticulo() + "€)");
                    + "17. Bolsa de productos 1" (BolsasProductos.BOLSA_1);
                    + "18. Bolsa de productos 2" (BolsasProductos.BOLSA_2);
                    + "19. Bolsa de productos 3 " (BolsasProductos.BOLSA_3);
                    + "20. Bolsa de productos 4 " (BolsasProductos.BOLSA_4);
                    + "21. Bolsa de productos 5 " (BolsasProductos.BOLSA_5);
            System.out.print("Selecciona un producto: ");

           // Se utiliza un try catch para determinar que no nos alimos dl rango de valor establecido
            try {
                sel = s.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un valor correcto. Código de error: " + ime.hashCode());
                s.next();//Limpiamos el buffer
                System.out.print("Selecciona un elemento: ");
                sel = s.nextInt();
            }
            
            // Se utiliza un estructura de selección (swtich) para alojar en los diferentes casos los articulos y bolsas de productos
            switch (sel) {
                case 1:
                    pedido.getReferencia().nuevoArticulo(Articulos.BOTELLA_MONSTER);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.BOTELLA_MONSTER.getNombreArticulo() + ". La cuenta asciende a " + Articulos.getReferenciaArticulo().getSubtotal() + "€");
                    break;
                case 2:
                    pedido.getReferencia().nuevoArticulo(Articulos.BOLSA_PATATAS_FRITAS);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.BOLSA_PATATAS_FRITAS.getNombreArticulo() + ". La cuenta asciende a " + Articulos.getReferenciaArticulo().getSubtotal() + "€");
                    break;
                case 3:
                    pedido.getReferencia().nuevoArticulo(Articulos.PACK_LATAS_COCA_COLA);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.PACK_LATAS_COCA_COLA.getNombreArticulo() + ". La cuenta asciende a " + Articulos.getReferenciaArticulo().getSubtotal() + "€");
                    break;
                case 4:
                    pedido.getReferencia().nuevoArticulo(Articulos.BOLSA_PAPA_DELTA);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.BOLSA_PAPA_DELTA.getNombreArticulo() + ". La cuenta asciende a " + Articulos.getReferenciaArticulo().getSubtotal() + "€");
                    break;
                case 5:
                    pedido.getReferencia().nuevoArticulo(Articulos.GUSANITOS_RISI);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.GUSANITOS_RISI.getNombreArticulo() + ". La cuenta asciende a " + Articulos.getReferenciaArticulo().getSubtotal() + "€");
                    break;
                case 6:
                    pedido.getReferencia().nuevoArticulo(Articulos.PAQUETE_MEDIANOCHES);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.PAQUETE_MEDIANOCHES.getNombreArticulo() + ". La cuenta asciende a " + Articulos.getReferenciaArticulo().getSubtotal() + "€");
                    break;
                case 7:
                    pedido.getReferencia().nuevoArticulo(Articulos.PAQUETE_DONUTS);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.PAQUETE_DONUTS.getNombreArticulo() + ". La cuenta asciende a " + Articulos.getReferenciaArticulo().getSubtotal() + "€");
                    break;
                case 8:
                    pedido.getReferencia().nuevoArticulo(Articulos.BOLSA_PALOMITAS_KETCHUP);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.BOLSA_PALOMITAS_KETCHUP.getNombreArticulo() + ". La cuenta asciende a " + Articulos.getReferenciaArticulo().getSubtotal() + "€");
                    break;
                case 9:
                    pedido.getReferencia().nuevoArticulo(Articulos.JUDIAS_LATA_MERCA_POWER);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.JUDIAS_LATA_MERCA_POWER.getNombreArticulo() + ". La cuenta asciende a " + Articulos.getReferenciaArticulo().getSubtotal() + "€");
                    break;
                case 10:
                    pedido.getReferencia().nuevoArticulo(Articulos.AZUCAR);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.AZUCAR.getNombreArticulo() + ". La cuenta asciende a " + Articulos.getReferenciaArticulo().getSubtotal() + "€");
                    break;
                case 11:
                    pedido.getReferencia().nuevoArticulo(Articulos.BOLSITA_CHUCHERIAS);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.BOLSITA_CHUCHERIAS.getNombreArticulo() + ". La cuenta asciende a " + Articulos.getReferenciaArticulo().getSubtotal() + "€");
                    break;
                case 12:
                    pedido.getReferencia().nuevoArticulo(Articulos.RED_BULL);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.RED_BULL.getNombreArticulo() + ". La cuenta asciende a " + Articulos.getReferenciaArticulo().getSubtotal() + "€");
                    break;
                case 13:
                    pedido.getReferencia().nuevoArticulo(Articulos.COCA_COLA);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.COCA_COLA.getNombreArticulo() + ". La cuenta asciende a " + Articulos.getReferenciaArticulo().getSubtotal() + "€");
                    break;
                case 14:
                    pedido.getReferencia().nuevoArticulo(Articulos.BARRAS_PAN);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.BARRAS_PAN.getNombreArticulo() + ". La cuenta asciende a " + Articulos.getReferenciaArticulo().getSubtotal() + "€");
                    break;
                case 15:
                    pedido.getReferencia().nuevoArticulo(Articulos.BOTELLA_OXIGENO_ACTIVO);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.BOTELLA_OXIGENO_ACTIVO.getNombreArticulo() + ". La cuenta asciende a " + Articulos.getReferenciaArticulo().getSubtotal() + "€");
                    break;
                case 16:
                    pedido.getReferencia().nuevoArticulo(Articulos.LAYS_CAMPESINAS);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.LAYS_CAMPESINAS.getNombreArticulo() + ". La cuenta asciende a " + Articulos.getReferenciaArticulo().getSubtotal() + "€");
                    break;
                 case 17:
                    pedido.getReferencia().nuevoBolsaProducto(BolsasProductos.BOLSA_1);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.BOLSA_1.getNombreArticulo() + ". La cuenta asciende a " + BolsasProdcutos.getReferenciaBolsaProductos().getSubtotal() + "€");
                    break;
                case 18:
                    pedido.getReferencia().nuevoBolsaProducto(Articulos.BOLSA_2);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.LAYS_CAMPESINAS.getNombreArticulo() + ". La cuenta asciende a " + BolsasProdcutos.getReferenciaBolsaProductos().getSubtotal() + "€");
                    break;
                case 19:
                    pedido.getReferencia().nuevoBolsaProducto(Articulos.BOLSA_3);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.LAYS_CAMPESINAS.getNombreArticulo() + ". La cuenta asciende a " + BolsasProdcutos.getReferenciaBolsaProductos().getSubtotal() + "€");
                    break;
                case 20:
                    pedido.getReferencia().nuevoBolsaProducto(Articulos.BOLSA_4);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.LAYS_CAMPESINAS.getNombreArticulo() + ". La cuenta asciende a " + BolsasProdcutos.getReferenciaBolsaProductos().getSubtotal() + "€");
                    break;
                 case 21:
                    pedido.getReferencia().nuevoBolsaProducto(Articulos.BOLSA_5);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.LAYS_CAMPESINAS.getNombreArticulo() + ". La cuenta asciende a " + BolsasProdcutos.ggetReferenciaBolsaProductos().getSubtotal() + "€");
                    break;
                default:
                    System.out.println("Selecciona un artículo correcto");
                    continue;
            }

            // Se preguntar asi se quierena añadir ams productos utilizando una estructura de selección if
            System.out.print("¿Quieres añadir algún elemento más a la cesta? (Si/No): ");
            cont = s.next();
            if (cont.equalsIgnoreCase("No")) {
                addElement = !addElement; //Cambiamos el valor de la variable
            }

        }
        
        }
        

