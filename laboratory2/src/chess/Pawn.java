package chess;

public class Pawn extends Piece{

	Pawn(Position a) {
		super(a);
	}

	@Override
	public boolean isLegalMove(Position b) {
		if(a.getInt()==2) {
			if(b.getInt()-a.getInt()<=2 && a.getIndex()==b.getIndex()) {
				return true;
			}
		}
		else if(a.getInt()>2) {
			if(b.getInt()-a.getInt()==1 && a.getIndex()==b.getIndex()) {
				return true;
			}
		}
		return false;
	}

}
