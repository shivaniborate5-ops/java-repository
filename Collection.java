package SUBCollectionFramework;

public interface Collection {
	//15 method
	void clear();
	boolean add(Object obj);
	boolean addAll(Collection c);
	boolean contains(Object obj);
	boolean containsAll(Collection c);
	boolean equals(Object obj);
	int hashCode();
	boolean isEmpty();
	boolean iterator();
	boolean remove(Object obj);
	boolean removeAll(Collection c);
	boolean retainAll(Collection c);
	int Size();
	Object[]toArray();
	Object[]toArray(Object array[]);
	
}
