/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.proyecto1;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author luisc
 */

// clase que hereda de personaje
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Zombie extends Personaje {
    private TipoZombie tipoZombie;
    JLabel label;

    public Zombie(TipoZombie tipoZombie, String Nombre, int vida, int cantidad_golpes, int nivel, int campos, int nivel_aparicion, String tipo, int rango, int daño) {
        super(Nombre, vida, cantidad_golpes, nivel, campos, nivel_aparicion, tipo, rango, daño);
        this.tipoZombie = tipoZombie;
        
       
        label =  new JLabel();
       // label.setBackground(Color.red);
       // label.setForeground(new java.awt.Color(255, 255, 255));
        //label.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
       // label.setForeground(new java.awt.Color(255, 255, 255));
      //  label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setOpaque(true);
//        try{
//        ImageIcon gif = new ImageIcon(getClass().getResource("/ejercicio/proyecto1/zombie.gif"));
//        label.setIcon(gif);
//        }
//        catch(Exception e){
//            System.out.println("La imagen no se ha encontrado");
//        }
        this.setLabel(label);
    }
   
    
//    public JLabel getLabel() {
//        //ImageIcon icon = new ImageIcon(getClass().getResource(tipoZombie.getRutaImagen()));
//        //JLabel label = new JLabel(icon);
//        return label;
//    }
    
    @Override
    public String toString() {
        return "Zombie{" + "Nombre=" + getNombre() + ", tipo=" + tipoZombie.getNombre() + '}';
    }

}
    
    
    
    
    
    
    