package guuu;


import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Circle extends JPanel{
	private int radius=10;

public void jbtOk() {
	radius++;
	repaint();
}
public void cancel() {
	radius--;
	repaint();
}
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.drawOval(getWidth()/2-radius,getHeight()/2-radius,3*radius,2*radius);
}
}



