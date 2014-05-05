public class Biere {
	private int idBiere;
	private String nom;
	private int alcool;
	private int idBouteille;
	private int idBrasserie;
	private int idBrevage;
	
	/**
	 * createur de biere
	 * @param  int biere: est idBiere dans la base de donnée
	 * @param  String name: est le nom de la biere
	 * @param  int degree: est le atux d'alcool de la biere
	 * @param  int bouteille: est idBouteille dans la base de donnée
	 * @param  int brasserie: est idBrasserie dans la base de donnée
	 * @param  int brevage: est idBrevage dans la base de donnée
	 * 
	 * @return  un type Biere
	 * 
	**/

	public Biere(int biere, String name, int degree, int bouteille, int brasserie, int brevage)
	{
	idBiere=biere;
	nom=name;
	if(alcool<0) alcool=degree;
	else alcool=0;
	idBouteille=bouteille;
	idBrasserie=brasserie;
	idBrevage=brevage;
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
	 * modificateur de alcool
	 * @param  int alcool: est le nouveau taux d'alcool
	 * 
	**/
		public void setAlcool(int degree)
	{
		this.alcool = degree;
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
		return this.getNom() + "avec un degree d'alcool de " + this.getAlcool();
	}
	
}
