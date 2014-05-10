//import pkg.affichage.*;
import pkg.donnee.*;
import pkg.connection.*;
import pkg.dao.*;

public class BDDB{
	
	public static void main(String[] args)
	{
        Connexion connexion = new Connexion("biere.bd");
		DAO<Breuvage> breuvageDao = new BreuvageDAO(connexion.connect());
        Breuvage breuvage = breuvageDao.find(2);
		System.out.println("Biere N°" +breuvage.getId() +" - " + breuvage.getNom() + " " + breuvage.getAlcool());

        connexion.close();	
		//new Fenetre().setVisible(true);
	}
}
		
