public class King extends Piece {

    public King(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {

        if(Math.abs(position.row - b.row) <= 1 &&
           Math.abs(position.col - b.col) <= 1){
            return true;
        }

        return false;
    }
}