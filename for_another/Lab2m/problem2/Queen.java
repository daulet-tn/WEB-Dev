public class Queen extends Piece {

    public Queen(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {

        if(position.row == b.row || position.col == b.col)
            return true;

        if(Math.abs(position.row - b.row) ==
           Math.abs(position.col - b.col))
            return true;

        return false;
    }
}