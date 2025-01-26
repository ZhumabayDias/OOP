package chess;

public class Position {
	private char index1;
	private int index2;
	
	Position(char index1 , int index2){
			this.index1 = index1;
			this.index2 = index2;
	}
	public char getIndex() {
		return index1;
	}
	public int getInt(){
		return index2;
	}
	
}
