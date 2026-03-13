public abstract class Piece {

    Position position;

    public Piece(Position position) {
        this.position = position;
    }

    public abstract boolean isLegalMove(Position b);

}