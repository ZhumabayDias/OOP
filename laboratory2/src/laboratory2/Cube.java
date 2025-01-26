package laboratory2;

public class Cube extends Shape3D{
	private double sizeLength;
	Cube(double size){
		this.sizeLength = size;
	}
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return sizeLength * sizeLength * sizeLength;
	}
	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return 6 * sizeLength * sizeLength;
	}

}
