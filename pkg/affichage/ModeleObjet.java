package pkg.affichage;

import pkg.donnee.*;
import pkg.dao.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.io.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ModeleObjet extends AbstractTableModel {
	
	private DAO<Biere> BieresDao;
	private DAO<Breuvage> BreuvageDao;
	private List<Biere> bieres = new ArrayList<Biere>();
	
    private final String[] entetes = {
		"Nom", "Alcool", "Couleur", "Année", "Brasserie", "Pays", 
		"Fermentation", "Bouteille", "Taille", "Bouchon", "Note"};
    
    public ModeleObjet(DAO<Biere> biereDao) {

	BieresDao = biereDao;
	bieres = biereDao.findAll();
	
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
				return bieres.get(rowIndex).getAlcool();
            case 2:
				return bieres.get(rowIndex).getCouleur();
            case 3:
				return bieres.get(rowIndex).getAnnee();
            case 4:
                return bieres.get(rowIndex).getNomBrasserie();
			case 5:
                return bieres.get(rowIndex).getPays();
            case 6:
                return bieres.get(rowIndex).getTypeFermentation();
            case 7:
                return bieres.get(rowIndex).getFormat();
            case 8:
                return bieres.get(rowIndex).getTaille();
            case 9:
                return bieres.get(rowIndex).getBouchon();
            case 10:
                return bieres.get(rowIndex).getNote();
            default:
                return null; //Ne devrait jamais arriver
        }
    }
    
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		if(aValue != null){
            switch(columnIndex){
                case 0:
                    bieres.get(rowIndex).setNom((String)aValue, BieresDao);
                    bieres = BieresDao.findAll();
                    break;
                case 1:
					bieres.get(rowIndex).setAlcool((float)aValue, BieresDao);
                   bieres = BieresDao.findAll();
                    break;
                case 2:
                    bieres.get(rowIndex).setCouleur((String)aValue, BieresDao);
                    bieres = BieresDao.findAll();
                    break;
                case 3:
                		System.out.println("salut");
                    bieres.get(rowIndex).setAnnee((int) aValue, BieresDao);
                    bieres = BieresDao.findAll();
                    break;
                case 4:
                    bieres.get(rowIndex).setNomBrasserie((String)aValue, BieresDao);
                    bieres = BieresDao.findAll();
                    break;
                case 5:
					bieres.get(rowIndex).setPays((String)aValue, BieresDao);
					bieres = BieresDao.findAll();
					break;
				case 6:
					bieres.get(rowIndex).setTypefermentation((String)aValue, BieresDao);
					bieres = BieresDao.findAll();
					break;
				case 7:
					bieres.get(rowIndex).setFormat((String)aValue, BieresDao);
					bieres = BieresDao.findAll();
				case 8:
					bieres.get(rowIndex).setTaille((int) aValue, BieresDao);
					bieres = BieresDao.findAll();
					break;
				case 9:
					bieres.get(rowIndex).setBouchon((String)aValue, BieresDao);
					bieres = BieresDao.findAll();
					break;
				case 10:
					bieres.get(rowIndex).setNote((int) aValue, BieresDao);
					bieres = BieresDao.findAll();
					break;
            }
        }
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true; //Toutes les cellules éditables
    }
 
    public void addBiere(Biere biere) {
        /*bieres.add(biere);
 
        fireTableRowsInserted(bieres.size() -1, bieres.size() -1);*/
    }
    
    public void modifBiere(int rowIndex) {
        /*bieres.get(rowIndex).setNote(bieres.get(rowIndex).getNote()+1);
		fireTableRowsUpdated(rowIndex, rowIndex);*/
    }
    
    public void removeBiere(int rowIndex) {
        BreuvageDao.delete(bieres.get(rowIndex).getidBreuvage());
        
		bieres = BieresDao.findAll();
        //fireTableRowsDeleted(rowIndex, rowIndex);
    }
}
