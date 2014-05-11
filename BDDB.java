import pkg.affichage.*;
import pkg.donnee.*;
import pkg.connection.*;
import pkg.dao.*;

import java.sql.Connection;

public class BDDB{
	
	public static void main(String[] args)
	{
		Connexion connexion = new Connexion("biere.bd");

		DAO<Biere> biereDao = new BiereDAO(connexion.connect());
		ModeleObjet modele = new ModeleObjet(biereDao);
        
		new Fenetre(modele).setVisible(true);
        connexion.close();	
	}
}
		
