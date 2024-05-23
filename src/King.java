import java.util.ArrayList;

public class King extends Piece {
    boolean mate;
    boolean check;

    ArrayList<int[]> possibleMoves = new ArrayList<int[]>();

    public King (int color, int row, int col) {
        super(color, row, col,"King");
        this.mate = false;
        this.check = false;
        
    }

    public boolean getMate() {
        return mate;
    }
    public boolean getCheck() {
        return check;
    }

    // Function to get possible moves
    public ArrayList<int[]> getPossibleMoves() {
        possibleMoves.clear();
        int r = this.row;
        int c = this.col;
        System.out.println(this.row + "::" + this.col);
        //int[] move = {r, c};
        
        // checks if king can move 1 row up
        if ((r-1) >= 0) {
            int[] pMove = {r - 1, c};
            boolean check = false;
            for (int i = 0; i < App.pieceList.size(); i++) {
                if(App.pieceList.get(i) != this) {
                    if (pieceListContains(App.pieceList.get(i).getPossibleMoves(), pMove) == true) {
                        check = true;
                    }
                }
            }

            if (check == false) {
                if(App.getPiece(r -1, c) != this) {
                    if(App.isSquareAvailible(this.color, r - 1, c) == true) {
                        int[] move = {r - 1, c};
                        possibleMoves.add(move);
                        //System.out.println(move[0] + ":" + move[1]);
                    }
                }
            }
        }

        if ((r+1) < 8) {
            int[] pMove = {r + 1, c};
            boolean check = false;
            for (int i = 0; i < App.pieceList.size(); i++) {
                if(App.pieceList.get(i) != this) {
                    if (pieceListContains(App.pieceList.get(i).getPossibleMoves(), pMove) == true) {
                        check = true;
                    }
                }
            }

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

        if ((c+1) < 8) {
            int[] pMove = {r, c + 1};
            boolean check = false;
            for (int i = 0; i < App.pieceList.size(); i++) {
                if(App.pieceList.get(i) != this) {
                    if (pieceListContains(App.pieceList.get(i).getPossibleMoves(), pMove) == true) {
                        check = true;
                    }
                }
            }

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

        if ((c-1) >= 0) {
            int[] pMove = {r, c - 1};
            boolean check = false;
            for (int i = 0; i < App.pieceList.size(); i++) {
                if(App.pieceList.get(i) != this) {
                    if (pieceListContains(App.pieceList.get(i).getPossibleMoves(), pMove) == true) {
                        check = true;
                    }
                }
            }

            if (check == false) {
                if(App.getPiece(r, c - 1) != this) {
                    System.out.println(App.isSquareAvailible(this.color, r, c - 1));
                    if(App.isSquareAvailible(this.color, r, c - 1) == true) {
                        int[] move = {r, c-1};
                        possibleMoves.add(move);
                        //System.out.println(move[0] + ":" + move[1]);
                    }
                }
            }
        }

        if (((r-1) >= 0) && ((c-1) >= 0)) {
            int[] pMove = {r - 1, c - 1};
            boolean check = false;
            for (int i = 0; i < App.pieceList.size(); i++) {
                if(App.pieceList.get(i) != this) {
                    if (pieceListContains(App.pieceList.get(i).getPossibleMoves(), pMove) == true) {
                        check = true;
                    }
                }
            }

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

        if (((r+1) < 8) && ((c-1) >= 0)) {
            int[] pMove = {r + 1, c - 1};
            boolean check = false;
            for (int i = 0; i < App.pieceList.size(); i++) {
                if(App.pieceList.get(i) != this) {
                    if (pieceListContains(App.pieceList.get(i).getPossibleMoves(), pMove) == true) {
                        check = true;
                    }
                }
            }

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

        if (((r-1) >= 0) && ((c+1) < 8)) {
            int[] pMove = {r - 1, c + 1};
            boolean check = false;
            for (int i = 0; i < App.pieceList.size(); i++) {
                if(App.pieceList.get(i) != this) {
                    if (pieceListContains(App.pieceList.get(i).getPossibleMoves(), pMove) == true) {
                        check = true;
                    }
                }
            }

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

        if (((r+1) < 8) && ((c+1) < 8)) {
            int[] pMove = {r + 1, c + 1};
            boolean check = false;
            for (int i = 0; i < App.pieceList.size(); i++) {
                if (App.pieceList.get(i) != this) {
                    ArrayList<int[]> test = App.pieceList.get(2).getPossibleMoves();
                    // for (int j =0; j<test.size(); j++) {
                    //     System.out.println("check : " + test.get(j)[0] + ":" + test.get(j)[1]);
                    // }
                    System.out.println(App.pieceList.get(i).getPossibleMoves().contains(pMove));
                    if (pieceListContains(App.pieceList.get(i).getPossibleMoves(), pMove) == true) {
                        check = true;
                    }
                }
            }

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

    public boolean pieceListContains(ArrayList<int[]> moveList, int[] inputArray) {
        for (int i = 0; i < moveList.size(); i++) {
            int moveR = moveList.get(i)[0];
            int moveC = moveList.get(i)[1];
            if ((moveR == inputArray[0]) && (moveC == inputArray[1])) {
                return true;
            }
        }

        return false;
    }
}
