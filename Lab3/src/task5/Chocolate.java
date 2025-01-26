package task5;

public class Chocolate implements Comparable<Chocolate>{
	int weight;
	String name;
	
	Chocolate(String name,int weight){
		this.weight = weight;
		this.name = name;
	}
	
	public String toString() {
		return "name is "+name+", weight = "+weight;
	}
	
	public int compareTo(Chocolate o) {
		if(this.weight > o.weight) return 1;
		else if(this.weight < o.weight) return -1;
		return 0;
	}
	
	
}
