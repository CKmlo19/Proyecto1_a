/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.proyecto1;


public class Zombie extends Personaje {
    private TipoZombie tipoZombie;

    public Zombie(TipoZombie tipoZombie, String Nombre, int vida, int cantidad_golpes, int nivel, int campos, int nivel_aparicion, String tipo, int rango, int daño, String rutaImagen) {
        super(Nombre, vida, cantidad_golpes, nivel, campos, nivel_aparicion, tipo, rango, daño, rutaImagen);
        this.tipoZombie = tipoZombie;
        
    }
    
    @Override
    public String toString() {
        return "Zombie{" + "Nombre=" + getNombre() + ", tipo=" + tipoZombie.getTipoEspecifico()+ '}';
    }

}
    
    
    
    
    
    
    