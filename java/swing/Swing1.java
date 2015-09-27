//tutor from http://www.javatpoint.com/java-swing

import javax.swing.*;
public class Swing1{
	public static void main(String[]args){
		JFrame f=new JFrame();

		JButton b=new JButton("Click");
		b.setBounds(130,100,100,40);//x axis,y axis, width,height
		f.add(b);

		f.setSize(400,500);//width,height
		f.setLayout(null);
		f.setVisible(true);
	}
}
