package pkg.affichage;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Panel extends JFrame {
	
	private Info info;
	
	public Panel(String name, int id){   
		this.setTitle(name);
		this.setSize(600, 500);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
           
		//Instanciation d'un objet JPanel
		JPanel pan = new JPanel();       
		//On prévient notre JFrame que notre JPanel sera son content pane               

		
		
		switch(name){
            case "Information":
                this.setContentPane(new Info());

                break;
            case "Ajouter":
                //this.setContentPane(new Add());
                break;
            case "Modification":
                //this.setContentPane(new Modif());
                break;
            default:
                break; //Ne devrait jamais arriver
        }
        //Définition de sa couleur de fond
	}       
}
