package pkg.dao;

import pkg.donnee.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class BiereDAO extends DAO<Biere> {
	
	public BiereDAO(Connection conn) {
		super(conn);
	}

	public void create(Biere biere) {}

	public void delete(Biere biere) {}
   
	public void update(String table, String colonne, Object champs, int id) 
	{
		try {
		this.connect.createStatement().executeUpdate(
					"UPDATE '"+ table +"' set "+ colonne +" = '" + champs + "'WHERE idBreuvage = " + id );
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Biere find(int id) 
	{
		Biere biere = new Biere();      
      
		try {
			ResultSet result = this.connect.createStatement()
				.executeQuery("SELECT * FROM biere WHERE idBreuvage = " + id);
			biere = new Biere(
					result.getInt("idBreuvage"),
					result.getString("nom"),
					result.getFloat("alcool"),
					result.getString("typefermentation"),
					result.getString("particularite"),
					result.getString("couleur"),
					result.getInt("annee"),
					result.getInt("note"),
					result.getString("commentaire"),
					result.getInt("idBouteille"),
					result.getInt("idBrasserie"),
					result.getString("nomBrasserie"),
					result.getString("ville"),
					result.getString("pays"),
					result.getInt("taille"),
					result.getString("format"),
					result.getString("bouchon"));       
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return biere;
	}
   
	public List<Biere> findAll() 
	{
		List<Biere> bieres = new ArrayList<Biere>();      
      
		try {
			ResultSet result = this.connect.createStatement().
				executeQuery("SELECT * FROM biere");
			while(result.next())
				bieres.add(new Biere(
					result.getInt("idBreuvage"),
					result.getString("nom"),
					result.getFloat("alcool"),
					result.getString("typefermentation"),
					result.getString("particularite"),
					result.getString("couleur"),
					result.getInt("annee"),
					result.getInt("note"),
					result.getString("commentaire"),
					result.getInt("idBouteille"),
					result.getInt("idBrasserie"),
					result.getString("nomBrasserie"),
					result.getString("ville"),
					result.getString("pays"),
					result.getInt("taille"),
					result.getString("format"),
					result.getString("bouchon")));         
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return bieres;
	}
}
