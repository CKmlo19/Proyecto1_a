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
    
    AEREO("Zombie Aéreo", "/ejercicio/proyecto1/zombie.gif"),
    CONTACTO("Zombie de Contacto", "/ejercicio/proyecto1/zombie.gif"),
    MEDIANO_ALCANCE("Zombie de Mediano Alcance", "ruta_del_zombie_mediano_alcance.gif"),
    CHOQUE("Zombie de Choque", "ruta_del_zombie_choque.gif");

    private final String nombre;
    private final String rutaGif;

    private TipoZombie(String nombre, String rutaImagen) {
        this.nombre = nombre;
        this.rutaGif = rutaImagen;
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

    public String getNombre() {
        return nombre;
    }

    public String getRutaGif() {
        return rutaGif;
    }
       
   
}




