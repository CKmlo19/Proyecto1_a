/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.proyecto1;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author masis
 */
public class Defensa extends Personaje{
    private TipoDefensa tipoDefensa;

    public Defensa(TipoDefensa tipoDefensa, String Nombre, int vida, int cantidad_golpes, int nivel, int campos, int nivel_aparicion, String tipo, int rango, int daño, String rutaImagen) {
        super(Nombre, vida, cantidad_golpes, nivel, campos, nivel_aparicion, tipo, rango, daño, rutaImagen);
        this.tipoDefensa = tipoDefensa;
    }
    
   
    
    @Override
    public String toString() {
        return "Defensa{" + "Nombre=" + getNombre() + ", tipo=" + tipoDefensa.getTipoEspecifico() + '}';
    }

    public TipoDefensa getTipoDefensa() {
        return tipoDefensa;
    }

    public void setTipoDefensa(TipoDefensa tipoDefensa) {
        this.tipoDefensa = tipoDefensa;
    }



}



    
    
    
    
    
    
