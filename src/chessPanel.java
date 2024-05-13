import java.awt.Frame;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;



public class chessPanel extends JPanel {

	static ArrayList<Piece> pieceList = new ArrayList<Piece>();

	public chessPanel() {
		super();
	}
	public void paintComponent(Graphics g) {
		//Calling JPanel's paint component
		super.paintComponent(g);
		//draw my stuff
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
}
