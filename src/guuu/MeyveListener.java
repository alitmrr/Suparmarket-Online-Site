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

import java.util.Scanner;


import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MeyveListener implements ActionListener {
	

	JFrame histogramFrame1= new JFrame();



		public void actionPerformed(ActionEvent e) {
			String file1 = "fruit.txt";
			try {
			
				FileWriter fw=new FileWriter(file1);
				BufferedWriter bw=new BufferedWriter(fw);
				PrintWriter outFile=new PrintWriter (bw);
			
				
				
					outFile.write("Apple\n");
					outFile.write("Banana\n");
					outFile.write("Pear\n");
					outFile.write("Orange\n");
					outFile.write("Cherry\n");
					outFile.write("Grape");
					
				
				
					outFile.close();
					
			} catch (IOException ex1) {
			System.out.println("error");
			}
			try {
				
			
				FileReader fwl=new FileReader(file1);
				BufferedReader bwl=new BufferedReader(fwl);
				String s=bwl.readLine();
				String s2=bwl.readLine();
				String s3=bwl.readLine();
				String s4=bwl.readLine();
				String s5=bwl.readLine();
				String s6=bwl.readLine();
				histogramFrame1. setVisible(true);
				histogramFrame1.setSize(800, 400);


				histogramFrame1.add(new JButton("ok"),BorderLayout.WEST);
				JPanel p2=new JPanel(new BorderLayout());
				p2.add(new JTextField("Fruits"),BorderLayout.NORTH);
				p2.add(new JButton("list"),BorderLayout.SOUTH);
				JPanel p3=new JPanel();

				p3.setLayout(new GridLayout(3,2));

						
				p3.add(new JCheckBox(s));
			
		
				p3.add(new JCheckBox(s2));
			

				p3.add(new JCheckBox(s3));
		
				p3.add(new JCheckBox(s4));

				p3.add(new JCheckBox(s5));
		
				p3.add(new JCheckBox(s6));
			
				p2.add(p3,BorderLayout.CENTER);
				histogramFrame1.add(p3,BorderLayout.CENTER);
				histogramFrame1.add(p2,BorderLayout.NORTH);
			}
				
				catch (IOException ex1) {
					System.out.println("error");
					}
				
		}}
		
