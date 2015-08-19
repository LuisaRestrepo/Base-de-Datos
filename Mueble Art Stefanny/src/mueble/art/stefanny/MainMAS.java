/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mueble.art.stefanny;


import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 *
 * @author Luisa y Estefania
 */
public class MainMAS extends SingleFrameApplication{

    /**
     * @param args the command line arguments
     */
    @Override protected void startup() {
        show (new ArteStefanny());
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of AplicacionDistribuidoresNyAApp
     */
//    public static MainMAS getApplication() {
//        //return Application.getInstance(ArteStefanny.class);
//        return Application.getInstance(ArteStefanny.class);
//    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(MainMAS.class, args);
    }
}
   
    
