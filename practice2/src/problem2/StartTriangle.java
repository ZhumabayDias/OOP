package problem2;

public class StartTriangle {
	public int width;
	
	StartTriangle(int wi){
		this.width = wi;
	}
	public String toString() {
		for(int i=0;i<width;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("[*]");
				
			}System.out.println();
		}return "";
	}
}
