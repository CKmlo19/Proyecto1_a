/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.proyecto1;

/**
 *
 * @author masis
 */
public enum TipoDefensa {
    AEREO("Defensa Aérea"),
    CONTACTO("Defensa de Contacto"),
    MEDIANO_ALCANCE("Defensa de Mediano Alcance"),
    IMPACTO("Defensa de Impacto"),
    ATAQUE_MULTIPLE ("Defensa de Ataque Múltiple"),
    BLOQUES ("Defensa de Bloque");
    
    private final String tipo_especifico;

    private TipoDefensa(String tipo_especifico) {
        this.tipo_especifico = tipo_especifico;
    }

    public String getTipoEspecifico() {
        return tipo_especifico;
    }

    public static TipoDefensa getAEREO() {
        return AEREO;
    }

    public static TipoDefensa getCONTACTO() {
        return CONTACTO;
    }

    public static TipoDefensa getMEDIANO_ALCANCE() {
        return MEDIANO_ALCANCE;
    }

    public static TipoDefensa getIMPACTO() {
        return IMPACTO;
    }

    public static TipoDefensa getATAQUE_MULTIPLE() {
        return ATAQUE_MULTIPLE;
    }

    public static TipoDefensa getBLOQUES() {
        return BLOQUES;
    }
    
    
}



    