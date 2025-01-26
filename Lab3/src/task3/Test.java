package task3;

public class Test {

	public static void main(String[] args) {
		MySet<String> mySet =new  MySet<>();
		MyList<String> myList = new MyList<>(); 
		mySet.add("alos");
		mySet.add("kasa");
		mySet.add("moka");
		
		myList.add("alos");
		myList.add("kasa");
		myList.add("moka");
		
		mySet.remove("alos");
		myList.remove("Alos");
		
		System.out.println(mySet.contains("kasa"));
		System.out.println(myList.contains("kasa"));
		
		System.out.println(mySet.empty());
		System.out.println(myList.empty());
		
		System.out.println(myList.size());
		System.out.println(mySet.size());
		
		mySet.clear();
		myList.clear();
		
		System.out.println(mySet.empty());
		System.out.println(myList.empty());
	}

}
