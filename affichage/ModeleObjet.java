package affichage;

import donnee.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.io.*;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ModeleObjet extends AbstractTableModel {
	
	private List<Bouteille> bouteilles = new ArrayList<Bouteille>();
	private List<Brasserie> brasseries = new ArrayList<Brasserie>();
	private List<Breuvage> breuvages = new ArrayList<Breuvage>();
	private List<Biere> bieres = new ArrayList<Biere>();
	
    private final String[] entetes = {"Nom", "Brasserie", "Couleur", "Alcool", "Année", "Note"};
    
    public ModeleObjet() {
        super();
        bieres.add(new Biere(breuvages,brasseries,bieres.size()));
    }
 
    public int getRowCount() {
        return bieres.size();
    }
 
    public int getColumnCount() {
        return entetes.length;
    }
 
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }
 
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return bieres.get(rowIndex).getNom();
            case 1:
                return bieres.get(rowIndex).getBrasserie();
            case 2:
                return bieres.get(rowIndex).getCouleur();
            case 3:
                return bieres.get(rowIndex).getAlcool();
            case 4:
                return bieres.get(rowIndex).getAnnee();
            case 5:
                return bieres.get(rowIndex).getNote();
            default:
                return null; //Ne devrait jamais arriver
        }
    }
 
    public void addBiere(Biere biere) {
        bieres.add(biere);
 
        fireTableRowsInserted(bieres.size() -1, bieres.size() -1);
    }
    
    public void modifBiere(int rowIndex) {
        bieres.get(rowIndex).setNote(bieres.get(rowIndex).getNote()+1);
		fireTableRowsUpdated(rowIndex, rowIndex);
    }
    
    public void removeBiere(int rowIndex) {
        bieres.remove(rowIndex);
 
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    	public void listBouteille(String file)
    {
		try{
		BufferedReader buff = new BufferedReader(new FileReader(file));
 
			try {
				String line;
				while ((line = buff.readLine()) != null) {
 					Scanner scanner=new Scanner(file);
 					// L'expression régulière qui délimite les champs
					scanner.useDelimiter(Pattern.compile(":"));
					// On boucle sur chaque champ detecté
					int bouteille = 0 ;
					int taille = 0;
					String type = "";
					String bouchon = "";
					while (scanner.hasNext()) {
					bouteille = scanner.nextInt();
					taille = scanner.nextInt();
					type = scanner.next();
					bouchon = scanner.next();
					}
					bouteilles.add(new Bouteille(bouteille, taille, type, bouchon));
					
				}
			} 
			finally {
			buff.close();
			}
			} 
		catch (IOException ioe) {
			System.out.println("Erreur --" + ioe.toString());
		}	
	}
	
	public void listBrasserie(String file)
    {
		try{
		BufferedReader buff = new BufferedReader(new FileReader(file));
 
			try {
				String line;
				while ((line = buff.readLine()) != null) {
 					Scanner scanner=new Scanner(file);
 					// L'expression régulière qui délimite les champs
					scanner.useDelimiter(Pattern.compile(":"));
					// On boucle sur chaque champ detecté
					int idBrasserie = 0;
					String nom = "";
					String ville = "";
					String pays = "";
					while (scanner.hasNext()) {
						idBrasserie = scanner.nextInt();
						nom = scanner.next();
						ville = scanner.next();;
						pays = scanner.next();;
					}
					brasseries.add(new Brasserie(idBrasserie, nom, ville, pays));
				}
			} 
			finally {
			buff.close();
			}
			} 
		catch (IOException ioe) {
			System.out.println("Erreur --" + ioe.toString());
		}	
	}
	
	public void listBreuvage(String file)
    {
		try{
		BufferedReader buff = new BufferedReader(new FileReader(file));
 
			try {
				String line;
				while ((line = buff.readLine()) != null) {
 					Scanner scanner=new Scanner(file);
					scanner.useDelimiter(Pattern.compile(":")); // On boucle sur chaque champ detecté
					int idBrevage = 0;
					String typefermentation =  "";
					String particularite =  "";
					String couleur =  "";
					String nom =  "";
					int annee = 0;
					int note = 0;
					int alcool = 0;
					int idBouteille = 0;
					int idBrasserie = 0;  
					while (scanner.hasNext()) {
						idBrevage = scanner.nextInt();
						typefermentation = scanner.next();
						particularite = scanner.next();
						couleur = scanner.next();
						nom = scanner.next();
						annee = scanner.nextInt();
						note = scanner.nextInt();
						alcool = scanner.nextInt();
						idBouteille = scanner.nextInt();
						idBrasserie = scanner.nextInt();
					}
					breuvages.add(new Breuvage(idBrevage, nom, alcool, typefermentation, particularite,
									couleur, annee, note, idBouteille, idBrasserie));
				}
			} 
			finally {
			buff.close();
			}
			} 
		catch (IOException ioe) {
			System.out.println("Erreur --" + ioe.toString());
		}	
	}
	
}
