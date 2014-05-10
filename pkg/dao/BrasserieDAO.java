package pkg.dao;

import pkg.donnee.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class BrasserieDAO extends DAO<Brasserie> {
	public BrasserieDAO(Connection conn) {
		super(conn);
	}

	public void create(Brasserie brasserie) {
		try{
			PreparedStatement prepareStatement = this.connect.prepareStatement(
					"INSERT INTO 'brasserie' VALUES(?, ?, ? ,?);");
					prepareStatement.setInt(1, brasserie.getId());
					prepareStatement.setString(2, brasserie.getNom());
					prepareStatement.setString(3, brasserie.getVille());
					prepareStatement.setString(4, brasserie.getPays());
					prepareStatement.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(Brasserie brasserie) {
		try {
			this.connect.createStatement()
				.executeUpdate(
				"DELETE FROM 'brasserie' WHERE idBrasserie =" + brasserie.getId() + "; " +
				"UPDATE 'breuvage' set idBrasserie = null where idBrasserie =" + brasserie.getId() + "; ");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
   
	public void update(Brasserie obj) {

	}
	
	public Brasserie find(int id) {
		Brasserie brasserie = new Brasserie();      
      
		try {
			ResultSet result = this.connect.createStatement().executeQuery(
					"SELECT * FROM brasserie WHERE idBrasserie = " + id);
			brasserie = new Brasserie(
				result.getInt("idBrasserie"),
				result.getString("nom"),
				result.getString("ville"),
				result.getString("pays"));         
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return brasserie;
	}
}
