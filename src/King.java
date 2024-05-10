import java.util.ArrayList;

public class King extends Piece {
    boolean mate;
    boolean check;

    ArrayList<Integer> possibleMoves = new ArrayList<Integer>();

    public King (int color, int square) {
        super(color, square);
        this.mate = false;
        this.check = false;
    }

    public boolean getMate() {
        return mate;
    }
    public boolean getCheck() {
        return check;
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
