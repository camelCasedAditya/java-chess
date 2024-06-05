import java.util.ArrayList;

public class Rook extends Piece {

    ArrayList<int[]> possibleMoves = new ArrayList<int[]>();    

    public Rook (int color, int row, int col) {
        super(color, row, col, "Rook");
    }

    public ArrayList<int[]> getPossibleMoves() {
        possibleMoves.clear();
        // Row
        for (int r = this.row; r < 8; r++) {
            if(App.getPiece(r, this.col) != this) {
                if(App.isSquareAvailible(this.color, r, this.col) == true) {
                    int[] move = {r, this.col};
                    possibleMoves.add(move);
                    //System.out.println(move[0] + ":" + move[1]);
                    if((App.getPiece(r, this.col) != null) && (App.getPiece(r, this.col).getColor() != this.color)) {
                        break;
                    }
                }
                else {
                    break;
                }
            }
        }
        for (int r = this.row; r >= 0; r--) {
            if(App.getPiece(r, this.col) != this) {
                if(App.isSquareAvailible(this.color, r, this.col) == true) {
                    int[] move = {r, this.col};
                    possibleMoves.add(move);
                    //System.out.println(move[0] + ":" + move[1]);
                    if((App.getPiece(r, this.col) != null) && (App.getPiece(r, this.col).getColor() != this.color)) {
                        break;
                    }
                }
                else {
                    break;
                }
            }
        }

        for (int c = this.col; c < 8; c++) {
            if(App.getPiece(this.row, c) != this) {
                if(App.isSquareAvailible(this.color, this.row, c) == true) {
                    int[] move = {this.row, c};
                    possibleMoves.add(move);
                    //System.out.println(move[0] + ":" + move[1]);
                    if((App.getPiece(this.row, c) != null) && (App.getPiece(this.row, c).getColor() != this.color)) {
                        break;
                    }
                }
                else {
                    break;
                }
            }
        }

        for (int c = this.col; c >= 0; c--) {
            if(App.getPiece(this.row, c) != this) {
                if(App.isSquareAvailible(this.color, this.row, c) == true) {
                    int[] move = {this.row, c};
                    possibleMoves.add(move);
                    //System.out.println(move[0] + ":" + move[1]);
                    if((App.getPiece(this.row, c) != null) && (App.getPiece(this.row, c).getColor() != this.color)) {
                        break;
                    }
                }
                else {
                    break;
                }
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

    public int numberOfPossibleMoves() {
        possibleMoves = this.getPossibleMoves();
        return possibleMoves.size();
    }
}

