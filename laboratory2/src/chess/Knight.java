package chess;

public class Knight extends Piece{

	Knight(Position a) {
		super(a);
	}

	@Override
	public boolean isLegalMove(Position b) {
		if( (Math.abs(b.getIndex()-a.getIndex()) == 1 && Math.abs(b.getInt()-a.getInt())==2 ) || (Math.abs(b.getIndex()-a.getIndex()) == 2 && Math.abs(b.getInt()-a.getInt())==1 )  ) {
			return true;
		}
		return false;
	}

}
