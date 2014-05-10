package pkg.dao;

public class BrasserieDAO extends DAO<Brasserie> {
  public BrasserieDAO(Connection conn) {
    super(conn);
  }

  public boolean create(Brasserie obj) {
    return false;
  }

  public boolean delete(Brasserie obj) {
    return false;
  }
   
  public boolean update(Brasserie obj) {
    return false;
  }
   
  public Brasserie find(int id) {
    Brasserie brasserie = new Brasserie();      
      
    try {
        ResultSet result = this.connect.createStatement().executeQuery("SELECT * FROM brasserie WHERE idBrasserie = " + id);
		brasserie = new Brasserie(id, result.getString("nom"),
        result.getString("ville"), result.getString("pays");         
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return brasserie;
  }
}
