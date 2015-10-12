
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Login extends JPanel {
    private JButton bmasuk;
    private JLabel luser;
    private JTextField tuser;
    private JLabel lpass;
    private JTextField tpass;

    public static  Form() {
        //construct components
        bmasuk = new JButton ("Masuk");
        luser = new JLabel ("Nama Pengguna");
        tuser = new JTextField (100);
        lpass = new JLabel ("Kata sandi");
        tpass = new JTextField (255);

        //adjust size and set layout
        setPreferredSize (new Dimension (300, 180));
        setLayout (null);

        //add components
        add (bmasuk);
        add (luser);
        add (tuser);
        add (lpass);
        add (tpass);

        //set component bounds (only needed by Absolute Positioning)
        bmasuk.setBounds (90, 135, 100, 20);
        luser.setBounds (15, 15, 150, 25);
        tuser.setBounds (15, 40, 250, 25);
        lpass.setBounds (15, 75, 100, 25);
        tpass.setBounds (15, 100, 250, 25);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("Login");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Form());
        frame.pack();
        frame.setVisible (true);
    }
}
