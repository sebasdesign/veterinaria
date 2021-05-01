
package Modelo;

public class Felino extends Animal{
    private boolean toxoplasmosis;

    public Felino(String nombre, String raza, String color, int edad, boolean toxoplasmosis) {
        super(nombre, raza, color, edad);
        this.toxoplasmosis = toxoplasmosis;
    }
    
    public Felino() {
    }
    
    public boolean isToxoplasmosis() {
        return toxoplasmosis;
    }

    public void setToxoplasmosis(boolean toxoplasmosis) {
        this.toxoplasmosis = toxoplasmosis;
    }
    
}
