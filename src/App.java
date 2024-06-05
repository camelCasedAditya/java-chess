//package App;

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
	int turn = WHITE_COLOR;
	static ArrayList<Piece> pieceList = new ArrayList<Piece>();
	JFrame frame = new JFrame();
	int xWidth = 800;
	int yWidth = 800;
	JButton[][] button = new JButton[8][8];
	Container center = new Container();
	JButton current=null;
	Piece pieceClicked;
	Piece pieceClickedCheck;

	JButton queen = new JButton();
	JButton knight = new JButton();
	JButton rook = new JButton();
	JButton bishop = new JButton();

	Container south = new Container();

	//Promotion buttons


	int oldPieceRow = 0;
	int oldPieceCol=0;
	final int CHOOSEPIECE=0;
	final int MOVEPIECE=1;
	final int PROMOTION=2;
	int state=CHOOSEPIECE;

	public App() {
		// Sets size of screen
		frame.setSize(xWidth, yWidth);
		frame.setLayout(new BorderLayout());
		center.setLayout(new GridLayout(8, 8));
		// south.setLayout(new GridLayout(1, 4));
		// south.add(queen);
		// south.add(knight);
		// south.add(rook);
		// south.add(bishop);
		// queen.addActionListener(this);
		// knight.addActionListener(this);
		// rook.addActionListener(this);
		// bishop.addActionListener(this);

		// queen.setEnabled(false);
		// knight.setEnabled(false);
		// rook.setEnabled(false);
		// bishop.setEnabled(false);

		frame.add(south, BorderLayout.SOUTH);
		Pawn whitePawn1 = new Pawn(WHITE_COLOR, 6, 0);
		Pawn whitePawn2 = new Pawn(WHITE_COLOR, 6, 1);
		Pawn whitePawn3 = new Pawn(WHITE_COLOR, 6, 2);
		Pawn whitePawn4 = new Pawn(WHITE_COLOR, 6, 3);
		Pawn whitePawn5 = new Pawn(WHITE_COLOR, 6, 4);
		Pawn whitePawn6 = new Pawn(WHITE_COLOR, 6, 5);
		Pawn whitePawn7 = new Pawn(WHITE_COLOR, 6, 6);
		Pawn whitePawn8 = new Pawn(WHITE_COLOR, 6, 7);

		Pawn blackPawn1 = new Pawn(BLACK_COLOR, 1, 0);
		Pawn blackPawn2 = new Pawn(BLACK_COLOR, 1, 1);
		Pawn blackPawn3 = new Pawn(BLACK_COLOR, 1, 2);
		Pawn blackPawn4 = new Pawn(BLACK_COLOR, 1, 3);
		Pawn blackPawn5 = new Pawn(BLACK_COLOR, 1, 4);
		Pawn blackPawn6 = new Pawn(BLACK_COLOR, 1, 5);
		Pawn blackPawn7 = new Pawn(BLACK_COLOR, 1, 6);
		Pawn blackPawn8 = new Pawn(BLACK_COLOR, 1, 7);

		Rook whiteRook1 = new Rook(WHITE_COLOR, 7, 0);
		Rook whiteRook2 = new Rook(WHITE_COLOR, 7, 7);

		Rook blackRook1 = new Rook(BLACK_COLOR, 0, 0);
		Rook blackRook2 = new Rook(BLACK_COLOR, 0, 7);

		Knight whiteKnight1 = new Knight(WHITE_COLOR, 7, 1);
		Knight whiteKnight2 = new Knight(WHITE_COLOR, 7, 6);

		Knight blackKnight1 = new Knight(BLACK_COLOR, 0, 1);
		Knight blackKnight2 = new Knight(BLACK_COLOR, 0, 6);

		Bishop whiteBishop1 = new Bishop( WHITE_COLOR, 7, 2);
		Bishop whiteBishop2 = new Bishop( WHITE_COLOR, 7, 5);

		Bishop blackBishop1 = new Bishop(BLACK_COLOR, 0, 2);
		Bishop blackBishop2 = new Bishop(BLACK_COLOR, 0, 5);

		King whiteKing = new King(WHITE_COLOR, 4, 4);
		King blackKing = new King(BLACK_COLOR, 0, 4);

		Queen whiteQueen = new Queen(WHITE_COLOR, 7, 3);
		Queen blackQueen = new Queen(BLACK_COLOR, 0, 3);
		// King king = new King(1, 6, 5);
		// //Knight knight = new Knight(0, 0, 1);
		// Knight rook = new Knight(0, 4, 2);
		// Rook rook2 = new Rook (0, 0, 0);
		// Rook rook3 = new Rook (0, 1, 1);
		//System.out.println("KING R: " + king.getRow() + " C: " + king.getCol());

		// Rook rook
		//pieceList.add(king);
		//pieceList.add(knight);
		pieceList.add(whitePawn1);
		pieceList.add(whitePawn2);
		pieceList.add(whitePawn3);
		pieceList.add(whitePawn4);
		pieceList.add(whitePawn5);
		pieceList.add(whitePawn6);
		pieceList.add(whitePawn7);
		pieceList.add(whitePawn8);

		pieceList.add(blackPawn1);
		pieceList.add(blackPawn2);
		pieceList.add(blackPawn3);
		pieceList.add(blackPawn4);
		pieceList.add(blackPawn5);
		pieceList.add(blackPawn6);
		pieceList.add(blackPawn7);
		pieceList.add(blackPawn8);

		pieceList.add(whiteRook1);
		pieceList.add(whiteRook2);
		pieceList.add(blackRook1);
		pieceList.add(blackRook2);

		pieceList.add(whiteKnight1);
		pieceList.add(whiteKnight2);
		pieceList.add(blackKnight1);
		pieceList.add(blackKnight2);

		pieceList.add(whiteBishop1);
		//pieceList.add(whiteBishop2);
		pieceList.add(blackBishop1);
		pieceList.add(blackBishop2);

		pieceList.add(whiteKing);
		pieceList.add(blackKing);

		pieceList.add(whiteQueen);
		pieceList.add(blackQueen);
		//System.out.println("MATE:" + king.isInMate());
		
		// ArrayList<int[]> rookMoves = king.getPossibleMoves();
		// for(int i = 0; i<rookMoves.size(); i++) {
		// 	System.out.println(rookMoves.get(i)[0] + ":" + rookMoves.get(i)[1]);
		// }
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
			state=MOVEPIECE;
			findPieceOptions(event);
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
					System.out.println(pieceClickedCheck.getPieceName());
					if(pieceClickedCheck!=null) {
						System.out.println("MOVES:" + (pieceClickedCheck.numberOfPossibleMoves() > 0));
						if ((pieceClickedCheck.numberOfPossibleMoves() > 0) && (pieceClickedCheck.getColor() == turn)){
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
						else {
							state=CHOOSEPIECE;
							System.out.println("OUT OF MOVES");
						}
					}
					else {
						state=CHOOSEPIECE;
					}
					System.out.println("NUM: " + pieceClickedCheck.numberOfPossibleMoves());
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
						Piece test = App.getPiece(oldPieceRow, oldPieceCol);
						if(App.getPiece(i, j) != null) {
							pieceList.remove(App.getPiece(i, j));
							getPiece(oldPieceRow, oldPieceCol).setOnStartingSquare(false);
							getPiece(oldPieceRow, oldPieceCol).changeCords(i, j);
							System.out.println("REMOVED THE " + test.getPieceName());

							// if((getPiece(oldPieceRow, oldPieceCol).getPieceName().equals("Pawn") == true) && (getPiece(oldPieceRow, oldPieceCol).getColor() == 1) && (i == 0)) {

							// }

						}

						else {
							getPiece(oldPieceRow, oldPieceCol).setOnStartingSquare(false);
							getPiece(oldPieceRow, oldPieceCol).changeCords(i, j);
							System.out.println("PAWN " + test.getOnStartingSquare());
						}

						if (turn == BLACK_COLOR) {
							turn = WHITE_COLOR;
						}
						else {
							turn = BLACK_COLOR;
						}
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
			if(pieceList.get(i).getColor() == 1) {
				button[row][col].setText("W " + pieceList.get(i).getPieceName());
			}
			else {
				button[row][col].setText("B " + pieceList.get(i).getPieceName());
			}
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