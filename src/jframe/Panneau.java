package jframe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel {
    
	
	private int i = 0;
	public void paintComponent(Graphics g) {
	System.out.println("Execution numéro : " + (i++));
	
	int a=Math.min(this.getWidth()/2, this.getHeight()/2);
	
	g.setColor(Color.red);
	g.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
	g.drawLine(this.getWidth()/2, 0, this.getWidth()/2, this.getHeight());
	g.setColor(Color.green);
	g.fillPolygon(new int[]{0,this.getWidth()/4,this.getWidth()/2},new int []{this.getHeight()/2,0,this.getHeight()/2},3);
	g.setColor(Color.YELLOW);
	//g.fillOval(0,500, 500, 500);
	g.fillOval((((this.getWidth()/2)-a)/2), ((((this.getHeight()/2-a)/2)+(this.getHeight()/2))),a,a);
	g.setColor(Color.BLUE);
	g.fillRect(this.getWidth()/2, 0, this.getWidth()/2, this.getHeight()/2);
	Color c=g.getColor();
	g.setColor(c);
	
	Image img = null;
	try {
		img = ImageIO.read(new File("logo.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	g.drawImage(img,this.getWidth()/2,this.getHeight()/2,this.getWidth()/2,this.getHeight()/2, this);
	
	}
	
	
	
	
	
	
}
