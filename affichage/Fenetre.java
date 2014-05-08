package affichage;

import donnee.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

public class Fenetre extends JFrame {
	private ModeleObjet modele = new ModeleObjet();
    private JTable tableau;
  
	public Fenetre()
	{
        super();
 
        setTitle("BDDB");
        setLocationRelativeTo(null);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        tableau = new JTable(modele);
 
        getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
 
        JPanel boutons = new JPanel();
		boutons.add(new JButton(new InfoAction()));
        boutons.add(new JButton(new AddAction()));
        boutons.add(new JButton(new ModifAction()));
        boutons.add(new JButton(new RemoveAction()));
         
        getContentPane().add(boutons, BorderLayout.SOUTH);
 
    }
    
    private class InfoAction extends AbstractAction {
        private InfoAction() {
            super("Info");/* nom sur le bouton*/
        }
		/*a faire quand on appuis sur le bouton info*/
        public void actionPerformed(ActionEvent e) { 
           // modele.addBiere(new Biere("Megan", "Sami", "green", 5, 1812, 20));
        }
    }
    
     private class AddAction extends AbstractAction {
        private AddAction() {
            super("Ajouter");/* nom sur le bouton*/
        }
		/*a faire quand on appuis sur le bouton ajouté*/
        public void actionPerformed(ActionEvent e) { 
            //modele.addBiere(new Biere("Megan", "Sami", "green", 5, 1812, 20));
        }
    }
    
    private class ModifAction extends AbstractAction {
        private ModifAction() {
            super("Modifier");/* nom sur le bouton*/
        }
		/*a faire quand on appuis sur le bouton modifier*/
        public void actionPerformed(ActionEvent e) { 
			int[] selection = tableau.getSelectedRows(); /*selection de la ligne du tableau*/
            
            for(int i = selection.length - 1; i >= 0; i--){
                modele.modifBiere(selection[i]);
            }
        }
    }

    private class RemoveAction extends AbstractAction {
        private RemoveAction() {
            super("Supprimer");/* nom sur le bouton*/
        }
		/*a faire quand on appuis sur le bouton supprimée*/
        public void actionPerformed(ActionEvent e) {
            int[] selection = tableau.getSelectedRows(); /*selection de la ligne du tableau*/
            
            for(int i = selection.length - 1; i >= 0; i--){
                modele.removeBiere(selection[i]);
            }
        }
    }
	
}
