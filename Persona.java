/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaprioridad;

/**
 *
 * @author stefv
 */
public class Persona implements Comparable<Persona> {
    private String Nombre;
    private int cedula;
    private int edad;
    private String direccion;
    private int telefono;
    private String correo;
    
    
    public Persona(){
        this.Nombre=null;
        this.edad=0;
        this.cedula= 0;
        this.correo= null;
        this.direccion= null;
        this.telefono=0;
    }
    
    public Persona(String Nombre, int edad, int cedula, String correo, String direccion, int telefono){
        this.Nombre= Nombre;
        this.edad= edad;
        this.cedula= cedula;
        this.correo= correo;
        this.direccion=direccion;
        this.telefono=telefono;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String Nombre){
        this.Nombre= Nombre;
    }
    
    public int getEdad(){
        return edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public void setEdad(int edad){
        this.edad= edad;
    }

    @Override
    public int compareTo(Persona t) {
        if (edad < 65){
            return 1;
        }
        else if(edad > 65){
            return -1;
        }
        else{
            return 0;
        }
    }
    
}
