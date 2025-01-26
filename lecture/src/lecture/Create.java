package lecture;

public class Create {
	public static void main (String args[]){
		Pencil p1 = new Pencil();
		Pencil.numberOfPencils ++;
		System.out.println(Pencil.numberOfPencils);
		//Result? 1
		Pencil p2 = new Pencil();
		Pencil.numberOfPencils ++;
		System.out.println(p2.numberOfPencils);
		//Result? 2
		System.out.println(p1.numberOfPencils);
		//Result? Again 2!
		}
}
