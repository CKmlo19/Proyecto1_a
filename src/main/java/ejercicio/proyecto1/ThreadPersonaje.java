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
    private boolean isRunning = true; // este es para detener el juego
    private boolean suspendFlag = false;

    public ThreadPersonaje(Personaje personaje, Ventana refVentana) {
        this.personaje = personaje; 
        this.refVentana = refVentana;
    }

    @Override
    public void run() {
        
        while(isRunning){   
            try {
                
                refVentana.verificarRangoAdyacentes(personaje); // cada personaje verifica su rango
                sleep(1000);
                synchronized (this) {
                    while(suspendFlag){
                        wait();
                    }
                }
   
            } catch (InterruptedException ex) {
                System.out.println("Se ha interrumpido el programa");
               }
            } 
    }
    
    public void pausar(){
        this.suspendFlag = true;
    }
    
    public synchronized void reanudar(){
        this.suspendFlag = false;
        notify();
    }
    
    // getters and setters

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    
    
    
    
    
}
