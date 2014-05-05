public class Breuvage {
	String fermentation;
    String particularite;
        
    public Breuvage(String type, String spec)
    {
		fermentation=type;
        particularite=spec;
    }
        
    public String getFermentation()
	{
		return fermentation;
	}
	   
	    public String getParticularite)
	{
		return particularite;
	}
	
	public String toString()
	{
		return "la fermentation est " + this.getFermentation() + ", a pour particularité" + this.getParticularite();
	}
}
