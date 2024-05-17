import java.util.ArrayList;

public class Queen extends Piece{
    ArrayList<int[]> possibleMoves = new ArrayList<int[]>();    

    public Queen (int color, int row, int col) {
        super(color, row, col, "Queen");
    }

    public ArrayList<int[]> getPossibleMoves() {
        possibleMoves.clear();
        // Row
        for (int r = this.row; r < 8; r++) {
            if(App.getPiece(r, this.col) != this) {
                if(App.isSquareAvailible(this.color, r, this.col) == true) {
                    int[] move = {r, this.col};
                    possibleMoves.add(move);
                    //System.out.println(move[0] + ":" + move[1]);
                    if((App.getPiece(r, this.col) != null) && (App.getPiece(r, this.col).getColor() != this.color)) {
                        break;
                    }
                }
                else {
                    break;
                }
            }
        }
        for (int r = this.row; r >= 0; r--) {
            if(App.getPiece(r, this.col) != this) {
                if(App.isSquareAvailible(this.color, r, this.col) == true) {
                    int[] move = {r, this.col};
                    possibleMoves.add(move);
                    //System.out.println(move[0] + ":" + move[1]);
                    if((App.getPiece(r, this.col) != null) && (App.getPiece(r, this.col).getColor() != this.color)) {
                        break;
                    }
                }
                else {
                    break;
                }
            }
        }

        for (int c = this.col; c < 8; c++) {
            if(App.getPiece(this.row, c) != this) {
                if(App.isSquareAvailible(this.color, this.row, c) == true) {
                    int[] move = {this.row, c};
                    possibleMoves.add(move);
                    //System.out.println(move[0] + ":" + move[1]);
                    if((App.getPiece(this.row, c) != null) && (App.getPiece(this.row, c).getColor() != this.color)) {
                        break;
                    }
                }
                else {
                    break;
                }
            }
        }

        for (int c = this.col; c >= 0; c--) {
            if(App.getPiece(this.row, c) != this) {
                if(App.isSquareAvailible(this.color, this.row, c) == true) {
                    int[] move = {this.row, c};
                    possibleMoves.add(move);
                    //System.out.println(move[0] + ":" + move[1]);
                    if((App.getPiece(this.row, c) != null) && (App.getPiece(this.row, c).getColor() != this.color)) {
                        break;
                    }
                }
                else {
                    break;
                }
            }
        }

        int r = this.row;
        int c = this.col;
        
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
