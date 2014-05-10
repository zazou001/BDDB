package pkg.dao;

import pkg.donnee.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class BreuvageDAO extends DAO<Breuvage> {
	
	public BreuvageDAO(Connection conn) {
		super(conn);
	}

	public void create(Breuvage breuvage) {
		try{
			PreparedStatement prepareStatement = this.connect.prepareStatement(
					"INSERT INTO 'breuvage' VALUES(?, ?, ? ,? ,?, ?, ?, ?, ? ,? ,?);");
					prepareStatement.setInt(1, breuvage.getId());
					prepareStatement.setString(2, breuvage.getNom());
					prepareStatement.setInt(3, breuvage.getAlcool());
					prepareStatement.setString(4, breuvage.getTypeFermentation());
					prepareStatement.setString(5, breuvage.getParticularite());
					prepareStatement.setString(6, breuvage.getCouleur());
					prepareStatement.setInt(7, breuvage.getAnnee());
					prepareStatement.setInt(8, breuvage.getNote());
					prepareStatement.setString(9, breuvage.getCommentaire());
					prepareStatement.setInt(10, breuvage.getIdBouteille());
					prepareStatement.setInt(11, breuvage.getIdBrasserie());
					prepareStatement.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(Breuvage breuvage) {
		try {
		this.connect.createStatement()
				.executeUpdate("DELETE FROM 'breuvage' WHERE idBreuvage =" + breuvage.getId());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
   
	public void update(Breuvage breuvage) {

	}
   
	public Breuvage find(int id) {
		Breuvage breuvage = new Breuvage();      
      
		try {
			ResultSet result = this.connect.createStatement()
				.executeQuery("SELECT * FROM breuvage WHERE idBreuvage = " + id);
			breuvage = new Breuvage(
				result.getInt("idBreuvage"), 
				result.getString("nom"),
				result.getInt("alcool"),
				result.getString("typefermentation"),
				result.getString("particularite"),
				result.getString("couleur"),
				result.getInt("annee"),
				result.getInt("note"),
				result.getString("commentaire"),
				result.getInt("idBouteille"),
				result.getInt("idBrasserie"));
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return breuvage;
	}
}
