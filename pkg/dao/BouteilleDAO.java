package pkg.dao;

public class BouteilleDAO extends DAO<Bouteille> {
  public BouteilleDAO(Connection conn) {
    super(conn);
  }

  public boolean create(Bouteille obj) {
    return false;
  }

  public boolean delete(Bouteille obj) {
    return false;
  }
   
  public boolean update(Bouteille obj) {
    return false;
  }
   
  public Bouteille find(int id) {
    Bouteille bouteille = new Bouteille();      
      
    try {
		ResultSet result = this.connect.createStatement().executeQuery("SELECT * FROM bouteille WHERE idBouteille = " + id);
        bouteille = new Bouteille(id, result.getString("taille"),
        result.getString("format"), result.getString("bouchon");         
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return bouteille;
  }
}
