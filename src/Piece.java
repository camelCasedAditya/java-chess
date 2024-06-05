import java.util.ArrayList;

public class Piece {
    int color;
    int row;
    int col;
    boolean onStartingSquare;
    String pieceName;

    ArrayList<Integer> possibleMoves = new ArrayList<Integer>();

    public Piece(int pieceColor, int row, int col, String pieceName) {
        this.color = pieceColor;
        this.row = row;
        this.col = col;
        this.pieceName=pieceName;
        this.onStartingSquare = true;
    }

    public int getColor() {
        return color;
    }
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
    public boolean getOnStartingSquare() {
        return this.onStartingSquare;
    }

    public void setOnStartingSquare(boolean onStartingSquareCondition) {
        this.onStartingSquare = onStartingSquareCondition;
    }

    public String getPieceName() {
        return this.pieceName;
    }

    public ArrayList<int[]> getPossibleMoves() {
        return null;
    }
    public void changeCords(int row, int col) {
    	this.row = row;
    	this.col = col;
    }
    
    public int numberOfPossibleMoves() {
        return 0;
    }


    // public static addPiece

}