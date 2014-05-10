package pkg.donnee;

public class Breuvage {
	private int idBrevage;
	private String nom;
	private float alcool;
	private String typefermentation;/*Type de fermentation*/
	private String particularite;/*Fermentation*/
	private String couleur;/*Couleur du breuvage*/
	private int annee;
	private int note;
	private String commentaire;
	private int idBouteille;
	private int idBrasserie;   
   /**
    * Constructeur de breuvage.
    * @param type Le type de fermentation : basse/haute/sur bouteille/sur lie...
    * @param spec La fermentation : simple/double/triple...
    * @param couleur La couleur du breuvage.
    * @param  String name: est le nom de la biere
	* @param  float degree: est le taux d'alcool de la biere
	* @param  int bouteille: est idBouteille dans la base de donnée
	* @param  int brasserie: est idBrasserie dans la base de donnée
	* @param  int brevage: est idBrevage dans la base de donnée
    * */
  public Breuvage( int idBrevage, String nom, float degree, String typefermentation,
					String particularite, String couleur, int annee, int note, 
					String commentaire, int idBouteille, int idBrasserie)
  {
	this.idBrevage=idBrevage;
	this.nom=nom;
	this.alcool=degree;
	this.typefermentation = typefermentation;
    this.particularite = particularite;
    this.couleur = couleur;
    this.annee=annee;
	this.note=note;
	this.commentaire=commentaire;
	this.idBouteille=idBouteille;
	this.idBrasserie=idBrasserie;
  }
  
  public Breuvage(){}
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
		public void setAlcool(float degree)
	{
		this.alcool = degree;
	}
	
	  	/**
	 * modificateur de la note
	 * @param  int note: est la nouvelle note de la biere
	 * 
	**/
		public void setNote(int note)
	{
		this.note = note;
	}
	
	/**
	 * modificateur de l'année
	 * @param  int annee: est la nouvelle année de la biere
	 * 
	**/
		public void setAnnee(int annee)
	{
		this.annee = annee;
	}
	
  /**
   * Accesseur champ fermentation.
   * @return Le champ fermentation du breuvage.
   * */
  public String getTypeFermentation()
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
	public float getAlcool()
	{
		return alcool;
	}
	
	 /**
	 * accesseur de note
	 * @return la note de la biere
	 * 
	**/
	public int getNote()
	{
		return note;
	}
	
	/**
	 * accesseur de l'année
	 * @return l'année de la biere
	 * 
	**/
	public int getAnnee()
	{
		return annee;
	}
	
	/**
	 * accesseur de l'id
	 * @return l'id de la biere
	 * 
	**/
	public int getId()
	{
		return idBrevage;
	}
	
		/**
	 * accesseur du commentaire
	 * @return le commentaire sur la biere
	 * 
	**/
	public String getCommentaire()
	{
		return commentaire;
	}
		/**
	 * accesseur de l'idBouteille
	 * @return l'idBouteille de la biere
	 * 
	**/
	public int getIdBouteille()
	{
		return idBouteille;
	}
		/**
	 * accesseur de l'idBrasserie
	 * @return l'idBrasserie de la biere
	 * 
	**/
	public int getIdBrasserie()
	{
		return idBrasserie;
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
		 this.getTypeFermentation() + ", a pour particularité " + this.getParticularite();
	}
	
}
