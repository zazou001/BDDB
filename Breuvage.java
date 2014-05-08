public class Breuvage {
	private int idBrevage;
	private String typefermentation;/*Type de fermentation*/
	private String particularite;/*Fermentation*/
	private String couleur;/*Couleur du breuvage*/
	private String nom;
	private int alcool;
	private int idBouteille;
	private int idBrasserie;
	
   /**
    * Constructeur de breuvage.
    * @param type Le type de fermentation : basse/haute/sur bouteille/sur lie...
    * @param spec La fermentation : simple/double/triple...
    * @param couleur La couleur du breuvage.
    * @param  String name: est le nom de la biere
		* @param  int degree: est le taux d'alcool de la biere
		* @param  int bouteille: est idBouteille dans la base de donnée
		* @param  int brasserie: est idBrasserie dans la base de donnée
		* @param  int brevage: est idBrevage dans la base de donnée
    * */
  public Breuvage( int brevage, String name, int degree, String type, String spec
					,String couleur, int bouteille, int brasserie)
  {
	this.typefermentation = type;
    this.particularite = spec;
    this.couleur = couleur;
    this.idBrevage=brevage;
	this.nom=name;
		if(alcool<0) this.alcool=degree;
		else this.alcool=0;
	this.idBouteille=bouteille;
	this.idBrasserie=brasserie;

  }
  
  	/**
	 * modificateur de nom
	 * @param  String name: est le nouveau nom de la biere
	 * 
	**/
	public void setNom(String name)
	{
		this.nom = name;
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
	 * modificateur de alcool
	 * @param  int alcool: est le nouveau taux d'alcool
	 * 
	**/
		public void setAlcool(int degree)
	{
		this.alcool = degree;
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
	 * accesseur de nom
	 * @return le nom de la biere
	 * 
	**/
	public String getNom()
	{
		return nom;
	}

	/**
	 * accesseur de alcool
	 * @return le taux d'alcool
	 * 
	**/
	public int getAlcool()
	{
		return alcool;
	}
	
	/**
	 * Redefinition de la methode toString
	 * @return une chaine de caractere à afficher
	 * 
	**/	
	public String toString()
	{
		return this.getNom() + "est une biere "+ this.getCouleur() + 
		"avec un taux d'alcool de " + this.getAlcool() + ". Sa fermentation est " +
		 this.gettypeFermentation() + ", a pour particularité " + this.getParticularite();
	}
	
	/**
	 * Redéfinition de la methode toString.
	 * @return La nouvelle chaine de caracteres a afficher.
	 * */
	/*public String toString()
	{
		return "la fermentation est " + this.gettypeFermentation() + ", a pour particularité " + this.getParticularite() + " et est " + this.getCouleur() + ".";
	}*/
}
