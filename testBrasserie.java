public class testBrasserie{
	public static void main(String args[])
	{
		Brasserie b1,b2;
		b1 = new Brasserie("Kronenbourg","Strasbourg","France");
		b2 = new Brasserie("Heineken","Dusseldorf","Pays-Bas");
		System.out.println(b1);
		System.out.println(b2);
		b2.setNom("Schiltigheim");
		System.out.println(b2);
		b1.setVille("Paris");
		System.out.println(b1);
		b1.setPays("Allemagne");
		System.out.println(b1);
	}
}
		
