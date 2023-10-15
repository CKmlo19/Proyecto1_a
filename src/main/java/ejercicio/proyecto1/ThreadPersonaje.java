/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.proyecto1;

import static java.lang.Thread.sleep;

/**
 *
 * @author luisc
 */
public class ThreadPersonaje extends Thread{
    private Personaje personaje;
    private Ventana refVentana;
    private boolean isRunning = true;

    public ThreadPersonaje(Personaje personaje, Ventana refVentana) {
        this.personaje = personaje; 
        this.refVentana = refVentana;
    }

    @Override
    public void run() {
        
        while(isRunning){
            
//            try{ // si logra hacer el casting significa que es un zombie
//                Zombie z1 = (Zombie) personaje;
//                System.out.println("Se puede hacer");
//            } 
//            catch(ClassCastException ex){
//                System.out.println("Error, no se puede hacer el casting");
//                
//            }

//            if(personaje.getTipo().equals("ZOMBIE")){ // si el personaje es un zombie
//                try {
//                //determina x y y personaje.mover()
//                refVentana.verificarRangoAdyacentes(personaje);
//                sleep(1000);
//   
//                } catch (InterruptedException ex) {
//                System.out.println("Se ha interrumpido el programa");
//                }
//            }
//            else{
                
            try {
                //determina x y y personaje.mover()
                refVentana.verificarRangoAdyacentes(personaje);
                sleep(1000);
   
            } catch (InterruptedException ex) {
                System.out.println("Se ha interrumpido el programa");
               }
            } 
        }
    
    public void pausar(){
        this.isRunning = false;
    }
    
    public void reanudar(){
        this.isRunning = true;
        synchronized (this) {
            notify();
        }
    }
    
    // getters and setters

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    
    
    
    
    
}
