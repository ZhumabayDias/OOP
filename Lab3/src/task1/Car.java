package task1;

public abstract class Car {
	String model;
	String color;
	Car(String model,String color){
		this.model = model;
		this.color = color;
	}
	abstract void CanMove();
	abstract void increaseVelocity();
	abstract void showVelocity();
	
	void needRepair() {
		System.out.println("It needs to be repaired");
	}
	
}
