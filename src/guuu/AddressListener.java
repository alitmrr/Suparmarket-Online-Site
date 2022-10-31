package guuu;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddressListener implements ActionListener {
	JFrame histogramFrame1= new JFrame();



	public void actionPerformed(ActionEvent e) {
		
			histogramFrame1. setVisible(true);
			histogramFrame1.setSize(800, 400);


			histogramFrame1.add(new JTextField("Address"),BorderLayout.NORTH);
			
			histogramFrame1.add(new JTextField("Kadýköy / Ýstanbul "),BorderLayout.CENTER);
			histogramFrame1.add(new JTextField("Phone : 0750 434 54 56 "),BorderLayout.SOUTH);
	
			
		
		}
			
	

			
	
			

			
			
			
			

		


	

	}

