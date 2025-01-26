package task3;

import java.util.HashSet;

public class MySet<D> implements MyCollection<D>{
	HashSet<D> mySet;
	MySet(){
		mySet = new HashSet<>();
	}

	public int size() {
		return mySet.size();
	}

	@Override
	public boolean empty() {
		return mySet.isEmpty();
	}

	@Override
	public boolean contains(Object item) {
		return mySet.contains(item);
	}


	public void clear() {
		mySet.clear();
		
	}

	@Override
	public void add(D item) {
		mySet.add(item);
		
	}

	
	public void remove(Object item) {
		mySet.remove(item);
	}
}

