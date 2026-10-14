package SUBCollectionFramework;

public interface List {
	//10 method
	void add(int index,Object obj);
	boolean addAll(int index,Collection c);
	Object get(int index);
	int indexOf(Object obj);
	int lastIndexOf(Object obj);
	Object listIterator();
	Object listIterator(int index);
	Object remove(int index);
	Object set(int index,Object obj);
	List subList(int start,int end);
}
