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
	
	public String getNom()
	{
		return nom;
	}
	
	public String getVille()
	{
		return ville;
	}
	
	public String getPays()
	{
		return pays;
	}
	
	public String toString()
	{
		return "La brasserie " + this.getNom() + " se trouve a " + this.getVille() + ", ville de " + this.getPays() + ".";
	}
}
