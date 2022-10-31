package guuu;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class MultipleWindowsDemo extends JFrame{
private JTextArea jta;
private JButton jbtShowHistogram = new JButton("Show meyve");

private Histogram histogram1 = new Histogram();

private JFrame histogramFrame= new JFrame();

public MultipleWindowsDemo() {

	JScrollPane scrollPane = new JScrollPane(jta = new JTextArea());
scrollPane. setPreferredSize(new Dimension(800, 200));
jta. setWrapStyleWord(true);
jta. setLineWrap(true);

add(scrollPane, BorderLayout.CENTER);
add(jbtShowHistogram, BorderLayout. SOUTH);



jbtShowHistogram.addActionListener(new ActionListener(){


public void actionPerformed(ActionEvent e) {

histogramFrame. setVisible(true);
histogramFrame.setSize(600, 200);

histogramFrame.add(new JButton("ok"),BorderLayout.WEST);
JPanel p2=new JPanel(new BorderLayout());
p2.add(new JButton("meyve bölümü"),BorderLayout.NORTH);
p2.add(new JButton("liste"),BorderLayout.SOUTH);
JPanel p3=new JPanel();

p3.setLayout(new GridLayout(2,3));

p3.add(new JCheckBox("armut"));
p2.add(p3,BorderLayout.CENTER);

histogramFrame.add(p3,BorderLayout.CENTER);
histogramFrame.add(p2,BorderLayout.NORTH);
histogramFrame.add(jta,BorderLayout.SOUTH);
}});
}

public static void main(String[] args) {
MultipleWindowsDemo frame = new MultipleWindowsDemo();
frame. setLocationRelativeTo(null); // Center the frame
frame. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame. setTitle("MultipleWindowsDemo");
frame. pack();
frame. setVisible(true);
}

}


