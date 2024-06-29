import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUp  implements ActionListener {

	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField tf1,tf2,tf4,tf5,tf6;
	JPasswordField tf3;
	JButton b1;
	JCheckBox cb;
	SignUp(){
		
		JFrame f=new JFrame("SignUp Page");
		l1=new JLabel ("SignUp Page ");
		l1.setBounds(150, 40, 80, 30);
		l2=new JLabel ("Name: ");
		l2.setBounds(80, 80, 40, 20);
		tf1=new JTextField();
		tf1.setBounds(140,80,150,20);
		l3=new JLabel ("Email: ");
		l3.setBounds(80, 120, 40, 20);
		tf2=new JTextField();
		tf2.setBounds(140,120,150,20);
		l4=new JLabel ("Password: ");
		l4.setBounds(80, 160, 80, 20);
		tf3=new JPasswordField();
		tf3.setBounds(140,160,150,20);
		l5=new JLabel ("DOB: ");
		l5.setBounds(80, 200, 80, 20);
		tf4=new JTextField();
		tf4.setBounds(140,200,150,20);
		l6=new JLabel ("Address: ");
		l6.setBounds(80, 240, 80, 20);
		tf5=new JTextField();
		tf5.setBounds(140,240,150,20);
		l7=new JLabel ("Gender: ");
		l7.setBounds(80, 280, 80, 20);
		tf6=new JTextField();
		tf6.setBounds(140,280,150,20);
		cb=new JCheckBox("I agree to the term and condition");
		cb.setBounds(145,310, 250, 20);
		
		b1=new JButton("Submit ");
		b1.setBounds(150,340,100,30);
		
		
		
		b1.addActionListener(this);
		
		
		
		
		
		f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);
		f.add(tf1);f.add(tf2);f.add(tf3);f.add(tf4);f.add(tf5);f.add(tf6);
		f.add(b1);
		f.add(cb);
		f.setSize(400,450);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name=tf1.getText();
		JFrame wf=new JFrame("Welcom");
		JLabel wl=new JLabel("Welcom  "+name);
		wl.setBounds(50,50,200,30);
		wf.add(wl);
		
		wf.setSize(300,200);
		wf.setLayout(null);
		wf.setVisible(true);
		
		wf.setDefaultCloseOperation(wf.EXIT_ON_CLOSE);
		
	}
	
public static void main(String abc[]) {
	new SignUp();
}
}

