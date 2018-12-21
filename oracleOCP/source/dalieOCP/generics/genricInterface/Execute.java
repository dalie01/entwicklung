package dalieOCP.generics.genricInterface;

interface MyMap<K,V> {
	void put (K key, V value);
	V get (K key);
}


class NonExecute implements MyMap<String, Integer>{
	/* 
	 * A nongeneric class can implement a generic interface by
	 * replacing its type parameters with actual types.
	 * */
	
	@Override
	public void put(String key, Integer value) {
		
	}

	@Override
	public Integer get(String key) {
		return null;
	}
	
}


class Execute<K, V> implements MyMap<K, V> {
	/*
	 * To pass the type parameter information to a class, the type parameters must follow
	 * both the name of the class and the interface implemented by the class.
	 * */
	
	@Override
	public void put(K key, V value) {
		
	}

	@Override
	public V get(K key) {
		return null;
	}
	
}


@SuppressWarnings("hiding")
class Execute1<K, String> implements MyMap<K, String> {
	/*
	 * Generic classes and interfaces are collectively referred to as generic types.
	 * */
	
	@Override
	public void put(K key, String value) {
		
	}

	@Override
	public String get(K key) {
		return null;
	}
	
}