import java.util.ArrayList;

public class Rook extends Piece {

    ArrayList<int[]> possibleMoves = new ArrayList<int[]>();    

    public Rook (int color, int row, int col) {
        super(color, row, col, "Rook");
    }

    public ArrayList<int[]> getPossibleMoves() {
        possibleMoves.clear();
        // Row
        for (int row = this.row; row < 8; row++) {
            if(App.isSquareAvailible(this.color, row, this.col) == true) {
                int[] move = {row, this.col};
                possibleMoves.add(move);
                System.out.println(move[0] + ":" + move[1]);
                if(App.getPiece(row, this.col) != null) {
                    break;
                }
            }
            else {
                break;
            }
        }
        for (int row = this.row; row >= 0; row--) {
            if(App.isSquareAvailible(this.color, row, this.col) == true) {
                int[] move = {row, this.col};
                possibleMoves.add(move); 
                System.out.println(move[0] + ":" + move[1]);
                if(App.getPiece(row, this.col) != null) {
                    break;
                }
            }
            else {
                break;
            }
        }

        for (int col = this.col; col < 8; col++) {
            if(App.isSquareAvailible(this.color, this.row, col) == true) {
                int[] move = {this.row, col};
                possibleMoves.add(move);
                System.out.println(move[0] + ":" + move[1]);
                if(App.getPiece(this.row, col) != null) {
                    break;
                }
            }
            else {
                break;
            }
        }

        for (int col = this.col; col >= 0; col--) {
            if(App.isSquareAvailible(this.color, this.row, col) == true) {
                int[] move = {this.row, col};
                possibleMoves.add(move);
                System.out.println(move[0] + ":" + move[1]);
                if(App.getPiece(this.row, col) != null) {
                    break;
                }
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

