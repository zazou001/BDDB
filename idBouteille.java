public class idBouteille{
	private Bouteille bottle;
	private int id;
	
	public idBouteille(Bouteille bottle,int id)
	{
		this.id=id;
		this.bottle=bottle;
	}
	
	public void setBouteille(Bouteille bottle)
	{
		this.bottle=bottle;
	}
	
	public void setIdBooteille(int id)
	{
		this.id=id;
	}
	
	public Bouteille getBouteille()
	{
		return this.bottle;
	}
	
	public int getIdBouteille()
	{
		return this.id;
	}
	
	public String toString()
	{
		return "La bouteille de taille" + this.bottle.getTaille() + " a pour format " + this.getBouteille().getFormat() + ", pour bouchon" + this.getBouteille().getBouchon() + " et a pour id " + this.getIdBouteille();
	}
	
}
