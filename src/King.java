import java.util.ArrayList;

public class King {
    boolean mate;
    boolean check;
    int currentSquare;
    int color;

    ArrayList<Integer> possibleMoves = new ArrayList<Integer>();

    public King (int color) {
        this.mate = false;
        this.check = false;
        this.color = color;
        if (color == 1) {
            this.currentSquare = 5;
        }
        else if (color == 1) {
            this.currentSquare = 61;
        }
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
        return currentSquare;
    }

    public void setCurrentSquare(int newsquare) {
        this.currentSquare = newsquare;
    }

    public ArrayList<Integer> getPossibleMoves() {
        return possibleMoves;
    }
}
