//package App;
import java.util.ArrayList;

public class King extends Piece {
    boolean mate;
    boolean check;

    String symbol;

    ArrayList<int[]> possibleMoves = new ArrayList<int[]>();

    public King (int color, int row, int col) {
        super(color, row, col,"King");
        this.mate = false;
        this.check = false;

        if (color == 1) {
            symbol = "♔";
        }
        else{
            symbol="♚";
        }
        
    }

    public String getSymbol() {
        return symbol;
    }

    public boolean getMate() {
        return mate;
    }
    public boolean getCheck() {
        return check;
    }

    public boolean isInMate() {
        ArrayList<int[]> mateList = this.getPossibleMoves();
        int[] move = {this.row, this.col};
        
        if (mateList.size() == 0) {
        	for (int i = 0; i < App.pieceList.size(); i++) {
        		if(App.pieceList.get(i).getPieceName().equals("King") == false) {
                    if ((pieceListContains(App.pieceList.get(i).getPossibleMoves(), move) == true)  && (App.pieceList.get(i).getColor() != this.color)) {
                        this.mate = true;
                        return true;
                    }
                }
        	}
        }
        return false;
    }

    // Function to get possible moves
    public ArrayList<int[]> getPossibleMoves() {
        possibleMoves.clear();
        int r = this.row;
        int c = this.col;
        //System.out.println(this.row + "::" + this.col);
        //int[] move = {r, c};
        
        // checks if king can move 1 row up
        if ((r-1) >= 0) {
            // Move that we are checking
            int[] pMove = {r - 1, c};
            boolean check = false;
            this.setRow(r-1);
            // loops through every piece on the board
            for (int i = 0; i < App.pieceList.size(); i++) {
                // if piece is not this piece
                if(App.pieceList.get(i).getPieceName().equals("King") == false) {
                    // If that piece can move to this possible square (meaning a check on the king)
                    if ((pieceListContains(App.pieceList.get(i).getPossibleMoves(), pMove) == true)  && (App.pieceList.get(i).getColor() != this.color)) {
                        // Say that there would be a check if the king moved there making it an illegal move
                        check = true;
                    }
                }
            }
            this.setRow(r);
            // If there is no check then we see if there are any pieces on that square
            if (check == false) {
                if(App.getPiece(r -1, c) != this) {
                    // If that square is availble we add the move to the possible moves arraylist
                    if(App.isSquareAvailible(this.color, r - 1, c) == true) {
                        int[] move = {r - 1, c};
                        possibleMoves.add(move);
                        //System.out.println(move[0] + ":" + move[1]);
                    }
                }
            }
        }

        // Same as previous if statement
        if ((r+1) < 8) {
            int[] pMove = {r + 1, c};
            boolean check = false;
            this.setRow(r+1);
            for (int i = 0; i < App.pieceList.size(); i++) {
                if(App.pieceList.get(i).getPieceName().equals("King") == false) {
                    if ((pieceListContains(App.pieceList.get(i).getPossibleMoves(), pMove) == true)  && (App.pieceList.get(i).getColor() != this.color)) {
                        check = true;
                    }
                }
            }
            this.setRow(r);
            if (check == false) {
                if(App.getPiece(r + 1, c) != this) {
                    if(App.isSquareAvailible(this.color, r + 1, c) == true) {
                        int[] move = {r+1, c};
                        possibleMoves.add(move);
                       //System.out.println(move[0] + ":" + move[1]);
                    }
                }
            }
        }
        // Same as previous if statement
        if ((c+1) < 8) {
            int[] pMove = {r, c + 1};
            boolean check = false;
            this.setCol(c+1);
            for (int i = 0; i < App.pieceList.size(); i++) {
                if(App.pieceList.get(i).getPieceName().equals("King") == false) {
                    if ((pieceListContains(App.pieceList.get(i).getPossibleMoves(), pMove) == true)  && (App.pieceList.get(i).getColor() != this.color)) {
                        check = true;
                    }
                }
            }
            
            this.setCol(c);

            if (check == false) {
                if(App.getPiece(r, c + 1) != this) {
                    if(App.isSquareAvailible(this.color, r, c + 1) == true) {
                        int[] move = {r, c+1};
                        possibleMoves.add(move);
                        //System.out.println(move[0] + ":" + move[1]);
                    }
                }
            }
        }
        // Same as previous if statement
        if ((c-1) >= 0) {
            int[] pMove = {r, c - 1};
            boolean check = false;
            this.setCol(c-1);
            for (int i = 0; i < App.pieceList.size(); i++) {
                if(App.pieceList.get(i).getPieceName().equals("King") == false) {
                    if ((pieceListContains(App.pieceList.get(i).getPossibleMoves(), pMove) == true)  && (App.pieceList.get(i).getColor() != this.color)) {
                        check = true;
                    }
                }
            }
            this.setCol(c);
            if (check == false) {
                if(App.getPiece(r, c - 1) != this) {
                    //System.out.println(App.isSquareAvailible(this.color, r, c - 1));
                    if(App.isSquareAvailible(this.color, r, c - 1) == true) {
                        int[] move = {r, c-1};
                        possibleMoves.add(move);
                        //System.out.println(move[0] + ":" + move[1]);
                    }
                }
            }
        }
        // Same as previous if statement
        if (((r-1) >= 0) && ((c-1) >= 0)) {
        	this.setRow(r-1);
        	this.setCol(c-1);
            int[] pMove = {r - 1, c - 1};
            boolean check = false;
            for (int i = 0; i < App.pieceList.size(); i++) {
                if(App.pieceList.get(i).getPieceName().equals("King") == false) {
                    if ((pieceListContains(App.pieceList.get(i).getPossibleMoves(), pMove) == true)  && (App.pieceList.get(i).getColor() != this.color)) {
                        check = true;
                    }
                }
            }
            this.setRow(r);
        	this.setCol(c);
            if (check == false) {
                if(App.getPiece(r-1, c-1) != this) {
                    if(App.isSquareAvailible(this.color, r-1, c-1) == true) {
                        int[] move = {r - 1, c - 1};
                        possibleMoves.add(move);
                        //System.out.println(move[0] + ":" + move[1]);
                    }
                }
            }
        }
        // Same as previous if statement
        if (((r+1) < 8) && ((c-1) >= 0)) {
        	this.setRow(r+1);
        	this.setCol(c-1);
            int[] pMove = {r + 1, c - 1};
            boolean check = false;
            for (int i = 0; i < App.pieceList.size(); i++) {
                if(App.pieceList.get(i).getPieceName().equals("King") == false) {
                    if ((pieceListContains(App.pieceList.get(i).getPossibleMoves(), pMove) == true)  && (App.pieceList.get(i).getColor() != this.color)) {
                        check = true;
                    }
                }
            }

            this.setRow(r);
        	this.setCol(c);
            
            if (check == false) {
                if(App.getPiece(r+1, c-1) != this) {
                    if(App.isSquareAvailible(this.color, r+1, c-1) == true) {
                        int[] move = {r+1, c-1};
                        possibleMoves.add(move);
                        //System.out.println(move[0] + ":" + move[1]);
                    }
                }
            }
        }
        // Same as previous if statement
        if (((r-1) >= 0) && ((c+1) < 8)) {
            int[] pMove = {r - 1, c + 1};
            boolean check = false;
            
            this.setRow(r-1);
        	this.setCol(c+1);
            
            for (int i = 0; i < App.pieceList.size(); i++) {
                if(App.pieceList.get(i).getPieceName().equals("King") == false) {
                    if ((pieceListContains(App.pieceList.get(i).getPossibleMoves(), pMove) == true)  && (App.pieceList.get(i).getColor() != this.color)) {
                        check = true;
                    }
                }
            }

            this.setRow(r);
        	this.setCol(c);
            
            if (check == false) {
                if(App.getPiece(r-1, c+1) != this) {
                    if(App.isSquareAvailible(this.color, r-1, c+1) == true) {
                        int[] move = {r-1, c+1};
                        possibleMoves.add(move);
                        //System.out.println(move[0] + ":" + move[1]);
                    }
                }
            }
        }
        // Same as previous if statement
        if (((r+1) < 8) && ((c+1) < 8)) {
            int[] pMove = {r + 1, c + 1};
            boolean check = false;
            
            this.setRow(r+1);
        	this.setCol(c+1);
            
            for (int i = 0; i < App.pieceList.size(); i++) {
                if (App.pieceList.get(i).getPieceName().equals("King") == false) {
                    ArrayList<int[]> test = App.pieceList.get(2).getPossibleMoves();
                    // for (int j =0; j<test.size(); j++) {
                    //     System.out.println("check : " + test.get(j)[0] + ":" + test.get(j)[1]);
                    // }
                    //System.out.println(App.pieceList.get(i).getPossibleMoves().contains(pMove));
                    if ((pieceListContains(App.pieceList.get(i).getPossibleMoves(), pMove) == true)  && (App.pieceList.get(i).getColor() != this.color)) {
                        check = true;
                    }
                }
            }

            this.setRow(r);
        	this.setCol(c);
            
            if (check == false) {
                if(App.getPiece(r+1, c+1) != this) {
                    if(App.isSquareAvailible(this.color, r+1, c+1) == true) {
                        int[] move = {r + 1 , c + 1};
                        possibleMoves.add(move);
                        //System.out.println(move[0] + ":" + move[1]);
                    }
                }
            }
        }

        return possibleMoves;
    }

    // Function that checks if a move array has the same values as a move array inside of the possible moves arraylist
    public static boolean pieceListContains(ArrayList<int[]> moveList, int[] inputArray) {
        for (int i = 0; i < moveList.size(); i++) {
            int moveR = moveList.get(i)[0];
            int moveC = moveList.get(i)[1];
            if ((moveR == inputArray[0]) && (moveC == inputArray[1])) {
                return true;
            }
        }

        return false;
    }

    public int numberOfPossibleMoves() {
        possibleMoves = this.getPossibleMoves();
        return possibleMoves.size();
    }

    public boolean isInCheck() {
        ArrayList<int[]> checkList = this.getPossibleMoves();
        int[] move = {this.row, this.col};
        for (int i = 0; i < App.pieceList.size(); i++) {
        	if(App.pieceList.get(i).getPieceName().equals("King") == false) {
                if ((pieceListContains(App.pieceList.get(i).getPossibleMoves(), move) == true)  && (App.pieceList.get(i).getColor() != this.color)) {
                    return true;
                }
            }
        }

        return false;
    }
}