/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webscarapping;

import javax.swing.JOptionPane;

/**
 *
 * @author stefv
 */
public class ConvertorCambio {
    public int cantidad;
    public float valorP;
    public double res;
    
   public void dolaresA_pesos(int cantidad, float valorP){
       String.valueOf(valorP);
       res= cantidad/valorP;
       JOptionPane.showMessageDialog(null, cantidad+"COLONES =" +res+ "USD");
   }
}
