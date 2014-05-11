package pkg.affichage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

 
public class Add extends JFrame {
	
	private JPanel container = new JPanel();
	private JTextField jtf = new JTextField("Valeur par défaut");
	private JLabel label = new JLabel("Un JTextField");
	
	public Add(){
		this.setTitle("Ajouter");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		JPanel top = new JPanel();
		Font police = new Font("Arial", Font.BOLD, 14);
		jtf.setFont(police);
		jtf.setPreferredSize(new Dimension(150, 30));
		jtf.setForeground(Color.BLUE);
		top.add(label);
		top.add(jtf);
		container.add(top, BorderLayout.NORTH);
		this.setContentPane(container);
		this.setVisible(true);
	}
}
