import java.util.ArrayList;

public class King extends Piece {
    boolean mate;
    boolean check;

    ArrayList<Integer> possibleMoves = new ArrayList<Integer>();

    public King (int color, int row, int col) {
        super(color, row, col);
        this.mate = false;
        this.check = false;
    }

    public boolean getMate() {
        return mate;
    }
    public boolean getCheck() {
        return check;
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

    public ArrayList<Integer> getPossibleMoves() {
        return possibleMoves;
    }
}
