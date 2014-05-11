package pkg.dao;

import pkg.donnee.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class BouteilleDAO extends DAO<Bouteille> {
	
	public BouteilleDAO(Connection conn) {
		super(conn);
	}

	public void create(Bouteille bouteille) {
		try{
			PreparedStatement prepareStatement = this.connect.prepareStatement(
					"INSERT INTO 'bouteille' VALUES(?, ?, ? ,?);");
					prepareStatement.setInt(1, bouteille.getId());
					prepareStatement.setInt(2, bouteille.getTaille());
					prepareStatement.setString(3, bouteille.getFormat());
					prepareStatement.setString(4, bouteille.getBouchon());
					prepareStatement.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(Bouteille bouteille) {
		try {
		this.connect.createStatement()
				.executeUpdate("DELETE FROM 'bouteille' WHERE idBouteille =" + bouteille.getId()+ "; " +
				"UPDATE 'breuvage' set idBouteille = null where idBouteille =" + bouteille.getId() + "; ");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
   
	public void update(String table, String colonne, Object champs, int id) {}
   
	public Bouteille find(int id) {
		Bouteille bouteille = new Bouteille();      
      
		try {
			ResultSet result = 
				this.connect.createStatement().executeQuery(
					"SELECT * FROM bouteille WHERE idBouteille = " + id);
			bouteille = new Bouteille(
				result.getInt("idBouteille"),
				result.getInt("taille"),
				result.getString("format"),
				result.getString("bouchon"));         
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return bouteille;
	}
	
	public List<Bouteille> findAll()
	{
		List<Bouteille> bouteille = new ArrayList<Bouteille>();      
      
		try {
			ResultSet result = 
				this.connect.createStatement().executeQuery(
					"SELECT * FROM bouteille");
			while(result.next())
				bouteille.add(new Bouteille(
					result.getInt("idBouteille"),
					result.getInt("taille"),
					result.getString("format"),
					result.getString("bouchon")));        
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return bouteille;
	}
}
