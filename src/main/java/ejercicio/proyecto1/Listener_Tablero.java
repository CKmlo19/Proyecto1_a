/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.proyecto1;

/**
 *
 * @author luisc
 */
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Listener_Tablero extends MouseAdapter {
    private int fila;
    private int columna;
    private Ventana refVentana;
    private JPanel tablero[][];

    public Listener_Tablero(int fila, int columna, Ventana refVentana) {
        this.fila = fila;
        this.columna = columna;
        this.refVentana = refVentana;
        tablero = refVentana.getTablero();
    }

    public Listener_Tablero(JLabel label, Ventana refVentana) {
        this.refVentana = refVentana;
    }
     
    @Override
    public void mouseClicked(MouseEvent e) {
        if(refVentana.isEnable()){ // si el enable es true
            if(tablero[fila][columna].getComponentCount() != 0){ // si la casiila no esta vacia
                JOptionPane.showMessageDialog(null, "La casilla se encuentra ocupada", "Mensaje de Error", JOptionPane.INFORMATION_MESSAGE);
            }
            // Para que no pueda colocar las defensas en el cuadrado exterior
            else if((fila == 0) || (columna == 0) || (fila == 24) || (columna == 24)){ // 
            JOptionPane.showMessageDialog(null, "No puedes colocar en dicha casilla", "Mensaje de Error", JOptionPane.INFORMATION_MESSAGE); 
            }
            else{
            refVentana.getLblSeleccion_Defensa().setVisible(!refVentana.isEnable());
            refVentana.setEnable(!refVentana.isEnable());
            refVentana.addDefensa(refVentana.getDefensa_seleccionada(), fila, columna);
            refVentana.getPnlPanelJuego().repaint();
            refVentana.getPnlDefensas().repaint();
            
            }
        }
    }
    
    
    
    
    // getters
    public int getFila(){
        return fila;
    
    }
    public int getColumna() {
        return columna;
    }
    
    
}

