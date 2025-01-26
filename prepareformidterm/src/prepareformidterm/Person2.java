package prepareformidterm;

public class Person2 {
	private String name;
	private int age;
	Person2(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name!=null && !name.isEmpty())
			this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0)
			this.age = age;
	}
}
