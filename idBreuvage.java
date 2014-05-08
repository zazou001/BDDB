public class idBreuvage{
	public int id;
	public Breuvage breuvage;
	
	public idBreuvage(Breuvage breuvage,int id)
	{
		this.breuvage=breuvage;
		this.id=id;
	}
	
	public void setBreuvage(Breuvage breuvage)
	{
		this.breuvage=breuvage;
	}
	
	public void setIdBreuvage(int id)
	{
		this.id=id;
	}
	
	public int getIdBreuvage()
	{
		return this.id;
	}
	
	public String toString()
	{
		return "Le breuvage " + this.breuvage.getNom() + " a pour id " + this.getIdBreuvage();
	}
}
