import java.util.ArrayList;

public class Pawn extends Piece {

    boolean onStartingSquare;
    boolean enPassantAvailble;

    ArrayList<Integer> possibleMoves = new ArrayList<Integer>();

    public Pawn (int color, int square) {
        super(color, square);
        onStartingSquare = true;
        enPassantAvailble = false;
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
