import java.util.ArrayList;

public class Piece {
    int color;
    int row;
    int col;

    ArrayList<Integer> possibleMoves = new ArrayList<Integer>();

    public Piece(int pieceColor, int row, int col) {
        this.color = pieceColor;
        this.row = row;
        this.col = col;
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


    // public static addPiece

}