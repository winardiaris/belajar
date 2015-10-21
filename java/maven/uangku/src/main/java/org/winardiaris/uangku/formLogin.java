package org.winardiaris.uangku;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class formLogin{
	public static void main(String[] x){
		JFrame fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setTitle("Masuk - uangku");
		fr.setSize(350,180);
		fr.setLocationRelativeTo(null);

		JButton Blogin = new JButton("Masuk");
		JLabel Lusername = new JLabel("Nama Pengguna");
		JLabel Lpassword = new JLabel("Kata Sandi");
		JTextField Tusername = new JTextField("",25);
		JPasswordField Tpassword = new JPasswordField("",25);

		FlowLayout layout = new FlowLayout();
		fr.getContentPane().setLayout(layout);
		fr.getContentPane().add(Lusername);
		fr.getContentPane().add(Tusername);
		fr.getContentPane().add(Lpassword);
		fr.getContentPane().add(Tpassword);
		fr.getContentPane().add(Blogin);

		EventLogin e = new EventLogin();
		Blogin.addActionListener(e);

		fr.setVisible(true);
	}
	static class EventLogin implements ActionListener {
		public void actionPerformed(ActionEvent e){
			System.out.println("Terjadi event");
			//Object sumber = e.getSource();
			//JButton tombolYangDiklik = (JButton) sumber;
			//String tulisan = tombolYangDiklik.getText();
			//System.out.println("Tombol "+tulisan+" diklik");


		}

	}
	
}
