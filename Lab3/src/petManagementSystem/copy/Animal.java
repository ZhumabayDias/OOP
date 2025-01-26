package petManagementSystem.copy;

public abstract  class Animal {
	private String name;
	private int age;
	Animal(String name,int age){
		this.age = age;
		this.name = name;
	}
	public abstract String getSound();
	
	 public String toString() {
	        return name;
	    }
}
