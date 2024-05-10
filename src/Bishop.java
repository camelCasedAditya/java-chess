import java.util.ArrayList;

public class Bishop extends Piece {



    ArrayList<Integer> possibleMoves = new ArrayList<Integer>();

    public Bishop (int color, int square) {
        super(color, square);
    }
    public int getColor() {
        return color;
    }
    public int getCurrentSquare() {
        return square;
    }

    public void setCurrentSquare(int newsquare) {
        this.square = newsquare;
    }

    public ArrayList<Integer> getPossibleMoves() {
        return possibleMoves;
    }
}
