import javax.swing.JFrame;
public class LatJframe1 {
	public static void	main(String[]args){
		JFrame aWindow = new JFrame ("ini adalah judul window");
		int windowWidth=800;
		int windowHeight=600;
		aWindow.setBounds(50,100,windowWidth,windowHeight);
		aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aWindow.setVisible(true);
	}
}
