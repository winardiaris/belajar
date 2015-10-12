package com.winardi.aris.belajar.swing;
import javax.swing.*;
import java.awt.*;

public class HaloBorderLayout{
	public static void main(String[]x){
		JFrame  j = new JFrame();
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setTitle("Border Layout");
		j.setSize(600,400);
		j.setLocationRelativeTo(null);
		
		JButton b1 = new JButton("Satu");
		JButton b2 = new JButton("ini yang ke 2");
		JButton b3 = new JButton("ke tiga");
		JButton b4 = new JButton("opat");
		JButton b5 = new JButton("buton ke lima");

		BorderLayout layout = new BorderLayout();
		j.getContentPane().setLayout(layout);
		j.getContentPane().add(b1,BorderLayout.NORTH);
		j.getContentPane().add(b2,BorderLayout.SOUTH);
		j.getContentPane().add(b3,BorderLayout.WEST);
		j.getContentPane().add(b4,BorderLayout.EAST);
		j.getContentPane().add(b5,BorderLayout.CENTER);

		j.setVisible(true);
	}
}
