/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Fluke
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu.main(args);
        int i = 0;
        try{ 
            while(i < 100){
        FileInputStream fileInputStream = new FileInputStream("Gaia_in_Fog.mp3");
        Player player = new Player(fileInputStream);
        player.play();
        i++;
            }
       }catch(FileNotFoundException | JavaLayerException e){
       }
        
       
    }
    
}
