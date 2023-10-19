/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.proyecto1;

import java.awt.Color;
import java.awt.Image;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author luisc
 */
public class Personaje implements Serializable {

    private String Nombre;
    private int vida;
    private int golpes;
    private int cantidad_golpes;
    private int nivel;
    private int campos;
    private int nivel_aparicion;
    private String tipo;
    private int rango;
    private int daño;
    private int posicion_x;
    private int posicion_y;
    private JLabel label;
    private String rutaImagen;
    
    public Personaje(String Nombre, int vida, int cantidad_golpes, int nivel, int campos, int nivel_aparicion, String tipo, int rango, int daño, String rutaImagen) {
        this.Nombre = Nombre;
        this.vida = vida;
        this.cantidad_golpes = cantidad_golpes;
        this.nivel = nivel;
        this.campos = campos;
        this.nivel_aparicion = nivel_aparicion;
        this.tipo = tipo;
        this.rango = tipo.equals("MEDIANO_ALCANCE") ? 2 : 1;
        this.daño = daño;
        this.rutaImagen = rutaImagen;
        
        label = new JLabel("" + vida);
        //ImageIcon imagen = new ImageIcon(rutaImagen);
       // Image imagenRedimensionada = imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_REPLICATE);
       // label.setIcon(imagen);
        label.setVisible(true);
        label.setBackground(Color.red);
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setOpaque(true);
    }
    
    public void morir(Personaje oponente) {
        this.vida = 0;
        System.out.println("Te has muerto");
    }
    
    public void pelear(Personaje oponente, Ventana ventana) {
        int dañoTotal = this.cantidad_golpes * this.daño;
        oponente.vida -= dañoTotal;
        int vida1 = oponente.vida;
        String vida = Integer.toString(vida1);
        if (oponente.vida <= 0) {
            ventana.morirDeVerdad(oponente);
        }
    }
    
//    private void AtaqueAZombieAereo(Personaje zombie, TipoZombie tipoZombie, TipoDefensa tipoDefensa) {
//        
//        if (tipoZombie == TipoZombie.AEREO && tipoDefensa == TipoDefensa.AEREO) {
//            pelear(zombie);
//        } else {
//            System.out.println("Esta defensa no puede atacar a un Zombie Aéreo.");
//        }
//    }

    // getters and setters
    @Override
    public String toString() {
        return "Personaje{" + "Nombre=" + Nombre + ", vida=" + vida + ", cantidad_golpes=" + cantidad_golpes + ", nivel=" + nivel + ", campos=" + campos + ", nivel_aparicion=" + nivel_aparicion + ", tipo=" + tipo + ", rango=" + rango + '}';
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public int getVida() {
        return vida;
    }
    
    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public int getCantidad_golpes() {
        return cantidad_golpes;
    }
    
    public void setCantidad_golpes(int cantidad_golpes) {
        this.cantidad_golpes = cantidad_golpes;
    }
    
    public int getNivel() {
        return nivel;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public int getCampos() {
        return campos;
    }
    
    public void setCampos(int campos) {
        this.campos = campos;
    }
    
    public int getNivel_aparicion() {
        return nivel_aparicion;
    }
    
    public void setNivel_aparicion(int nivel_aparicion) {
        this.nivel_aparicion = nivel_aparicion;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getRango() {
        return rango;
    }
    
    public void setRango(int rango) {
        this.rango = rango;
    }
    
    public void setDaño(int daño) {
        this.daño = daño;
    }
    
    public int getDaño() {
        return daño;
    }
    
    public int getGolpes() {
        return golpes;
    }
    
    public void setGolpes(int golpes) {
        this.golpes = golpes;
    }
    
    public int getPosicion_x() {
        return posicion_x;
    }
    
    public void setPosicion_x(int posicion_x) {
        this.posicion_x = posicion_x;
    }
    
    public int getPosicion_y() {
        return posicion_y;
    }
    
    public void setPosicion_y(int posicion_y) {
        this.posicion_y = posicion_y;
    }
    
    public String getRutaImagen() {
        return rutaImagen;
    }
    
    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    
    public JLabel getLabel() {
        return label;
    }
    
    public void setLabel(JLabel label) {
        this.label = label;
    }
    
}
