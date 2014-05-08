package donnee;

import java.util.List;

public class Biere {
    private String nom;
    private String brasserie;
    private String couleur;
    private int alcool;
    private int annee;
    private int note;

   public Biere(List<Breuvage> breuvage, List<Brasserie> brasserie, int row) {
        super();

        this.nom = breuvage.get(row).getNom();
        this.brasserie = brasserie.get(row).getNom();
        this.couleur = breuvage.get(row).getCouleur();
        this.alcool = breuvage.get(row).getAlcool();
        this.annee = breuvage.get(row).getAnnee();
        this.note= breuvage.get(row).getNote();;
    }
    
    public Biere(String nom, String brasserie, String couleur, int alcool,
				int annee, int note) {
        super();

        this.nom = nom;
        this.brasserie = brasserie;
        this.couleur = couleur;
        this.alcool = alcool;
        this.annee = annee;
        this.note= note;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getBrasserie() {
        return brasserie;
    }

    public void setPrenom(String brasserie) {
        this.brasserie = brasserie;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getAlcool() {
        return alcool;
    }

    public void setAlcool(int alcool) {
        this.alcool = alcool;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
    
    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
    
    	public String toString()
	{
		return this.getNom() + " est une biere "+ this.getCouleur() + 
		" avec un taux d'alcool de " + this.getAlcool() + ". fabriqué par " +
		 this.getBrasserie() + " en " + this.getAnnee();
	}
}
