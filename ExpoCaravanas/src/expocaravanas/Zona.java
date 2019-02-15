/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expocaravanas;
/**
 *
 * @author Usuario DAM 1
 */
public class Zona {
    private int entradas;
    public Zona() {
    }

    public Zona(int entradas) {
        this.entradas = entradas;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }
    public void VenderEntrada(int PedEntradas){
     if(entradas>0){
         entradas= entradas-PedEntradas;
     }
    }
}
