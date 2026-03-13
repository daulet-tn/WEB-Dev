public class Knight extends Piece {

    public Knight(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {

        int dr = Math.abs(position.row - b.row);
        int dc = Math.abs(position.col - b.col);

        if((dr == 2 && dc == 1) || (dr == 1 && dc == 2)){
            return true;
        }

        return false;
    }
}