import affichage.*;
import donnee.*;

public class BDDB{
	
	public static void main(String[] args)
	
	{
		ModeleObjet.listBouteille("BDD/Bouteille.txt");
		ModeleObjet.listBrasserie("BDD/Brasserie.txt");
		ModeleObjet.listBreuvage("BDD/Breuvage.txt");	
		new Fenetre().setVisible(true);
	}
	
}
		
