import java.util.ArrayList;

public class Bishop extends Piece {



    ArrayList<int[]> possibleMoves = new ArrayList<int[]>();

    public Bishop (int color, int row, int col) {
        super(color, row, col,"Bishop");
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
        int r = this.row;
        int c = this.col;
        possibleMoves.clear();
        
        while((r < 8) && (c < 8)) {

            if(App.getPiece(r, c) != this) {
                if(App.isSquareAvailible(this.color, r, c) == true) {
                    int[] move = {r, c};
                    possibleMoves.add(move);
                    //System.out.println(move[0] + ":" + move[1]);
                    if((App.getPiece(r, c) != null) && (App.getPiece(r, c).getColor() != this.color)) {
                        break;
                    }
                }
                else {
                    break;
                }
            }

            r++;
            c++;

        }

        r = this.row;
        c = this.col;
        while((r >= 0) && (c < 8)) {

            if(App.getPiece(r, c) != this) {
                if(App.isSquareAvailible(this.color, r, c) == true) {
                    int[] move = {r, c};
                    possibleMoves.add(move);
                    //System.out.println(move[0] + ":" + move[1]);
                    if((App.getPiece(r, c) != null) && (App.getPiece(r, c).getColor() != this.color)) {
                        break;
                    }
                }
                else {
                    break;
                }
            }

            r--;
            c++;

        }
        
        r = this.row;
        c = this.col;
        while((r >= 0) && (c >= 0)) {

            if(App.getPiece(r, c) != this) {
                if(App.isSquareAvailible(this.color, r, c) == true) {
                    int[] move = {r, c};
                    possibleMoves.add(move);
                    //System.out.println(move[0] + ":" + move[1]);
                    if((App.getPiece(r, c) != null) && (App.getPiece(r, c).getColor() != this.color)) {
                        break;
                    }
                }
                else {
                    break;
                }
            }

            r--;
            c--;

        }
        r = this.row;
        c = this.col;
        System.out.println(r);
        System.out.println(c);
        while((r < 8) && (c >= 0)) {
            System.out.println(r);

            if(App.getPiece(r, c) != this) {
                if(App.isSquareAvailible(this.color, r, c) == true) {
                    int[] move = {r, c};
                    possibleMoves.add(move);
                    //System.out.println(move[0] + ":" + move[1]);
                    if((App.getPiece(r, c) != null) && (App.getPiece(r, c).getColor() != this.color)) {
                        break;
                    }
                }
                else {
                    break;
                }
            }

            r++;
            c--;

        }
        return possibleMoves;
    }
}
