package pkg.donnee;

public class Brasserie {
	private int idBrasserie;
	private String nom;
	private String ville;
	private String pays;
	
	/**
	 * Constructeur de brasserie.
	 * @param name Le nom de la brasserie.
	 * @param city La ville ou se situe la brasserie.
	 * @param state L'Etat dans lequel se trouve la brasserie.
	 * @return Un objet de type brasserie.
	 * */
	public Brasserie(int idBrasserie, String nom, String ville, String pays)
	{
		this.idBrasserie=idBrasserie;
		this.nom=nom;
		this.ville=ville;
		this.pays=pays;
	}
	
	public Brasserie(){}
	/**
	 * Modifie le nom de la brasserie.
	 * @param nom Le nouveau nom de la brasserie.
	 * */
	public void setNom(String nom)
	{
		this.nom=nom;
	}
	
	/**
	 * Modifie la ville ou se trouve la brasserie.
	 * @param ville Le nouveau nom de la ville.
	 * */
	public void setVille(String ville)
	{
		this.ville=ville;
	}
	
	/**
	 * Modifie le pays dans lequel se trouve la brasserie.
	 * @param pays Le nouveau nom du pays.
	 * */
	public void setPays(String pays)
	{
		this.pays=pays;
	}
	
	/**
	 * Accesseur du nom du pays ou se trouve la brasserie.
	 * @return Le nom du pays ou se trouve la brasserie.
	 * */
	public int getId()
	{
		return idBrasserie;
	}
	
	/**
	 * Accesseur du nom de la brasserie.
	 * @return Le nom de la brasserie.
	 * */
	public String getNom()
	{
		return nom;
	}
	
	/**
	 * Accesseur de la ville ou se trouve la brasserie.
	 * @return La ville ou se trouve de la brasserie.
	 * */	
	public String getVille()
	{
		return ville;
	}

	/**
	 * Accesseur du nom du pays ou se trouve la brasserie.
	 * @return Le nom du pays ou se trouve la brasserie.
	 * */
	public String getPays()
	{
		return pays;
	}

	/**
	 * Redéfinition de la methode toString.
	 * @return La nouvelle chaine de caracteres a afficher.
	 * */
	public String toString()
	{
		return "La brasserie " + this.getNom() + " se trouve a " + this.getVille() + ", ville de " + this.getPays() + ".";
	}
}
