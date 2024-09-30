package Clases;

import interfazGraficaUsuario.Principal;

public class AgendaElectronica {
    
    public static void main(String[] args) {
        
        Principal jframe = new Principal();
        /*
        Esto hara que mi jFrame sea visible pero si no le digo
        donde quiero que salte la interfaz grafica aparecera en cualquier lugar.
         */
        jframe.setVisible(true);
        // Aca le daremos la localización a nuestra interfaz
        jframe.setLocationRelativeTo(null);
        
    }
    
}
