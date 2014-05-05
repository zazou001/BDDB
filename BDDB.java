public class BDDB{
	public static int main(String args[])
	{
		Brasserie brasserie1,brasserie2;
		brasserie1 = new Brasserie("Kronenbourg","Strasbourg","France");
		brasserie2 = new Brasserie("Heineken","Dusseldorf","Pays-Bas");
		System.out.println(brasserie1);
		System.out.println(brasserie2);
		
		Bouteille bouteille1,bouteille2;
		bouteille1 = new Bouteille(75,"Alcoolique","Capsule");
		bouteille2 = new Bouteille(100,"Test","Bouchon");
		System.out.println(bouteille1);
		System.out.println(bouteille2);
		
		return 0;
	}
}
		
