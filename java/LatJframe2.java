import javax.swing.JFrame;
import javax.swing.JLabel;

public class LatJframe2{
	public static void main(String[]args){
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame();
		frame.setTitle ("Ini Title");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label =  new JLabel("welcome");
		frame.add(label);
		frame.pack();
		frame.setVisible(true);
	}
}
