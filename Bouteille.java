public class Bouteille extends Breuvage {
	int taille;
	String format;
	String bouchon;
	
	public Bouteille(int size, String type, String capsule)
	{
		taille=size;
		format=type;
		Bouchon=capsule;
	}
	
	public String getTaille()
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
}
