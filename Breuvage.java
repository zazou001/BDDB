public class Breuvage {
	private String fermentation;/*Type de fermentation*/
	private String particularite;/*Fermentation*/
  private String couleur;/*Couleur du breuvage*/
   
  public Breuvage(String type, String spec)
  {
		this.fermentation = type;
    this.particularite = spec;
  }
  
  public void setFermentation(String fermentation)
  {
		this.fermentation = fermentation;
	}
	
	public void setParticularite(String particularite)
	{
		this.particularite=particularite;
	}
	
	public void setCouleur(String couleur)
	{
		this.couleur = couleur;
	}
  
  public String getFermentation()
	{
		return this.fermentation;
	}
	   
  public String getParticularite()
	{
		return this.particularite;
	}
	
	public String getCouleur()
	{
		return this.couleur;
	}
	
	public String toString()
	{
		return "la fermentation est " + this.getFermentation() + ", a pour particularité " + this.getParticularite() + " et est " + this.getCouleur() + ".";
	}
}
