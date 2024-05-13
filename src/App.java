import java.awt.BorderLayout;
import java.util.ArrayList;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class App {
	static ArrayList<Piece> pieceList = new ArrayList<Piece>();
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



	public static boolean isSquareAvailible(int color, int row, int col) {
		// int oppositeColor = -1;
		// if (color == 1) {oppositeColor = 0;}
		// else if (color == 0) {oppositeColor = 1;}
		for (int i = 0; i < pieceList.size(); i++) {
			if ((pieceList.get(i).getRow() == row) && (pieceList.get(i).getCol() == col) && (pieceList.get(i).getColor() != color)) {
				return false;
			}
		}

		return true;
	}

	public void addPiece(Piece piece) {
		pieceList.add(piece);
	}
	public Piece getPiece(int row, int col) {
		for (int i = 0; i < pieceList.size(); i++) {
			if ((pieceList.get(i).getRow() == row) && (pieceList.get(i).getCol() == col)) {
				return pieceList.get(i);
			}
		}
		return null;
	}
	

}
