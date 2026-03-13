public class Main {

    public static void main(String[] args) {

        Board board = new Board();

        Rook rook = new Rook(new Position(0,0));

        board.placePiece(rook,0,0);

        board.printBoard();

        System.out.println("Move rook");

        board.movePiece(new Position(0,0), new Position(0,5));

        board.printBoard();

    }
}