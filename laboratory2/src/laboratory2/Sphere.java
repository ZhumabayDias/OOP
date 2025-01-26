package laboratory2;

public class Sphere extends Shape3D{
	private double radius;
	Sphere(double radius){
		this.radius = radius;
	}
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 4/3 * Math.PI * radius * radius * radius;
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return 4*Math.PI*radius*radius;
	}

}
