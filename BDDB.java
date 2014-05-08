import affichage.*;
import donnee.*;

public class BDDB{
	
	public static void main(String[] args)
	
	{
<<<<<<< HEAD

		ModeleObjet.listBouteille("BDD/Bouteille.txt");
		ModeleObjet.listBrasserie("BDD/Brasserie.txt");
		ModeleObjet.listBreuvage("BDD/Breuvage.txt");	
		new Fenetre().setVisible(true);
=======
		Brasserie brasserie1,brasserie2;
		brasserie1 = new Brasserie("Kronenbourg","Strasbourg","France");
		brasserie2 = new Brasserie("Heineken","Dusseldorf","Pays-Bas");
		System.out.println(brasserie1);
		System.out.println(brasserie2);
		
		Bouteille bouteille1,bouteille2;
		bouteille1 = new Bouteille(0,75,"Alcoolique","Capsule");
		bouteille2 = new Bouteille(1,100,"Test","Bouchon");
		System.out.println(bouteille1);
		System.out.println(bouteille2);
		
		return 0;
>>>>>>> 981acf79811962f30dea68cbc4a3000ec763d0f0
	}
	
}
		
