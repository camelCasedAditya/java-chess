import java.util.ArrayList;

public class Knight extends Piece {

    ArrayList<Integer> possibleMoves = new ArrayList<Integer>();

    public Knight (int color, int row, int col) {
        super(color, row, col);
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