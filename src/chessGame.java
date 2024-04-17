import java.awt.BorderLayout;

import javax.swing.JFrame;

public class chessGame {
	JFrame frame = new JFrame();
	
	public chessGame() {
		frame.setSize(800,600);
		frame.setLayout(new BorderLayout());
		
		//Sets program to close when tab is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Allows user to see what has been created
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new chessGame();
	}

}
