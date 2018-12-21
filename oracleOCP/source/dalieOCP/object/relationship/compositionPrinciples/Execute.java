package dalieOCP.object.relationship.compositionPrinciples;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Engine {}
class B {}

class Car {
	/* composition over inheritance */
	
	/*
	 * You should inherit a class only when you think that the derived class is a type of its base class. 
	 * For example, it’s correct to say that RacingCar is a type of Car. 
	 * But it’s incorrect to say that Engine is a type of Car.
	 * */
	
	/* Car Class is composed of Engine and B */
	Engine e;
	B[] b = new B[5];

	/*
	 * Object composition enables you to use the existing functionality
	 * of classes without extending them. 
	 * */
}

class EncryptedHashSet_I extends HashSet<Object> {
	/*
	 * This implementation is fragile,
	 * 
	 * Since there are only one methods add(), which can insert object into HashSet 
	 * you override these method and called your encrypt() method by overriding add().
	 * 
	 * This automatically covers addAll() as well, because addAll() is implemented using add()
	 * */
	public boolean add(Object o) {
		return super.add(encrypted(o));
	}
	
	public Object encrypted(Object o) {
		return o;
	}
}


class EncryptedHashSet_II implements Set<Object> {
	/*
	 * 
	 * */
	private HashSet<Object> container;
	
	@Override public boolean add(Object e) {
		return container.add(encrypted(e));
	}

	@Override public boolean addAll(Collection<?> c) {
		return container.addAll(encrypted(c));
	}

	public Object encrypted(Object o) {
		return o;
	}
	
	public Collection<?> encrypted(Collection<?> c) {
		return c;
	}
	
	@Override public int size() {
		return container.size();
	}

	@Override public boolean isEmpty() {
		return container.isEmpty();
	}

	@Override public boolean contains(Object o) {
		return container.contains(o);
	}

	@Override public Iterator<Object> iterator() {
		return container.iterator();
	}

	@Override public Object[] toArray() {
		return container.toArray();
	}

	@Override @SuppressWarnings("unchecked")
	public Object[] toArray(Object[] a) {
		return container.toArray(a);
	}

	@Override public boolean remove(Object o) {
		return container.remove(o);
	}

	@Override public boolean containsAll(Collection<?> c) {
		return container.containsAll(c);
	}

	@Override public boolean retainAll(Collection<?> c) {
		return container.retainAll(c);
	}

	@Override public boolean removeAll(Collection<?> c) {
		return container.removeAll(c);
	}

	@Override public void clear() {
		container.clear();
	}
	
} 