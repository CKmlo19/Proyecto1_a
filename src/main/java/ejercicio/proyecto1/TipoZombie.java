/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.proyecto1;

/**
 *
 * @author masis
 */
public enum TipoZombie {
    
    AEREO("Zombie Aéreo"),
    CONTACTO("Zombie de Contacto"),
    MEDIANO_ALCANCE("Zombie de Mediano Alcance"),
    CHOQUE("Zombie de Choque");

    private final String tipo_especifico;

    private TipoZombie(String tipo_especifico) {
        this.tipo_especifico = tipo_especifico;
    }

    public static TipoZombie getAEREO() {
        return AEREO;
    }

    public static TipoZombie getCONTACTO() {
        return CONTACTO;
    }

    public static TipoZombie getMEDIANO_ALCANCE() {
        return MEDIANO_ALCANCE;
    }

    public static TipoZombie getCHOQUE() {
        return CHOQUE;
    }

    public String getTipoEspecifico() {
        return tipo_especifico;
    }
   
}




