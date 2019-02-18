/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expocaravanas;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class ExpoCaravanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion, TotalEntradas;
        int PedEntradas = 0;
        Scanner sc = new Scanner(System.in);
        Zona Principal = new Zona(1000);
        Zona CompraVenta = new Zona(200);
        Zona Vip = new Zona(25);

        do {
            System.out.println("1. Mostrar numero de entradas");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            TotalEntradas = Principal.getEntradas() + CompraVenta.getEntradas() + Vip.getEntradas();
            if (opcion == 1) {
                System.out.println("Quedan " + TotalEntradas + " entradas en total");
                System.out.println("Quedan " + Principal.getEntradas() + " de la zona proncipal");
                System.out.println("Quedan " + CompraVenta.getEntradas() + " de la zona Compra-Venta");
                System.out.println("Quedan " + Vip.getEntradas() + " de la zona VIP");
            } else if (opcion == 2) {
                int Opcion2 = 0;
                System.out.println("Indique de que zona va a querer las entradas");
                System.out.println("1. Zona principal ");
                System.out.println("2. Zona Compra-Venta");
                System.out.println("3. Zona Vip");
                Opcion2 = sc.nextInt();
                switch (Opcion2) {
                    case 1:
                        System.out.println("Indique el número de entradas de la Zona principal");
                        PedEntradas = sc.nextInt();
                        Principal.VenderEntrada(PedEntradas);
                        System.out.println("Ahora quedan: " + Principal.getEntradas());
                        break;
                    case 2:
                        System.out.println("Indique el número de entradas de la Zona Compra-Venta");
                        CompraVenta.VenderEntrada(PedEntradas);
                        break;
                    case 3:
                        System.out.println("Indique el número de entradas de la Zona Vip");
                        Vip.VenderEntrada(PedEntradas);
                        break;
                    default:
                        System.out.println("ERROR");
                }
            } else {
                if (opcion == 3) {
                    break;
                }

            }

        } while (opcion != 3);
    }
}
