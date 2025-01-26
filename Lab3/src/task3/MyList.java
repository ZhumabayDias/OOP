package task3;

import java.util.ArrayList;

public class MyList<D> implements MyCollection<D>{
	ArrayList<D> myList;
	
	MyList(){
		myList = new ArrayList<>();
	}

	@Override
	public int size() {
		return myList.size();
	}

	@Override
	public boolean empty() {
		return myList.isEmpty();
	}

	@Override
	public boolean contains(Object item) {
		return myList.contains(item);
	}

	@Override
	public void clear() {
		myList.clear();
		
	}

	@Override
	public void add(D item) {
		myList.add(item);
		
	}

	@Override
	public void remove(Object item) {
		myList.remove(item);
		
	}

	

	
}
