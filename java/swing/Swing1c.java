//tutor from http://www.javatpoint.com/java-swing
//Simple example of Swing by inheritance


import javax.swing.*;
public class Swing1c extends JFrame{ //inheriting Jframe
	JFrame f;
	Swing1c(){
		JButton b=new JButton("Click");
		b.setBounds(130,100,100,40);//x axis,y axis, width,height
		add(b);

		setSize(400,500);//width,height
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[]args){
		new Swing1c();
	}
}
