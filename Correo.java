/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;

import java.util.Properties;

/**
 *
 * @author stefv
 */
public class Correo {
    private String Usuario;
    private String Contrasena;
    private String Ruta;
    private String Nombre;
    private String Destino;
    private String Asunto; 
    private String Mensaje;

    //public Correo(String Usuario, String Contrasena, String Destino, String Mensaje, String Asunto, String Nombre, String Ruta){
        //this.Usuario=Usuario;
        //this.Contrasena=Contrasena;
        //this.Destino=Destino;
        //this.Mensaje=Mensaje;
        //this.Asunto=Asunto;
        //this.Nombre=Nombre;
        //this.Ruta=Ruta;
    //}
    
    //public Correo(String Usuario, String Contrasena, String Destino, String Mensaje){
        //this.Usuario=Usuario;
        //this.Contrasena=Contrasena;
        //this.Destino=Destino;
        //this.Mensaje=Mensaje;
        //this.Asunto="";
        //this.Nombre="";
        //this.Ruta="";
    //}
    
    //public Correo(String Usuario, String Contrasena, String Destino, String Asunto, String Mensaje){
        //this.Usuario=Usuario;
        //this.Contrasena=Contrasena;
        //this.Destino=Destino;
        //this.Asunto=Asunto;
        //this.Mensaje=Mensaje;
        //this.Nombre="";
        //this.Ruta="";
    //}
    
    //public boolean sendMail(){
        //try{
            //Properties props =new Properties();
            //props.put("mail.smtp.host", "smtp.gmail.com");
            //props.setProperty("mail.smtp.starttls.enable", "true");
            //props.setProperty("mail.smtp.port", "587");
            //props.setProperty("mail.smtp.user", Usuario);
            //props.setProperty("mail.smtp.auth", "true");
        //}
    //}
    
    
    
    
    
    
    
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }
    
    
}
