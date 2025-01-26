package petManagementSystem;

public abstract  class Animal implements CanRunAway,Cloneable{
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
	 public void canRunAway(){
		 System.out.println("(I ran away from you, don't wait for me anymore.)");
	 }
	 
	 public Object clone() throws CloneNotSupportedException {
		 return super.clone();
	 }
}
