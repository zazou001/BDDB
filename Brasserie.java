public class Brasserie {
	private String nom;
	private String ville;
	private String pays;
	
	public Brasserie(String name,String city,String state)
	{
		nom=name;
		ville=city;
		pays=state;
	}
	
	public toString getNom()
	{
		return nom;
	}
	
	public toString getVille()
	{
		return ville;
	}
	
	public toString getPays()
	{
		return pays;
	}
}
