package chess;

public class Queen extends Piece{

	Queen(Position a) {
		super(a);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		if((Math.abs(a.getInt()-b.getInt()) == Math.abs(a.getIndex()-b.getIndex())) || (a.getIndex() == b.getIndex()|| a.getInt()==b.getInt())){
			return true;
		}
		return false;
	}

}
