package guuu;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Control extends JFrame {
	JButton jbtOk=new JButton("Ok");
	
	JCheckBox b=new JCheckBox();
	JCheckBox d=new JCheckBox();
	JButton cancel=new JButton("cancel");
	Circle canvas =new Circle ();
public Control () {
	
	JPanel panel=new JPanel();
	panel.add(jbtOk);
	panel.add(cancel);
	panel.add(b);
	panel.add(d);
	
	add(panel,BorderLayout.SOUTH);
	
	add(canvas,BorderLayout.CENTER);
	
   Listener3 l1=new Listener3();
	jbtOk.addActionListener(l1);
	cancel.addActionListener(l1);
	//jbtOk.addActionListener(new listener3());
	//cancel.addActionListener(new listener3());
	
}

public static void main(String[] args) {
	JFrame f1=new  Control();
	f1.setTitle("aa");
	f1.setSize(400,400);
	f1.setVisible(true);
	f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
	
	
}
public class Listener3 implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		System.out.println(new java.util.Date(e.getWhen()));
	
		if(e.getSource() == jbtOk) {
			canvas.jbtOk();
		}
		else if(e.getSource() == cancel) {
			canvas.cancel();
		}
	} 
}
}