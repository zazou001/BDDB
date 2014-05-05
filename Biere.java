public class Biere {
	private int idBiere;
	private String nom;
	private int alcool;
	private int idBouteille;
	private int idBrasserie;
	private int idBrevage;

	public Biere(int biere, String name, int degree,int bouteille, int brasserie, int brevage)
	{
	idBiere=biere;
	nom=name;
	alcool=degree;
	idBouteille=bouteille;
	idBrasserie=brasserie;
	idBrevage=brevage;
	}

	public String getNom()
	{
		return nom;
	}

	public int getAlcool()
	{
		return alcool;
	}
	
	public String toString()
	{
		return this.getNom() + "avec un degree d'alcool de " + this.getAlcool();
	}
}
