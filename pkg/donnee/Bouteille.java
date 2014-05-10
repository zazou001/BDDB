package pkg.donnee;

public class Bouteille { 
	private int idBouteille;
	private int taille;
	private String format;
	private String bouchon;

	/**
	 * createur de Bouteille
	 * @param int bouteille: est idBouteille dans la base de donnée
	 * @param int size: est la contenance en cL de la bouteille
	 * @param String type: est la forme de la bouteille
	 * @param String capsule: est le type de bouchon utilisé
	 * 
	 * @return un type Bouteille
	 * 
	**/	
	public Bouteille(int idBouteille, int taille, String format, String bouchon)
	{
		this.idBouteille=idBouteille;
		if(taille>0)
		{
			this.taille=taille;
		}
		else
		{
			this.taille=0;
		}
		this.format=format;
		this.bouchon=bouchon;
	}
		
	public Bouteille(){}
	/**
	 * modificateur de taille
	 * @param  int size: est la nouvelle taille de la bouteille
	**/
	public void setTaille(int size)
	{
		if(size>0)
		{
			this.taille=size;
		}
	}
	
	/**
	 * modificateur de format
	 * @param  int size: est le nouveau format de la bouteille
	**/
	public void setFormat(String format)
	{
		this.format=format;
	}

	/**
	 * modificateur de bouchon
	 * @param  String bouchon: est le nouveau bouchon taille de la bouteille
	**/
	public void setBouchon(String bouchon)
	{
		this.bouchon=bouchon;
	}
	
	/**
	 * accesseur de id
	 * @return la id de la bouteille
	**/
	public int getId()
	{
		return idBouteille;
	}
	
	/**
	 * accesseur de taille
	 * @return la taille de la bouteille
	**/
	public int getTaille()
	{
		return taille;
	}
	
	/**
	 * accesseur de format
	 * @return le format de la bouteille
	**/
	public String getFormat()
	{
		return format;
	}
	
	/**
	 * accesseur de bouchon
	 * @return le type de bouchon de la bouteille
	**/
	public String getBouchon()
	{
		return bouchon;
	}
	
	/**
	 * Redefinition de la methode toString
	 * @return une chaine de caractere à afficher
	 * 
	**/
	public String toString()
	{
		return "La bouteille fait " + this.getTaille() + " cl, a un format "
		+ this.getFormat() + " et un bouchon de type " + this.getBouchon() + ".";
	}
	
}
