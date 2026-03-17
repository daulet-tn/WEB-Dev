public abstract class Piece {
    //фигура
    Position position;

    public Piece(Position position) {
        this.position = position;
    }

    public abstract boolean isLegalMove(Position b);

}