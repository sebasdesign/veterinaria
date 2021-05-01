
package Controlador;

import Modelo.Animal;
import Modelo.Canino;
import Modelo.Felino;
import java.util.ArrayList;

public class ControladorPrincipal {

    ArrayList<Animal> animales;
    
    public ControladorPrincipal() {
        animales= new ArrayList<>();
        animales.add(new Felino("Fischer", "Criollo", "Amarillo", 6, false));
        animales.add(new Canino("Cara", "Dalmata", "Cafe", 3, 5));
        animales.add(new Canino("Nai", "Pitbull", "Naranja", 12, 8));
        animales.add(new Felino("Cleare", "Persa", "Blanco", 1, true));
    }
    
    public boolean insertarAnimal(Animal animal){
        animales.add(animal);
        return true;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }
    
    public String[][] crearArreglo(){
        String[][] arreglo = new String[animales.size()][6];
        int i=0;
        for (Animal animal : animales) {
            arreglo[i][0]=animal.getClass().getSimpleName();
            arreglo[i][1]=animal.getNombre();
            arreglo[i][2]=animal.getRaza();
            arreglo[i][3]=animal.getColor();
            arreglo[i][4]=String.valueOf(animal.getEdad());
            if(animal.getClass().getName()=="Modelo.Felino") arreglo[i][5]=((Felino)animal).isToxoplasmosis()?"ENFERMO":"SANO";
            else arreglo[i][5]=String.valueOf(((Canino)animal).getNivelEntrenamiento());
            i++;
        }
        return arreglo;
    }

    public String[] crearEncavezado() {
        String[] encabezado=new String[6];
        encabezado[0]="Tipo";
        encabezado[1]="Nombre";
        encabezado[2]="Raza";
        encabezado[3]="Color";
        encabezado[4]="Edad";
        encabezado[5]="Entrenamiento/Toxoplasmosis";
        return encabezado;
    }

    public double edadPromedio() {
        double promedio=0;
        for (Animal animale : animales) {
            promedio+=animale.getEdad();
        }
        return promedio/animales.size();
    }

    public int contarFelinos() {
        
     int cantFelinos=0;
        for (Animal animale : animales) {
            if(animale.getClass().getName()=="Modelo.Felino") cantFelinos++;
        }
        return cantFelinos;
    }
    
     public int contarCaninos() {
        
     int cantCaninos=0;
        for (Animal animale : animales) {
            if(animale.getClass().getName()=="Modelo.Canino") cantCaninos++;
        }
        return cantCaninos;
    }
    
}
