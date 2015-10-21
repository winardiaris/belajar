package com.winardi.aris.uangku;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.FlowLayout;
/*import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;*/



public class Login{
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setTitle("Halaman Masuk");
        j.setSize(300,200);
        j.setLocationRelativeTo(null);

        JLabel luser = new JLabel("Nama Pengguna");
        JLabel lpass = new JLabel("Kata Sandi");
        JTextField tuser = new JTextField();
        JPasswordField tpass = new JPasswordField();
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