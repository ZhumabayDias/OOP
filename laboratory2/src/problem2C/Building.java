package problem2C;

import java.util.Objects;

public class Building {
	private int height;
	private String material;
	
	public Building(int height, String material) {
		this.height = height;
		this.material = material;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String toString() {
		return material;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Building build = (Building) obj;
		return height == build.height && Objects.equals(material, build.material);
	}
	public int hashCode() {
		return Objects.hash(height, material);
	}
}
