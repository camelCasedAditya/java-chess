import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class App implements ActionListener {
	final int BLACK_COLOR = 0;
	final int WHITE_COLOR = 1;
	static ArrayList<Piece> pieceList = new ArrayList<Piece>();
	JFrame frame = new JFrame();
	int xWidth = 800;
	int yWidth = 800;
	JButton[][] button = new JButton[8][8];
	Container center = new Container();
	JButton current=null;
	Piece pieceClicked;
	Piece pieceClickedCheck;
	int oldPieceRow = 0;
	int oldPieceCol=0;
	final int CHOOSEPIECE=0;
	final int MOVEPIECE=1;
	int state=CHOOSEPIECE;

	public App() {
		// Sets size of screen
		frame.setSize(xWidth, yWidth);
		frame.setLayout(new BorderLayout());
		center.setLayout(new GridLayout(8, 8));
		King king = new King(0, 4, 3);
		Knight knight = new Knight(0, 0, 1);
		Knight rook = new Knight(0, 4, 2);
		Rook rook2 = new Rook (0, 2, 4);

		// Rook rook
		pieceList.add(king);
		pieceList.add(knight);
		pieceList.add(rook);
		pieceList.add(rook2);
		
		ArrayList<int[]> rookMoves = king.getPossibleMoves();
		for(int i = 0; i<rookMoves.size(); i++) {
			System.out.println(rookMoves.get(i)[0] + ":" + rookMoves.get(i)[1]);
		}
		// i is for row
		for (int i = 0; i < button.length; i++) {
			// j is for column
			for (int j = 0; j < button[0].length; j++) {
				button[i][j] = new JButton((i + 0) + ":" + (j + 0));
				center.add(button[i][j]);
				button[i][j].addActionListener(this);
				button[i][j].setOpaque(true);
			}
		}
		// Adds each piece to the board
		refreshBoard();
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
		if (getPiece(row, col) == null) {
			return true;
		}
		else {
			for (int i = 0; i < pieceList.size(); i++) {
				if (((pieceList.get(i).getRow() == row) && (pieceList.get(i).getCol() == col)
						&& (pieceList.get(i).getColor() != color))) {
					return true;
				}
			}
		}

		return false;
	}
	//Add piece to piece list
	public void addPiece(Piece piece) {
		pieceList.add(piece);
	}
	//Piece from Coordinates
	public static Piece getPiece(int row, int col) {
		for (int i = 0; i < pieceList.size(); i++) {
			if ((pieceList.get(i).getRow() == row) && (pieceList.get(i).getCol() == col)) {
				return pieceList.get(i);
			}
		}
		return null;
	}
	//Printing board
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
	
	//Action performed
	@Override
	public void actionPerformed(ActionEvent event) {
		if(state==CHOOSEPIECE) {
			findPieceOptions(event);
			state=MOVEPIECE;
		}
		else if(pieceClickedCheck!= null && state==MOVEPIECE) {
			movePiece(event);
			state=CHOOSEPIECE;
		}
	}
	public void findPieceOptions(ActionEvent event) {
		for(int i=0; i<button.length; i++) {
			for(int j = 0; j< button[0].length; j++) {
				if(event.getSource().equals(button[i][j])) {
					pieceClickedCheck = getPiece(i,j);
					if(pieceClickedCheck!=null) {
						pieceClicked = getPiece(i,j);
						oldPieceRow=i;
						oldPieceCol=j;
						current = button[i][j];
						current.setBackground(Color.RED);
						ArrayList<int[]> list = pieceClicked.getPossibleMoves();
						JButton possibleMoveButtons=null;
						for (int k = 0; k < list.size(); k++) {
							int x= list.get(k)[0];
							int y = list.get(k)[1];
							possibleMoveButtons=button[x][y];
							possibleMoveButtons.setBackground(Color.YELLOW);
						}
					}
					System.out.println(pieceClickedCheck == null);
//					Piece mainPiece = new Piece(WHITE_COLOR, j, i, piece.getPieceName());
//					Piece(Color.WHITE, j, i, piece);
				}
			}
		}
	}
	public void movePiece(ActionEvent event) {
		for(int i=0; i<button.length; i++) {
			for(int j = 0; j< button[0].length; j++) {
				if(event.getSource().equals(button[i][j])) {
					if((button[i][j]).getBackground()==Color.YELLOW) {
						getPiece(oldPieceRow, oldPieceCol).changeCords(i, j);
//						Piece pieceName = getPiece(oldPieceRow,oldPieceCol);
//						Piece newPiece = getPiece(oldPieceRow, oldPieceCol);
//						pieceName.setRow(i);
//						newPiece.setCol(j);
//						pieceName.setCol(newPiece.getCol());
						clearBoard();
						refreshBoard();
						frame.repaint();
//						System.out.println("Hi");
//						for (int z = 0; z < pieceList.size(); z++) {
//							System.out.println(getPiece(i,j)+"This is pieceClicked");
//							System.out.println(pieceList.get(z)+"This is pieceList");
//							if(pieceList.get(z)==pieceClicked) {
////								pieceList.get(z).setRow(i);
////								pieceList.get(z).setCol(j);
//								getPiece(i,j).get
//								
//							}
//						}
					}
//					for (int k = 0; k < pieceList.size(); k++) {
//						System.out.println(j);
//						System.out.println(i);
//						pieceClicked.setCol(j);
//						pieceClicked.setRow(i);
//					}	
				}
			}
		}	
	}

	public void refreshBoard() {
		for (int i = 0; i < pieceList.size(); i++) {
			int row = pieceList.get(i).getRow();
			int col = pieceList.get(i).getCol();
			button[row][col].setText(pieceList.get(i).getPieceName());
		}
	}

	public void clearBoard() {
		for (int i = 0; i < button.length; i++) {
			// j is for column
			for (int j = 0; j < button[0].length; j++) {
				button[i][j].setBackground(Color.WHITE);
				button[i][j].setText(null);
			}
		}
	}
}
