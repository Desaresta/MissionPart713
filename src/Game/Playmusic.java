package Game;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
/**
 *
 * @author Fluke
 */
public class Playmusic {
    
    public static void main(String[] args){
        System.out.println("Love");
        
        try{ 
                FileInputStream fileInputStream = new FileInputStream("Inn.mp3");
                Player player = new Player(fileInputStream);    
                player.play();
                }catch(FileNotFoundException | JavaLayerException e){
                } 
    }  
}


    

