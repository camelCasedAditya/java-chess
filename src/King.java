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
    public ArrayList<int[]> getPossibleMoves() {
        possibleMoves.clear();
        int r = this.row;
        int c = this.col;
        //int[] move = {r, c};
        

        if ((r-1) >= 0) {
            int[] pMove = {r - 1, c};
            boolean check = false;
            // System.out.println(App.pieceList.size());
            for (int i = 0; i < App.pieceList.size(); i++) {
                //System.out.println(App.pieceList.get(i).getPossibleMoves().contains(pMove));
                if(App.pieceList.get(i) != this) {
                    if (App.pieceList.get(i).getPossibleMoves().contains(pMove) == true) {
                        check = true;
                    }
                }
            }

            if (check == false) {
                if(App.getPiece(r -1, c) != this) {
                    if(App.isSquareAvailible(this.color, r - 1, c) == true) {
                        int[] move = {r, c};
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
                    if (App.pieceList.get(i).getPossibleMoves().contains(pMove) == true) {
                        check = true;
                    }
                }
            }

            if (check == false) {
                if(App.getPiece(r + 1, c) != this) {
                    if(App.isSquareAvailible(this.color, r + 1, c) == true) {
                        int[] move = {r, c};
                        possibleMoves.add(move);
                        System.out.println(move[0] + ":" + move[1]);
                    }
                }
            }
        }

        if ((c+1) < 8) {
            int[] pMove = {r, c + 1};
            boolean check = false;
            for (int i = 0; i < App.pieceList.size(); i++) {
                if(App.pieceList.get(i) != this) {
                    if (App.pieceList.get(i).getPossibleMoves().contains(pMove) == true) {
                        check = true;
                    }
                }
            }

            if (check == false) {
                if(App.getPiece(r, c + 1) != this) {
                    if(App.isSquareAvailible(this.color, r, c + 1) == true) {
                        int[] move = {r, c};
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
                    if (App.pieceList.get(i).getPossibleMoves().contains(pMove) == true) {
                        check = true;
                    }
                }
            }

            if (check == false) {
                if(App.getPiece(r, c - 1) != this) {
                    if(App.isSquareAvailible(this.color, r, c - 1) == true) {
                        int[] move = {r, c};
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
                    if (App.pieceList.get(i).getPossibleMoves().contains(pMove) == true) {
                        check = true;
                    }
                }
            }

            if (check == false) {
                if(App.getPiece(r-1, c-1) != this) {
                    if(App.isSquareAvailible(this.color, r-1, c-1) == true) {
                        int[] move = {r, c};
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
                    if (App.pieceList.get(i).getPossibleMoves().contains(pMove) == true) {
                        check = true;
                    }
                }
            }

            if (check == false) {
                if(App.getPiece(r+1, c-1) != this) {
                    if(App.isSquareAvailible(this.color, r+1, c-1) == true) {
                        int[] move = {r, c};
                        possibleMoves.add(move);
                        //System.out.println(move[0] + ":" + move[1]);
                    }
                }
            }
        }

        if (((r-1) >= 0) && ((c+1) < 8)) {
            int[] pMove = {r + 1, c - 1};
            boolean check = false;
            for (int i = 0; i < App.pieceList.size(); i++) {
                if(App.pieceList.get(i) != this) {
                    if (App.pieceList.get(i).getPossibleMoves().contains(pMove) == true) {
                        check = true;
                    }
                }
            }

            if (check == false) {
                if(App.getPiece(r-1, c+1) != this) {
                    if(App.isSquareAvailible(this.color, r-1, c+1) == true) {
                        int[] move = {r, c};
                        possibleMoves.add(move);
                        //System.out.println(move[0] + ":" + move[1]);
                    }
                }
            }
        }

        if (((r+1) < 8) && ((c+1) < 8)) {
            int[] pMove = {r + 1, c - 1};
            boolean check = false;
            for (int i = 0; i < App.pieceList.size(); i++) {
                if (App.pieceList.get(i) != this) {
                    if (App.pieceList.get(i).getPossibleMoves().contains(pMove) == true) {
                        check = true;
                    }
                }
            }

            if (check == false) {
                if(App.getPiece(r+1, c+1) != this) {
                    if(App.isSquareAvailible(this.color, r+1, c+1) == true) {
                        int[] move = {r, c};
                        possibleMoves.add(move);
                        //System.out.println(move[0] + ":" + move[1]);
                    }
                }
            }
        }

        return possibleMoves;
    }
}
