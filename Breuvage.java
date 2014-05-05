public class Breuvage {
	private String typefermentation;/*Type de fermentation*/
	private String particularite;/*Fermentation*/
  private String couleur;/*Couleur du breuvage*/
   
   /**
    * Constructeur de breuvage.
    * @param type Le type de fermentation : basse/haute/sur bouteille/sur lie...
    * @param spec La fermentation : simple/doublie/triple...
    * @param couleur La couleur du breuvage.
    * */
  public Breuvage(String type, String spec,String couleur)
  {
		this.typefermentation = type;
    this.particularite = spec;
    this.couleur = couleur;
  }
  
	/**
		* Modifie le type de fermentation : basse/haute/sur bouteille/sur lie...
		* @param fermentation Le nouveau nom du champ fermentation.
		* */  
  public void setTypeFermentation(String fermentation)
  {
		this.typefermentation = fermentation;
	}
	
	/**
	 * Modifie le champ fermentation :simple/double/triple...
	 * @param particularite La nouvelle fermentation.
	 * */
	public void setParticularite(String particularite)
	{
		this.particularite=particularite;
	}
	
	/**
	 * Modifie le champ couleur du breuvage.
	 * @param couleur La nouvelle couleur.
	 * */
	public void setCouleur(String couleur)
	{
		this.couleur = couleur;
	}
  
  /**
   * Accesseur champ fermentation.
   * @return Le champ fermentation du breuvage.
   * */
  public String gettypeFermentation()
	{
		return this.typefermentation;
	}
	
	/**
	 * Accesseur du champ fermentation : simple/double...
	 * @return La fermentation.
	 * */
  public String getParticularite()
	{
		return this.particularite;
	}
	/**
	 * Accesseur couleur du breuvage.
	 * @return La couleur du breuvage.
	 * */
	public String getCouleur()
	{
		return this.couleur;
	}
	
	/**
	 * Redéfinition de la methode toString.
	 * @return La nouvelle chaine de caracteres a afficher.
	 * */
	public String toString()
	{
		return "la fermentation est " + this.gettypeFermentation() + ", a pour particularité " + this.getParticularite() + " et est " + this.getCouleur() + ".";
	}
}
