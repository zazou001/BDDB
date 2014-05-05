public class Bouteille { 
	private int taille;
	private String format;
	private String bouchon;
	
	public Bouteille(int size, String type, String capsule)
	{
		if(size>0)
		{
			this.taille=size;
		}
		else
		{
			this.taille=0;
		}
		this.format=type;
		this.bouchon=capsule;
	}
	
	public void setTaille(int size)
	{
		if(size>0)
		{
			this.taille=size;
		}
	}
	
	public void setFormat(String format)
	{
		this.format=format;
	}
	
	public setBouchon(String bouchon)
	{
		this.bouchon=bouchon;
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
