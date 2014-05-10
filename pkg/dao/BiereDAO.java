package pkg.dao;

import pkg.donnee.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BiereDAO {
	
	public BiereDAO(){}

	/*public void create(Biere biere) {}

	public void delete(Biere biere) {}
   
	public void update(Biere biere) {}*/
   
	public List<Biere> find(Connection connect) {
		List<Biere> bieres = new ArrayList<Biere>();      
      
		try {
			ResultSet result = connect.createStatement().
				executeQuery("SELECT * FROM biere");
			while(result.next())
				bieres.add(new Biere(
					result.getString("nom"),
					result.getString("nom brasserie"),
					result.getString("couleur"),
					result.getFloat("alcool"),
					result.getInt("annee"),
					result.getInt("note")));         
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return bieres;
	}
}
