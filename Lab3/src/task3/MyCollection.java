package task3;

public interface MyCollection<D> {
	int size();
	boolean empty();
	boolean contains(D item);
	void clear();
	void add(D item);
	void remove(D item);
}
