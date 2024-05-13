import java.util.ArrayList;

public class Pawn extends Piece {

    boolean onStartingSquare;
    boolean enPassantAvailble;

    ArrayList<Integer> possibleMoves = new ArrayList<Integer>();

    public Pawn (int color, int row, int col) {
        super(color, row, col, "Pawn");
        onStartingSquare = true;
        enPassantAvailble = false;
    }

    public ArrayList<int[]> getPossibleMoves(Piece piece) {
        possibleMoves.clear();
        if (onStartingSquare == true) {
            if (App.isSquareAvailible(color, row, col))
        }
        return null;
    }

    public boolean isSquareAvailbleForPawnPush() {
        for (int i = 0; i < pieceList.size(); i++) {
			if ((pieceList.get(i).getRow() == row) && (pieceList.get(i).getCol() == col) && (pieceList.get(i).getColor() != color) && ()) {
				return false;
			}
		}
    }
    // public int getColor() {
    //     return color;
    // }
    // public int getRow() {
    //     return row;
    // }

    // public void setRow(int row) {
    //     this.row = row;
    // }
    // public int getCol() {
    //     return col;
    // }

    // public void setCol(int col) {
    //     this.col = col;
    // }
}
