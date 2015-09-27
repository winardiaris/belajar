import javax.swing.*;
class frame{
	void login(){
		JFrame f=new JFrame();

		JButton b=new JButton("Click");
		b.setBounds(130,100,100,40);//x axis,y axis, width,height
		f.add(b);

		f.setSize(400,300);//width,height
		f.setLayout(null);
		f.setVisible(true);
	}
}
