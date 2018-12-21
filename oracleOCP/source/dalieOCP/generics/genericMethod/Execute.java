package dalieOCP.generics.genericMethod;

interface Map<X, Y> { // generic interface declaration
	
	<T> void mapMaterial(T t); // generic method declaration with its own type parameters
}


interface MyMap<K, V> {
	
	void put (K key, V value);
	
	<V> V get (K key, V value);
}

class MyExecute<T> {
	
	/* For a generic method
	 * its type parameter list is placed just after the access and nonaccess 
	 * modifiers and before its return type,
	 */
	public <S,K,Z> String deliver(S[] e, K k, Z z) {
		return "";
	}
	
	public <I extends Integer> Number deliver(I i) {
//		return Integer.sum(i, 100); Java 8
		return i + 100;
	}
	
	public <I extends Double> Number deliver(I i) {
//		return Double.sum(i, 100.00); Java 8
		return i + 100.0;
	}
	
	@SuppressWarnings("hiding")
	<T> MyExecute(T t) { //also possible generic Constructor
		
	}
}


class Execute {
	
	public static void main(String[] args) {
		
		MyExecute<String> my = new MyExecute<>("Hello");
		
		my.deliver(new String[]{"A","B"}, 5, "Hello");

		my.<Integer>deliver(5);
		double d = (Double)my.<Double>deliver(2.0);
	}
	
}