//import pkg.affichage.*;
import pkg.donnee.*;
import pkg.connection.*;
import pkg.dao.*;

import java.sql.Connection;

public class BDDB{
	
	public static void main(String[] args)
	{
        Connexion connexion = new Connexion("biere.bd");
        Connection connect = connexion.connect();
		DAO<Breuvage> breuvageDao = new BreuvageDAO(connect);
		DAO<Bouteille> bouteilleDao = new BouteilleDAO(connect);
		DAO<Brasserie> brasserieDao = new BrasserieDAO(connect);
		Bouteille bouteille = new Bouteille(1,33,"normal","capsule");
		bouteilleDao.create(bouteille);
		Bouteille b1 = bouteilleDao.find(1);
		bouteilleDao.delete(b1);
        Breuvage breuvage = breuvageDao.find(2);
		System.out.println("Biere N°" +breuvage.getTypeFermentation() +" - " + breuvage.getParticularite() + " " + breuvage.getAlcool());

        connexion.close();	
		//new Fenetre().setVisible(true);
	}
}
		
