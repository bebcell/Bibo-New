package guii;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class guii {

	public static class exe extends JFrame implements ActionListener{
		//the components creation
		private JButton b1;
		private JTextField tf1;
		private JTextArea t1;
		
		public exe() {
			super("EXe name");
			setSize(450,100);
			
			//first make the Container
			Container c=getContentPane();
			c.setLayout(null);
			
			//now you can create your components
			b1=new JButton("Button1");
			b1.setFont(new Font("Serif",Font.BOLD,22));
			
			//text field
			tf1=new JTextField(20);
			
			
			//the replying area
			t1=new JTextArea(10,2);
			t1.setEditable(false);
			t1.setFont(new Font("Serif",Font.BOLD,20));
			
			
			b1.setBounds(10,10,150,30);
			tf1.setBounds(10,110,200,30);
			t1.setBounds(220, 110,200,30);
			//add components to the container
			//c.add(b1);
			c.add(t1);
			c.add(tf1);
			
			
			//b1.addActionListener(this);
			
			tf1.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			        System.out.println("You wrote "+e.getActionCommand());
			        t1.setText("");
			        t1.append(e.getActionCommand()+"\n");
			  
			        tf1.setText("");
			        
			    }
			});;
			b1.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			    	JOptionPane.showMessageDialog(b1, e.getActionCommand()+" Button Pressed");
			    }
			});;
			
			
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1)
			{JOptionPane.showMessageDialog(b1, e.getActionCommand()+" Button Pressed");}
		}		
	}
	
	public static void main(String[]args){
		exe Apps=new exe();
		Apps.setDefaultCloseOperation(0);
		
	}
	/*
	 * new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			        System.out.println("Button clicked by "+e.getActionCommand());
			    }
			});
			
	 * */
	 
}


	