package com.winardi.aris.uangku;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.FlowLayout;

public class Login{
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setTitle("Halaman Masuk");
        j.setSize(300,200);
        j.setLocationRelativeTo(null);

        JLabel luser = new JLabel("Nama Pengguna");
        JLabel lpass = new JLabel("Kata Sandi");
        JTextField tuser = new JTextField("Nama Pengguna");
        JPasswordField tpass = new JPasswordField("Kata Sandi");
        JButton Bok = new JButton("Masuk");

        java.awt.FlowLayout layout = new FlowLayout();

        j.getContentPane().setLayout(layout);
        j.getContentPane().add(luser);
        j.getContentPane().add(tuser);
        j.getContentPane().add(lpass);
        j.getContentPane().add(tpass);
        j.getContentPane().add(Bok);

        j.setVisible(true);


    }
}