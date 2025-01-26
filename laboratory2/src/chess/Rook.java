package chess;

public class Rook extends Piece{
	public Rook(Position a) {
		super(a);
	}

	public boolean isLegalMove(Position b) {
		if(a.getIndex() == b.getIndex()|| a.getInt()==b.getInt()) {
			return true;
		}
		return false;
	}
	
}
