package chess;

public class Test {
    public static void main(String[] args) {
       Position a = new Position('A',5);
       Position b = new Position('B',6);
       Rook rook = new Rook(a);
       Bishop bishop = new Bishop(a);
       King king = new King(a);
       Knight knight = new Knight(a);
       Pawn pawn = new Pawn(a);
       Queen queen = new Queen(a);
       
       System.out.println(rook.isLegalMove(b));
       System.out.println(bishop.isLegalMove(b));
       System.out.println(king.isLegalMove(b));
       System.out.println(knight.isLegalMove(b));
       System.out.println(pawn.isLegalMove(b));
       System.out.println(queen.isLegalMove(b));
    }
}