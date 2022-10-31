package guuu;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RateListener implements ActionListener{
	JFrame histogramFrame1= new JFrame();
	public void actionPerformed(ActionEvent e) {
	JPanel p3=new JPanel();
	p3.setLayout(new GridLayout(5,1));


	
	histogramFrame1. setVisible(true);
	histogramFrame1.setSize(600, 200);
	
	p3.add(new JButton("1"));

	p3.add(new JButton("2"));

	p3.add(new JButton("3"));

	p3.add(new JButton("4"));

	p3.add(new JButton("5"));
	histogramFrame1.add(new JButton("ok"),BorderLayout.WEST);
	histogramFrame1.add(new JTextField("RATE"),BorderLayout.NORTH);
	histogramFrame1.add(p3,BorderLayout.CENTER);


}
}