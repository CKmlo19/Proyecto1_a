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
    Personaje personaje;
    Ventana refVentana;
    boolean isRunning = true;

    public ThreadPersonaje(Personaje personaje, Ventana refVentana) {
        this.personaje = personaje; 
        this.refVentana = refVentana;
    }

    @Override
    public void run() {
        
        while(isRunning){
            
            try {
                //determina x y y personaje.mover()
                refVentana.verificarRangoDefensa(personaje);
                refVentana.moverPersonaje(personaje);
                sleep(5000);
   
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
    
    
    
    
    
    
    
}
