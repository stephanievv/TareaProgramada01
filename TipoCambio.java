/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webscarapping;

/**
 *
 * @author stefv
 */
public class TipoCambio {
    private float Compra;
    
    //public TipoCambio(){
        //this.Venta=0;
    //}
    
    public TipoCambio(float Compra){
        this.Compra=Compra;
    }


    public float getCompra() {
        return Compra;
    }

    public void setCompra(float Compra) {
        this.Compra = Compra;
    }

    @Override
    public String toString() {
        return "Compra= " + Compra;
    }
    
    
}
