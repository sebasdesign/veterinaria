package veterinaria1;

import Controlador.ControladorPrincipal;
import Vistas.Principal;


public class Main {

   
    public static void main(String[] args) {
        ControladorPrincipal controlador = new ControladorPrincipal();
        Principal principal = new Principal(controlador);
    }
    
}
