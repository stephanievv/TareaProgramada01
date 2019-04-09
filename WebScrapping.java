/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webscarapping;


import java.io.IOException;
import javax.swing.JOptionPane;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author stefv
 */
public class WebScrapping {
    private ListaTipos<TipoCambio> tipocambios;
    
    public WebScrapping(){
        this.tipocambios=new ListaTipos<>();
    }
    
    public void agragarInformación(float Venta) throws IOException{
        tipocambios.insert(new TipoCambio(Venta));
    }

    @Override
    public String toString() {
        return "WebScrapping{" + "tipocambios=" + tipocambios + '}';
    }
    
    

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {        
        WebScrapping prueba=new WebScrapping();
        
        Document doc = Jsoup.connect("http://indicadoreseconomicos.bccr.fi.cr/indicadoreseconomicos/Cuadros/frmVerCatCuadro.aspx?idioma=1&CodCuadro=%20435").get();
        Elements temporal= doc.select("td.celda435");

        
        for(Element dolar: temporal){
            if (dolar.select("td.celda435:nth-of-type(6)").text().equals("")) {
                continue;
            }
            else if(dolar.select("td.celda435:nth-of-type(6)").text().equals("7 Abr 2019")){
                continue;
            }
            else {
                //final String ticker = 
                    //dolar.select("td.celda435:nth-of-type(1)").text();
                final String tempnumero=
                    dolar.select("td.celda435:nth-of-type(6)").get(0).text();
                final String tempnumero1=
                    tempnumero.replaceAll(",", ".");
                final float numero= Float.parseFloat(tempnumero1);
                
                
                prueba.agragarInformación(numero);
    
                break;
            }
        }
        
       ConvertorCambio objeto= new ConvertorCambio();
       int m;
       int cantidad;
       float valorP;
           m= Integer.parseInt(JOptionPane.showInputDialog("Convertidor de Moneda\n"
                               + "1. Convertir Dólar a Colones\n"
                               + "2. Salir\n"
                               + "Elige una opción"));
           switch(m){
               case 1:
                   valorP=prueba.tipocambios.getHead().getElement().getCompra();
                   cantidad= Integer.parseInt(JOptionPane.showInputDialog("Convertir Colones a Dólares \n" + "Ingresa la cantidad a convertir"));
                   objeto.dolaresA_pesos(cantidad, valorP);
                   break;
               case 2:
                   JOptionPane.showMessageDialog(null, "Salió del programa", "Salida", m);
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Opción no válida", "Error", m);
           }
    }

}