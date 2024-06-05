import java.util.ArrayList;

public class Pawn extends Piece {

    boolean enPassantAvailble;

    ArrayList<int[]> possibleMoves = new ArrayList<int[]>();

    public Pawn (int color, int row, int col) {
        super(color, row, col, "Pawn");
        enPassantAvailble = false;
    }

    public ArrayList<int[]> getPossibleMoves() {
        possibleMoves.clear();
        int r = this.row;
        int c = this.col;
        //System.out.println("TEST");
        if (this.color == 0) {
            //System.out.println("TEST");
            if (onStartingSquare == true) {
                //System.out.println("TEST");
                if ((App.isSquareAvailible(color, r+2, c) == true) && (App.isSquareAvailible(color, r+1, c) == true) && (App.getPiece(r+1, c) == null) && (App.getPiece(r+2, c) == null)) {
                    int[] pMove = {r+2, c};
                    possibleMoves.add(pMove);
                }

                if ((App.isSquareAvailible(color, r+1, c) == true) && (App.getPiece(r+1, c) == null) && (r+1 < 8)) {
                    //System.out.println("TEST");
                    int[] pMove = {r+1, c};
                    possibleMoves.add(pMove);
                }

                if ((App.isSquareAvailible(color, r+1, c-1) == true) && App.getPiece(r+1, c-1) != null) {
                    int[] pMove = {r+1, c-1};
                    possibleMoves.add(pMove);
                }
                if ((App.isSquareAvailible(color, r+1, c+1) == true) && App.getPiece(r+1, c+1) != null) {
                    int[] pMove = {r+1, c+1};
                    possibleMoves.add(pMove);
                }
            }
            else {
                //System.out.println("TEST");
                if ((App.isSquareAvailible(color, r+1, c) == true) && (App.getPiece(r+1, c) == null) && (r+1 < 8)) {
                    //System.out.println("TEST");
                    int[] pMove = {r+1, c};
                    possibleMoves.add(pMove);
                }

                if ((App.isSquareAvailible(color, r+1, c-1) == true) && App.getPiece(r+1, c-1) != null) {
                    int[] pMove = {r+1, c-1};
                    possibleMoves.add(pMove);
                }
                if ((App.isSquareAvailible(color, r+1, c+1) == true) && App.getPiece(r+1, c+1) != null) {
                    int[] pMove = {r+1, c+1};
                    possibleMoves.add(pMove);
                }
            }
        }

        if (this.color == 1) {
            //System.out.println("TEST");
            if (onStartingSquare == true) {
                //System.out.println("TEST");
                if ((App.isSquareAvailible(color, r-2, c) == true) && (App.isSquareAvailible(color, r-1, c) == true) && (App.getPiece(r-1, c) == null) && (App.getPiece(r-2, c) == null)) {
                    int[] pMove = {r-2, c};
                    possibleMoves.add(pMove);
                }

                if ((App.isSquareAvailible(color, r-1, c) == true) && (App.getPiece(r-1, c) == null) && (r-1 < 8)) {
                    //System.out.println("TEST");
                    int[] pMove = {r-1, c};
                    possibleMoves.add(pMove);
                }

                if ((App.isSquareAvailible(color, r-1, c-1) == true) && App.getPiece(r-1, c-1) != null) {
                    int[] pMove = {r-1, c-1};
                    possibleMoves.add(pMove);
                }
                if ((App.isSquareAvailible(color, r-1, c+1) == true) && App.getPiece(r-1, c+1) != null) {
                    int[] pMove = {r-1, c+1};
                    possibleMoves.add(pMove);
                }
            }
            else {
                //System.out.println("TEST");
                if ((App.isSquareAvailible(color, r-1, c) == true) && (App.getPiece(r-1, c) == null) && (r-1 < 8)) {
                    //System.out.println("TEST");
                    int[] pMove = {r-1, c};
                    possibleMoves.add(pMove);
                }

                if ((App.isSquareAvailible(color, r-1, c-1) == true) && App.getPiece(r-1, c-1) != null) {
                    int[] pMove = {r-1, c-1};
                    possibleMoves.add(pMove);
                }
                if ((App.isSquareAvailible(color, r-1, c+1) == true) && App.getPiece(r-1, c+1) != null) {
                    int[] pMove = {r-1, c+1};
                    possibleMoves.add(pMove);
                }
            }
        }
        return possibleMoves;
    }

    public boolean isSquareAvailbleForPawnPush() {
        for (int i = 0; i < App.pieceList.size(); i++) {
			if ((App.pieceList.get(i).getRow() == row) && (App.pieceList.get(i).getCol() == col) && (App.pieceList.get(i).getColor() != color) && (true)) {
				return false;
			}
		}
        return false;
    }

    public int numberOfPossibleMoves() {
        possibleMoves = this.getPossibleMoves();
        return possibleMoves.size();
    }
}