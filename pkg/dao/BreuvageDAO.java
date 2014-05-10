package pkg.dao;

import pkg.donnee.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BreuvageDAO extends DAO<Breuvage> {
	
  public BreuvageDAO(Connection conn) {
    super(conn);
  }

  public boolean create(Breuvage obj) {
    return false;
  }

  public boolean delete(Breuvage obj) {
    return false;
  }
   
  public boolean update(Breuvage obj) {
    return false;
  }
   
  public Breuvage find(int id) {
    Breuvage breuvage = new Breuvage();      
      
    try {
      ResultSet result = this.connect.createStatement().executeQuery("SELECT * FROM breuvage WHERE idBreuvage = " + id);
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
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return breuvage;
  }
}
