/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaprioridad;

import java.util.PriorityQueue;

/**
 *
 * @author stefv
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQueue<Persona> cola = new PriorityQueue<Persona>();
        
        cola.add(new Persona("Daniel", 65, 117750104, "stefvalverdev@gmail.com", "El Carmen", 72933329));
        cola.add(new Persona("Gabriel", 2, 106160593, "jorgeganv@gmail.com", "El Carmen", 70162151));
        cola.add(new Persona("Sara",89, 10650148, "jacquelinevizcaino@hotmail.com", "El carmen", 60596425));
        
        while(!cola.isEmpty()){
            Persona a = cola.remove();
            System.out.println(a.getNombre() + " " + a.getEdad() + " " + a.getCedula() + " " + a.getCorreo() + " " + a.getDireccion() + " " + a.getTelefono());
        }
    }
    
}
