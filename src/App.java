import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class App {
	JFrame frame = new JFrame();
	int xWidth=800;
	int yWidth=800;
	JButton[][] button = new JButton[8][8];
	Container center = new Container();
	
	
	public App() {
		//Sets size of screen
		frame.setSize(xWidth,yWidth);
		frame.setLayout(new BorderLayout());
		center.setLayout(new GridLayout(8,8));
		//i is for row
		for (int i = 0; i < button.length; i++) {
			//j is for column
			for (int j = 0; j < button[0].length; j++) {
				button[j][i] = new JButton(j+""+i);
				center.add(button[j][i]);
			}
		}
		frame.add(center, BorderLayout.CENTER);

		//Sets program to close when tab is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Allows user to see what has been created
		frame.setVisible(true);

	}
	
	public static void main(String[] args) {
		new App();
	}
	

}
