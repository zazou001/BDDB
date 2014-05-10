package pkg.donnee;

public class Biere {
    private String nom;
    private String brasserie;
    private String couleur;
    private float alcool;
    private int annee;
    private int note;
    
    public Biere(String nom, String brasserie, String couleur, float alcool,
				int annee, int note) {
        super();

        this.nom = nom;
        this.brasserie = brasserie;
        this.couleur = couleur;
        this.alcool = alcool;
        this.annee = annee;
        this.note= note;
    }

	public Biere(){}

    public String getNom() {
        return nom;
    }

    public String getBrasserie() {
        return brasserie;
    }

    public String getCouleur() {
        return couleur;
    }

    public float getAlcool() {
        return alcool;
    }


    public int getAnnee() {
        return annee;
    }
    
    public int getNote() {
        return note;
    }
    	public String toString()
	{
		return this.getNom() + " est une biere "+ this.getCouleur() + 
		" avec un taux d'alcool de " + this.getAlcool() + ". fabriqué par " +
		 this.getBrasserie() + " en " + this.getAnnee();
	}
}
