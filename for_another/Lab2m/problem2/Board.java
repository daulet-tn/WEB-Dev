public class Board {

    Piece[][] board = new Piece[8][8];

    public void placePiece(Piece p, int row, int col) {
        board[row][col] = p;
    }
    public void printBoard(){

        for(int i=0;i<8;i++){

            for(int j=0;j<8;j++){

                if(board[i][j] == null){
                    System.out.print(". ");
                }else{
                    System.out.print("P ");
                }

            }

            System.out.println();
        }
    }

    public void movePiece(Position from, Position to) {

        Piece p = board[from.row][from.col];

        if(p == null){
            System.out.println("No piece here");
            return;
        }

        if(p.isLegalMove(to)){
            board[to.row][to.col] = p;
            board[from.row][from.col] = null;
            p.position = to;

            System.out.println("Move done");
        }else{
            System.out.println("Illegal move");
        }
    }

}