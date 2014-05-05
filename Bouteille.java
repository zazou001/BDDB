public class Bouteille { 
	private int taille;
	private String format;
	private String bouchon;
	
	public Bouteille(int size, String type, String capsule)
	{
		this.taille=size;
		this.format=type;
		this.bouchon=capsule;
	}
	
	public int getTaille()
	{
		return taille;
	}
	
	public String getFormat()
	{
		return format;
	}
	
	public String getBouchon()
	{
		return bouchon;
	}
	
	public String toString()
	{
		return "La bouteille fait " + this.getTaille() + " cl, a un format "
		+ this.getFormat() + " et un bouchon de type " + this.getBouchon() + ".";
	}

}
