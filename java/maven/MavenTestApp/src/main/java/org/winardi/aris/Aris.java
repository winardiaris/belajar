package org.winardi.aris;
import javax.swing.*;

public class Aris {
	public static void main(String[]x){
		JFrame j = new JFrame();
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setTitle("Halo Aris");
		j.setSize(300,200);
		j.setLocationRelativeTo(null);
		
		JButton btnOk = new JButton("OK");
		j.getContentPane().add(btnOk);
		j.setVisible(true);
	}
}
