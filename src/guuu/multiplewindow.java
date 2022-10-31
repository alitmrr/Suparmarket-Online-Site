package guuu;

import java.awt.BorderLayout;



import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class multiplewindow extends JFrame{
	private JTextArea jta;
	
private JButton jbtShowHistogram = new JButton("Fruit");
private JButton jbtShowHistogram1 = new JButton("Vegetables");
private JButton jbtShowHistogram2 = new JButton("Show address ");
private JButton jbtShowHistogram3 = new JButton("Nuts ");
private JButton jbtShowHistogram4 = new JButton("Basic Food Product ");
private JButton jbtShowHistogram5 = new JButton("Stionery");
private JButton jbtShowHistogram6 = new JButton("Dessert");
private JButton jbtShowHistogram7 = new JButton("RATE");

public JFrame histogramFrame= new JFrame();
public JFrame histogramFrame1= new JFrame();
public JFrame histogramFrame2= new JFrame();
public JFrame histogramFrame3= new JFrame();
public JFrame histogramFrame4= new JFrame();
public JFrame histogramFrame5= new JFrame();
public JFrame histogramFrame6= new JFrame();
public JFrame histogramFrame7= new JFrame();


public multiplewindow() {
	
JScrollPane scrollPane = new JScrollPane(jta = new JTextArea());
scrollPane. setPreferredSize(new Dimension(800, 200));
jta. setWrapStyleWord(true);
jta. setLineWrap(true);

JPanel p3=new JPanel();

p3.setLayout(new GridLayout(3,2));
p3.add(jbtShowHistogram);
p3.add(jbtShowHistogram1);

p3.add(jbtShowHistogram3);
p3.add(jbtShowHistogram4);
p3.add(jbtShowHistogram5);
p3.add(jbtShowHistogram6);
JPanel p4=new JPanel();

p4.setLayout(new GridLayout(2,1));
p4.add(jbtShowHistogram2);
p4.add(jbtShowHistogram7);
add(p4, BorderLayout.WEST);

add(new JTextField("SUPERMARKET"), BorderLayout.NORTH);
add(scrollPane, BorderLayout.SOUTH);
add(p3, BorderLayout.CENTER);

jbtShowHistogram.addActionListener(new MeyveListener());
jbtShowHistogram1.addActionListener(new Sebzelistener());
jbtShowHistogram2.addActionListener(new AddressListener());
jbtShowHistogram3.addActionListener(new NutsListener());
jbtShowHistogram4.addActionListener(new Basicfoodproducts ());
jbtShowHistogram5.addActionListener(new StationeryListener());
jbtShowHistogram6.addActionListener(new DessertListener());
jbtShowHistogram7.addActionListener(new RateListener ());

}

public static void main(String[] args) {


	multiplewindow frame = new multiplewindow();
frame. setLocationRelativeTo(null);
frame. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame. setTitle("SUPERMARKET");
frame. pack();
frame. setVisible(true);

}
}

