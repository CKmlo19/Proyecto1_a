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
    AEREO("Defensa Aérea", "ruta_de_defensa_aerea.gif"),
    CONTACTO("Defensa de Contacto", "ruta_de_defensa_de_contacto.gif"),
    MEDIANO_ALCANCE("Defensa de Mediano Alcance", "ruta_de_defensa_de_mediano_alcance.gif"),
    IMPACTO("Defensa de Impacto", "ruta_de_defensa_de_impacto.gif"),
    ATAQUE_MULTIPLE ("Defensa de Ataque Múltiple","ruta_de_defensa_de_ataque_multiplo.gif"),
    BLOQUES ("Defensa de Bloque", "ruta_de_defensa_de_bloque.gif");
    
    private final String nombre;

    private TipoDefensa(String nombre, String rutaImagen) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
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



    