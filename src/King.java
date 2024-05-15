import java.util.ArrayList;

public class King extends Piece {
    boolean mate;
    boolean check;

    ArrayList<int[]> possibleMoves = new ArrayList<int[]>();

    public King (int color, int row, int col) {
        super(color, row, col,"King");
        this.mate = false;
        this.check = false;
        
    }

    public boolean getMate() {
        return mate;
    }
    public boolean getCheck() {
        return check;
    }
public ArrayList<int[]> getPossibleMoves(Piece piece) {
        possibleMoves.clear();
        // Row
        for (int row = piece.row; row < 8; row++) {
            if(App.isSquareAvailible(piece.color, row, piece.col) == true) {
                int[] move = {row, piece.col};
                possibleMoves.add(move);
                if(App.getPiece(row, piece.col) != null) {
                    break;
                }
            }
            else {
                break;
            }
        }
        for (int row = piece.row; row >= 0; row--) {
            if(App.isSquareAvailible(piece.color, row, piece.col) == true) {
                int[] move = {row, piece.col};
                possibleMoves.add(move); 
                if(App.getPiece(row, piece.col) != null) {
                    break;
                }
            }
            else {
                break;
            }
        }

        for (int col = piece.col; col < 8; col++) {
            if(App.isSquareAvailible(piece.color, piece.row, col) == true) {
                int[] move = {piece.row, col};
                possibleMoves.add(move);
                if(App.getPiece(piece.row, col) != null) {
                    break;
                }
            }
            else {
                break;
            }
        }

        for (int col = piece.col; col >= 0; col--) {
            if(App.isSquareAvailible(piece.color, piece.row, col) == true) {
                int[] move = {piece.row, col};
                possibleMoves.add(move);
                if(App.getPiece(piece.row, col) != null) {
                    break;
                }
            }
            else {
                break;
            }
        }

        return possibleMoves;
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

    public ArrayList<int[]> getPossibleMoves() {
        return possibleMoves;
    }
}
