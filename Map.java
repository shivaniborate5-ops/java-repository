package SUBCollectionFramework;

public interface Map {
	//14methods
	void clear();
	boolean containsKey(Object K);
	boolean containsValue(Object V);
	Set entrySet();
	boolean equals(Object obj);
	Object get(Object K);
	int hashCode();
	boolean isEmpty();
	Set KeySet();
	Object put(Object K,Object V);
	void putAll(Map m);
	Object remove(Object K);
	int size();
	Collection Values();
		

}
