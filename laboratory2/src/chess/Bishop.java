package chess;

public class Bishop extends Piece{

	Bishop(Position a) {
		super(a);
	}

	@Override
	public boolean isLegalMove(Position b) {
		if(Math.abs(a.getInt()-b.getInt()) == Math.abs(a.getIndex()-b.getIndex())) {
			return true;
		}
		return false;
	}
	
}
