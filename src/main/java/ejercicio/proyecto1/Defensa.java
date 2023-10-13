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
    private JLabel label;

    public Defensa(TipoDefensa tipoDefensa, String Nombre, int vida, int cantidad_golpes, int nivel, int campos, int nivel_aparicion, String tipo, int rango, int daño) {
        super(Nombre, vida, cantidad_golpes, nivel, campos, nivel_aparicion, tipo, rango, daño);
        this.tipoDefensa = tipoDefensa;
        label = new JLabel("100");
        label.setBackground(Color.ORANGE);
        label.setForeground(Color.white);
        label.setOpaque(true);
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setLabel(label);
    }
    
    
    
//        public JLabel getLabel() {
//        ImageIcon icon = new ImageIcon(getClass().getResource(tipoDefensa.getRutaImagen()));
//        JLabel label = new JLabel(icon);
//        return label;
//    }
    
    @Override
    public String toString() {
        return "Defensa{" + "Nombre=" + getNombre() + ", tipo=" + tipoDefensa.getNombre() + '}';
    }



}



    
    
    
    
    
    
