/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilapedidos;

/**
 *
 * @author stefv
 */
public class Sorteo {
    private String NombreSorteo;
    private int Codigo;
    private String Tipo;
    private int Emisiones;
    
    public Sorteo(){
       this.Codigo=0;
       this.Emisiones=0;
       this.Tipo=null;
       this.NombreSorteo=null;
    }
    
    public Sorteo(String NombreSorteo, int Codigo, String Tipo, int Emisiones){
        this.NombreSorteo= NombreSorteo;
        this.Codigo=Codigo;
        this.Tipo=Tipo;
        this.Emisiones=Emisiones;
    }

    public String getNombreSorteo() {
        return NombreSorteo;
    }

    public void setNombreSorteo(String NombreSorteo) {
        this.NombreSorteo = NombreSorteo;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getEmisiones() {
        return Emisiones;
    }

    public void setEmisiones(int Emisiones) {
        this.Emisiones = Emisiones;
    }

    @Override
    public String toString() {
        return "Sorteo{" + "NombreSorteo=" + NombreSorteo + ", Codigo=" + Codigo + ", Tipo=" + Tipo + ", Emisiones=" + Emisiones + '}';
    }
    
    
}
