import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LatJframe3{
	public static void main(String[]args){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Latihan JFrame 3");
		frame.setLayout(new GridLayout(3,2));
		frame.add(new JLabel("Nama depan: "));
		frame.add(new JTextField());
		frame.add(new JLabel("Nama belakang: "));
		frame.add(new JTextField());
		frame.add(new JButton("Daftar"));
		
		int f_lebar = 400;
		int f_tinggi = 300;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds((int) screenSize.getWidth() - f_lebar,0,f_lebar,f_tinggi);
		
		frame.setVisible(true);
	}
}
