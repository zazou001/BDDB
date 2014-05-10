package pkg.dao;

import pkg.donnee.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class BouteilleDAO extends DAO<Bouteille> {
	
	public BouteilleDAO(Connection conn) {
		super(conn);
	}

	public void create(Bouteille bouteille) {
		try{
			PreparedStatement prepareStatement = this.connect.prepareStatement(
					"INSERT INTO 'bouteille' VALUES(?, ?, ? ,?)");
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

	public void delete(Bouteille obj) {
   
	}
   
	public void update(Bouteille obj) {

	}
   
	public Bouteille find(int id) {
		Bouteille bouteille = new Bouteille();      
      
		try {
			ResultSet result = this.connect.createStatement().executeQuery("SELECT * FROM bouteille WHERE idBouteille = " + id);
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
}
