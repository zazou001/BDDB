package pkg.affichage;

import pkg.donnee.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.io.*;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ModeleObjet extends AbstractTableModel {
	

	private List<Biere> bieres = new ArrayList<Biere>();
	
    private final String[] entetes = {"Nom", "Brasserie", "Couleur", "Alcool", "Année", "Note"};
    
    public ModeleObjet() {
        super();
        //bieres.add(new Biere(breuvages,brasseries,bieres.size()));
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
}
