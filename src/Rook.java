import java.util.ArrayList;

public class Rook extends Piece {

    

    public Rook (int color, int row, int col) {
        super(color, row, col, "Rook");
    }
    

    public ArrayList<Integer> getPossibleMoves() {
        return possibleMoves;
    }

    public ArrayList<int[]> getPossibleMoves(Piece piece) {
        ArrayList<int[]> possibleMoves = new ArrayList<int[]>();
        // Row
        for (int row = piece.row; row < 8; row++) {
            if(App.isSquareAvailible(piece.color, row, piece.col) == true) {
                int[] move = {row, piece.col};
                possibleMoves.add(move);
            }
            else {
                break;
            }
        }
        for (int row = piece.row; row >= 0; row--) {
            if(App.isSquareAvailible(piece.color, row, piece.col) == true) {
                int[] move = {row, piece.col};
                possibleMoves.add(move);
            }
            else {
                break;
            }
        }

        for (int col = piece.col; col < 8; col++) {
            if(App.isSquareAvailible(piece.color, piece.row, col) == true) {
                int[] move = {piece.row, col};
                possibleMoves.add(move);
            }
            else {
                break;
            }
        }

        for (int col = piece.col; col >= 0; col--) {
            if(App.isSquareAvailible(piece.color, piece.row, col) == true) {
                int[] move = {piece.row, col};
                possibleMoves.add(move);
            }
            else {
                break;
            }
        }

        return possibleMoves;
        // Col
        // If blocked the rest is unavailble





        // for (int row = 0; row < 8; row++) {
		// 	for (int col = 0; col < 8; col++) {
		// 		if (chessPanel.isSquareAvailible(piece.color, row, col)) {

        //         }
		// 	}
		// }
        // return possibleMoves;
    }
}

