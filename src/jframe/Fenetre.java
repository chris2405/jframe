package jframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Fenetre extends JFrame {
	private JButton bouton = new JButton("Mon bouton");
	private JPanel pan = new JPanel();
	 private JCheckBox check=new JCheckBox("1");
	 private JCheckBox check1=new JCheckBox("2");
	 private JCheckBox check2=new JCheckBox("3");
	 private ButtonGroup gr=new ButtonGroup();
	 private JRadioButton rad=new JRadioButton("OUI");
	 private JRadioButton rad2=new JRadioButton("NON");
	 private JLabel lab = new JLabel("Mon Etiquette");
	 private JTextField text = new JTextField("                           "); 
	  private JComboBox combo = new JComboBox();
	  private JLabel lab2 = new JLabel("Choix");
	  
	
	public Fenetre(){
		
		this.setTitle("Ma premiere fenetre");
		this.setSize(1000,1000);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setVisible(false);
		//setBackground(Color.black);
		//this.getContentPane().setVisible(false);
		//this.getContentPane().setBackground(Color.BLUE);
		
		
		this.setContentPane(new Panneau());
		
		 this.setVisible(true);
		 
		 
		 
	    //pan.setBackground(Color.lightGray);        
	   /* this.setContentPane(pan);  
	    
	   
	    
	    
	    bouton.setText("Mon premier bouton");
	    
	    pan.add(bouton);
	    pan.add(check);
	    pan.add(check1);
	    pan.add(check2);
	    
	    rad.setSelected(true);
	    
	    
	    gr.add(rad);
	    gr.add(rad2);
	    pan.add(rad);
	    pan.add(rad2);
	    pan.add(lab);
	    lab.setBackground(Color.WHITE);
	    lab.setOpaque(true);
	    pan.add(text);
	    pan.add(lab2);
	    pan.add(combo);
	    
	    combo.setPreferredSize(new Dimension(700, 120));
	    
	    combo.addItem("Rouge");
	    combo.addItem("vert");
	    combo.addItem("jaune");
	    combo.addItem("marron");
	    
       JPanel b1 = new JPanel();
	    
	    b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));

	    b1.add(bouton);
	    
	   JPanel b2 = new JPanel();
	   
	   b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));

	    b2.add(check);

	    b2.add(check1);
	   
	    b2.add(check2);
	    
	    JPanel b3 = new JPanel();

	    b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));

	    b3.add(rad);
	    b3.add(rad2);
	    
	    JPanel b4 = new JPanel();
	    b4.setLayout(new BoxLayout(b4, BoxLayout.LINE_AXIS));
	    b4.add(lab);
	    b4.add(text);
	    
	    JPanel b5 = new JPanel();
	    b5.setLayout(new BoxLayout(b5, BoxLayout.LINE_AXIS));
	    b5.add(combo);
	    b5.add(lab2);
	    
	    JPanel b6 = new JPanel();

	    b6.setLayout(new BoxLayout(b6, BoxLayout.PAGE_AXIS));

	    b6.add(b1);
	    b6.add(b2);
	    b6.add(b3);
	    b6.add(b4);
	    b6.add(b5);

	    this.getContentPane().add(b6,BorderLayout.NORTH);
	    
	    

	    this.setVisible(true);
	    
	    
	    //*******************************************BorderLayout*************************
	    
	    /*
	    
	     this.setLayout(new BorderLayout());

	    this.getContentPane().add(new JButton("NORTH"), BorderLayout.NORTH);
	    this.getContentPane().add(bouton, BorderLayout.CENTER);
	    
	    this.getContentPane().add(combo, BorderLayout.SOUTH);
	    this.getContentPane().add(rad, BorderLayout.WEST);
	    this.getContentPane().add(rad2, BorderLayout.EAST);
	    
	    
	    this.setVisible(true);     
	    */
	   // *****************************************GridLayout*****************************
	    /*
	    GridLayout grille =new GridLayout(0,1);
	    this.setLayout(grille);
	    JPanel b7 = new JPanel();
	    b7.add(new JButton("1"));
	    b7.add(new JButton("2"));
	    b7.add(new JButton("3"));
	    
	    GridLayout grille2 =new GridLayout(1,3);
	    this.setLayout(grille2);
	    JPanel b8 = new JPanel();
	    b8.add(new JButton("4"));
	    b8.add(new JButton("5"));
	    b8.add(new JButton("6"));
	    b8.add(new JButton("7"));
	    b8.add(new JButton("8"));
	    
	    GridLayout grille3 =new GridLayout(1,3);
	    this.setLayout(grille3);
	    JPanel b9 = new JPanel();
	    b9.add(b7);
	    b9.add(b8);
	    
	    this.getContentPane().add(b9,BorderLayout.NORTH);
	    this.setVisible(true);
	    /*
	    
	    
		//**********************************************BoxLayout********************
	    /*
	    JPanel b1 = new JPanel();
	    
	    b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));

	    b1.add(new JButton("Bouton 1"));

	    JPanel b2 = new JPanel();

	    b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));

	    b2.add(new JButton("Bouton 2"));

	    b2.add(new JButton("Bouton 3"));


	    JPanel b3 = new JPanel();

	    b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));

	    b3.add(new JButton("Bouton 4"));

	    b3.add(new JButton("Bouton 5"));

	    b3.add(new JButton("Bouton 6"));


	    JPanel b4 = new JPanel();

	    b4.setLayout(new BoxLayout(b4, BoxLayout.PAGE_AXIS));

	    b4.add(b1);

	    b4.add(b2);

	    b4.add(b3);

	    this.getContentPane().add(b4);

	    this.setVisible(true);
	    
	    */
	}

	

	
}
