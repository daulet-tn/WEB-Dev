public class Bishop extends Piece {

    public Bishop(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {

        if(Math.abs(position.row - b.row) ==
           Math.abs(position.col - b.col)){
            return true;
        }

        return false;
    }
}