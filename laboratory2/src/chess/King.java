package chess;

public class King extends Piece{

	King(Position a) {
		super(a);
	}

	@Override
	public boolean isLegalMove(Position b) {
		if( (Math.abs(a.getIndex() - b.getIndex())==1 && Math.abs(a.getInt()-b.getInt())==1) || (a.getIndex()==b.getIndex() && Math.abs(a.getInt()-b.getInt())==1)) {
			return true;
		}
		return false;
	}

}
