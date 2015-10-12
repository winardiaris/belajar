package com.winardi.aris.belajar.swing;
import javax.swing.*;

public class HaloSwing {
	public static void main(String[]x){
		JFrame j = new JFrame();
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setTitle("Halo Swing");
		j.setSize(400,300);
		j.setLocationRelativeTo(null);

		JButton btnOk = new JButton("Ok");
		j.getContentPane().add(btnOk);
		j.setVisible(true);
	}
}
