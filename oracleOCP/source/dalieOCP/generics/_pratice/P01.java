package dalieOCP.generics._pratice;

import java.util.List;

/*
 * It specifies type parameters (or type variables)
 * T1,T1 and Tn.
 * A Type variable can be any non-primitive type
 * any class, any interface or array type  
 * */
class NAME<T1,T2,Tn>{}

class A<X,Y extends X>{
	
	private X x;
	
	public void set(Y y) {
		this.x = y;
	}
	
	public X get() {
		return x;
	}
}

class B{}
class C extends B{}
class D{}

//class E extends A<B,C>{}
class E extends A<B,C>{}

final class P01 {

	@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	public static void main(String args[]) {
		A a = new A();//The class can be used without any arguments types (this is called a raw type).
		A<D,D> a1 = new A();
		A a2 = new A<D,D>();
		A<D,D> a3 = new A<D,D>();
//		A<X,Y> a2 = new A<X,Y>();
		A a4 = new A<Object, A<B,C>>();
		A a5 = new A<Object, List<Integer>>();
	}
}