import java.awt.BorderLayout;
import java.util.ArrayList;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class App {
	final int BLACK_COLOR = 0;
	final int WHITE_COLOR = 1;
	static ArrayList<Piece> pieceList = new ArrayList<Piece>();
	JFrame frame = new JFrame();
	int xWidth = 800;
	int yWidth = 800;
	JButton[][] button = new JButton[8][8];
	Container center = new Container();

	public App() {
		// Sets size of screen
		frame.setSize(xWidth, yWidth);
		frame.setLayout(new BorderLayout());
		center.setLayout(new GridLayout(8, 8));
		King king = new King(0, 0, 4);
		Knight knight = new Knight(0, 0, 1);
		Rook rook = new Rook(0, 0, 7);

		// Rook rook
		pieceList.add(king);
		pieceList.add(knight);
		pieceList.add(rook);

		ArrayList<int[]> rookMoves = rook.getPossibleMoves();
		// for(int i = 0; i<rookMoves.size(); i++) {
		// System.out.println(rookMoves.get(i)[0] + ":" + rookMoves.get(i)[1]);
		// }
		// i is for row
		for (int i = 0; i < button.length; i++) {
			// j is for column
			for (int j = 0; j < button[0].length; j++) {
				button[i][j] = new JButton((i + 1) + ":" + (j + 1));
				center.add(button[i][j]);
			}
		}
		// Adds each piece to the board
		for (int i = 0; i < pieceList.size(); i++) {
			int row = pieceList.get(i).getRow();
			int col = pieceList.get(i).getCol();
			button[row][col].setText(pieceList.get(i).getPieceName());
		}
		frame.add(center, BorderLayout.CENTER);

		// Sets program to close when tab is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Allows user to see what has been created
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
			if (((pieceList.get(i).getRow() == row) && (pieceList.get(i).getCol() == col)
					&& (pieceList.get(i).getColor() != color)) || (getPiece(row, col) == null)) {
				return true;
			}
		}

		return false;
	}

	public void addPiece(Piece piece) {
		pieceList.add(piece);
	}

	public static Piece getPiece(int row, int col) {
		for (int i = 0; i < pieceList.size(); i++) {
			if ((pieceList.get(i).getRow() == row) && (pieceList.get(i).getCol() == col)) {
				return pieceList.get(i);
			}
		}
		return null;
	}

	public void setBoard() {
		for (int i = 0; i < button.length; i++) {
			// j is for column
			for (int j = 0; j < button[0].length; j++) {
				button[i][j] = new JButton((i + 1) + ":" + (j + 1));
				button[i][j].setText(" ");
				center.add(button[i][j]);
			}
		}
	}
	// public void placeRooks() {
	// // Assigns rooks
	// for (int i = 0; i < button.length; i++) {
	// //j is for column
	// for (int j = 0; j < button[0].length; j++) {
	// if(squareValue==1 || squareValue==8 || squareValue==57 || squareValue==64) {
	// button[j][i];
	// }
	// squareValue+=1;
	// }
	// }
	// }

	// public void placePawns() {
	// //Assigns pawns
	// for (int i = 0; i < button.length; i++) {
	// //j is for column
	// for (int j = 0; j < button[0].length; j++) {
	// if(squareValue>48 && squareValue<57) {
	// button[j][i].setText("Pawn");
	// }
	// squareValue+=1;
	// }
	// }

	// }

}
