import java.util.ArrayList;

public class Knight extends Piece {

    String symbol;

    ArrayList<int[]> possibleMoves = new ArrayList<int[]>();

    public Knight (int color, int row, int col) {
        super(color, row, col, "Knight");

        if (color == 1) {
            symbol = "♘";
        }
        else{
            symbol="♞";
        }
    }

    public String getSymbol() {
        return symbol;
    }
    
    public ArrayList<int[]> getPossibleMoves() {

        possibleMoves.clear();

        int r = this.row;
        int c = this.col;

        //1
        if (((this.row - 2) >= 0) && ((this.col - 1) >= 0)) {
            r = this.row - 2;
            c = this.col - 1;
            if(App.getPiece(r, c) != this) {
                if(App.isSquareAvailible(this.color, r, c) == true) {
                    int[] move = {r, c};
                    possibleMoves.add(move);
                    //System.out.println(move[0] + ":" + move[1]);
                    
                }
            }
        }

        //2
        if (((this.row - 2) >= 0) && ((this.col + 1) < 8)) {
            r = this.row - 2;
            c = this.col + 1;
            if(App.getPiece(r, c) != this) {
                if(App.isSquareAvailible(this.color, r, c) == true) {
                    int[] move = {r, c};
                    possibleMoves.add(move);
                    //System.out.println(move[0] + ":" + move[1]);
                    
                }
            }
        }

        //3
        if (((this.row + 2) < 8) && ((this.col - 1) >= 0)) {
            r = this.row + 2;
            c = this.col - 1;
            if(App.getPiece(r, c) != this) {
                if(App.isSquareAvailible(this.color, r, c) == true) {
                    int[] move = {r, c};
                    possibleMoves.add(move);
                    //System.out.println(move[0] + ":" + move[1]);
                    
                }
            }
        }

        //4
        if (((this.row + 2) < 8) && ((this.col + 1) < 8)) {
            r = this.row + 2;
            c = this.col + 1;
            if(App.getPiece(r, c) != this) {
                if(App.isSquareAvailible(this.color, r, c) == true) {
                    int[] move = {r, c};
                    possibleMoves.add(move);
                    //System.out.println(move[0] + ":" + move[1]);
                    
                }
            }
        }

        //5
        if (((this.row + 1) < 8) && ((this.col + 2) < 8)) {
            r = this.row + 1;
            c = this.col + 2;
            if(App.getPiece(r, c) != this) {
                if(App.isSquareAvailible(this.color, r, c) == true) {
                    int[] move = {r, c};
                    possibleMoves.add(move);
                    //System.out.println(move[0] + ":" + move[1]);
                    
                }
            }
        }

        //6
        if (((this.row - 1) >= 0) && ((this.col + 2) < 8)) {
            r = this.row - 1;
            c = this.col + 2;
            if(App.getPiece(r, c) != this) {
                if(App.isSquareAvailible(this.color, r, c) == true) {
                    int[] move = {r, c};
                    possibleMoves.add(move);
                    //System.out.println(move[0] + ":" + move[1]);
                    
                }
            }
        }

        //7
        if (((this.row + 1) < 8) && ((this.col - 2) >= 0)) {
            r = this.row + 1;
            c = this.col - 2;
            if(App.getPiece(r, c) != this) {
                if(App.isSquareAvailible(this.color, r, c) == true) {
                    int[] move = {r, c};
                    possibleMoves.add(move);
                    //System.out.println(move[0] + ":" + move[1]);
                    
                }
            }
        }

        //8
        if (((this.row - 1) >= 0) && ((this.col - 2) >= 0)) {
            r = this.row - 1;
            c = this.col - 2;
            if(App.getPiece(r, c) != this) {
                if(App.isSquareAvailible(this.color, r, c) == true) {
                    int[] move = {r, c};
                    possibleMoves.add(move);
                    //System.out.println(move[0] + ":" + move[1]);
                    
                }
            }
        }

        return possibleMoves;
    }
    public int numberOfPossibleMoves() {
        possibleMoves = this.getPossibleMoves();
        return possibleMoves.size();
    }
}