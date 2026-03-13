public class Pawn extends Piece {

    public Pawn(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {

        if(b.row == position.row + 1 &&
           b.col == position.col){
            return true;
        }

        return false;
    }
}