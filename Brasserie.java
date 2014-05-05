public class Brasserie {
	private String nom;
	private String ville;
	private String pays;
	
	public Brasserie(String name,String city,String state)
	{
		this.nom=name;
		this.ville=city;
		this.pays=state;
	}
	
	public void setNom(String nom)
	{
		this.nom=nom;
	}
	
	public void setVille(String ville)
	{
		this.ville=ville;
	}
	
	public void setPays(String pays)
	{
		this.pays=pays;
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
