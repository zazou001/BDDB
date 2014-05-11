package pkg.donnee;

import pkg.dao.*;

public class Biere {
	
	private int idBreuvage;
	private String nom;
	private float alcool;
	private String typefermentation;
	private String particularite;
	private String couleur;
	private int annee;
	private int note;
	private String commentaire;
	private int idBouteille;
	private int idBrasserie;
	private String nomBrasserie;
	private String ville;
	private String pays;
	private int taille;
	private String format;
	private String bouchon;
    
    public Biere(int idBreuvage, String nom, float alcool,
				String typefermentation, String particularite, 
				String couleur, int annee, int note, String commentaire,
				int idBouteille, int idBrasserie, String nomBrasserie,
				String ville, String pays, int taille, String format, String bouchon) {

			this.idBreuvage = idBreuvage;
			this.nom = nom;
			this.alcool = alcool;
			this.typefermentation = typefermentation;
			this.particularite = particularite;
			this.couleur = couleur;
			this.annee = annee;
			this.note = note;
			this.commentaire = commentaire;
			this.idBouteille = idBouteille;
			this.idBrasserie = idBrasserie;
			this.nomBrasserie = nomBrasserie;
			this.ville = ville;
			this.pays = pays;
			this.taille = taille;
			this.format = format;
			this.bouchon = bouchon;
    }

	public Biere(){}

    public int getidBreuvage() {
        return idBreuvage;
    }
    
	public String getNom() {
        return nom;
    }
    
	public float getAlcool() {
        return alcool;
    }
    
	public String getTypeFermentation() {
        return typefermentation;
    }
    
	public String getParticularite() {
        return particularite;
    }

	public String getCouleur() {
        return  couleur;
    }
    
	public int getAnnee() {
        return annee;
    }
    
	public int getNote() {
        return note;
    }
    
	public String getCommentaire() {
        return commentaire;
    }
    
	public int getidBouteille() {
        return idBouteille;
    }
    
	public int getidBrasserie() {
        return idBrasserie;
    }
    
	public String getNomBrasserie() {
        return nomBrasserie;
    }
    
	public String getVille() {
        return ville;
    }
    
	public String getPays() {
        return pays;
    }
    
	public int getTaille() {
        return taille;
    }
    
	public String getFormat() {
        return format;
    }
    
	public String getBouchon() {
        return bouchon;
    }
    
	public void setidBreuvage(int idBreuvage) {}
    
	public void setNom(String value, DAO<Biere> BieresDao) {
		BieresDao.update("breuvage", "nom", (String)value, this.getidBreuvage());
	}
	
	public void setAlcool(float value, DAO<Biere> BieresDao) {
		BieresDao.update("breuvage", "alcool", (float)value, this.getidBreuvage());
    }
    
	public void setTypefermentation(String value, DAO<Biere> BieresDao) {
		BieresDao.update("breuvage", "typefermentation", (String)value, this.getidBreuvage());
    }
    
	public void setParticularite(String value, DAO<Biere> BieresDao) {
        BieresDao.update("breuvage", "particularite", (String)value, this.getidBreuvage());
    }
	
	public void setCouleur(String value, DAO<Biere> BieresDao) {
        BieresDao.update("breuvage", "couleur", (String)value, this.getidBreuvage());
    }
    
	public void setAnnee(int value, DAO<Biere> BieresDao) {
        BieresDao.update("breuvage", "annee", (int)value, this.getidBreuvage());
    }
    
	public void setNote(int value, DAO<Biere> BieresDao) {
        BieresDao.update("breuvage", "note", (int)value, this.getidBreuvage());
    }
    
	public void setCommentaire(String value, DAO<Biere> BieresDao) {
        BieresDao.update("breuvage", "commentaire", (String)value, this.getidBreuvage());
    }
    
	public void setidBouteille(int value, DAO<Biere> BieresDao) {
        BieresDao.update("breuvage", "idBouteille", (int)value, this.getidBreuvage());
    }
    
	public void setidBrasserie(int value, DAO<Biere> BieresDao) {
        BieresDao.update("breuvage", "idBrasserie", (int)value, this.getidBreuvage());
    }
    
	public void setNomBrasserie(String value, DAO<Biere> BieresDao) {
        BieresDao.update("brasserie", "nomBrasserie", (String)value, this.getidBrasserie());
    }
    
	public void setVille(String value, DAO<Biere> BieresDao) {
        BieresDao.update("brasserie", "ville", (String)value, this.getidBrasserie());
    }
    
	public void setPays(String value, DAO<Biere> BieresDao) {
        BieresDao.update("brasserie", "pays", (String)value, this.getidBrasserie());
    }
	
	public void setTaille(int value, DAO<Biere> BieresDao) {
        BieresDao.update("bouteille", "taille", (int)value, this.getidBouteille());
    }
    
	public void setFormat(String value, DAO<Biere> BieresDao) {
        BieresDao.update("bouteille", "format", (String)value, this.getidBouteille());
    }
    
	public void setBouchon(String value, DAO<Biere> BieresDao) {
        BieresDao.update("bouteille", "bouchon", (String)value, this.getidBouteille());
    }
    
    public String toString() {
		return this.getNom() + " est une biere "+ this.getCouleur() + 
		" avec un taux d'alcool de " + this.getAlcool() + ". fabriqué par " +
		 this.getNomBrasserie() + " en " + this.getAnnee();
	}
}
