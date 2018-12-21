package dalieOCP.generics.genericClass;


/*
 * A Generic Type is generic Class or Interface, having
 * on or more type parameters in this declaration.
 * 
 * <T0> is Type parameter T0
 * */
class A<T0,T1> {
	/*
	 * A type parameter can be used in the declaration of classes,
	 * variables, method parameters, and method return types.
	 * */	
	private T0 i;
	private T1 s;
	
	A(T0 i) {
		this.i = i;
	}
	
	public T0 getT0(){
		return i;
	}
	
	public void setT1(T1 t1){
		s = t1;
	}
	
	public T1 getT1() {
		return s;
	}
}

class B<X, T0, T1> extends A<T0, T1> {

	/*
	 * A type argument must be passed to the type parameter of a base
	 * class. You can do so while extending the base class or while instantiating
	 * the derived class.
	 * 
	 * */
	
	B(T0 i) {
		super(i);
	}
	
}

class Execute {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		A<Integer,String> i0 = new A<>(5);
		int i1 = i0.getT0();
		String s1 = i0.getT1();
		
		A<String,Integer> s0 = new A<>(String.valueOf(5));
		String s2 = s0.getT0();
//		int i2 = s0.getT1();
		
		A i3 = new A<Integer,String>(6);//is also allow
		i3.setT1("Hello");//warning
		System.out.println(i3.getT1());
		
		A<Integer, String> i4 = new A(8);//warning;
		
		B<Integer,String,Integer> b0 = new B<>("2");
		A<String, Integer> sB = new B<Integer,String,Integer>("2");
		A<String, Integer> sB1 = new B<>("2");
	}
}
