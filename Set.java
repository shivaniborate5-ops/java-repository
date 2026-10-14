package SUBCollectionFramework;

public interface Set {
	//6 method
	Object first();
	Object last();
	void comparator();
	SortedSet headSet(Object end);
	SortedSet subSet(Object start,Object end);
	SortedSet tailsSet(Object start);

}
