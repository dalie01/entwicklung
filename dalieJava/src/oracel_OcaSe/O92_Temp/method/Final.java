package oracel_OcaSe.O92_Temp.method;

import java.io.IOException;

interface AInterface{
	String Test = "0";
	void z();
	public abstract void y();
}
class WithFinals implements AInterface {
	// Identical to "private" alone:
	private final void f() {
		System.out.println("WithFinals.f()");
	}

	// Also automatically "final":
	private void g() {
		System.out.println("WithFinals.g()");
	}

	@Override
	public void z() {
		
	}

	@Override
	public void y() {
		
	}
}

class OverridingPrivate extends WithFinals {
	private final void f() {
		System.out.println("OverridingPrivate.f()");
	}
	
	private void g() throws Exception {
		System.out.println("OverridingPrivate.g()");
	}
}


class OverridingPrivate2 extends OverridingPrivate {
	final void f() {
		System.out.println("OverridingPrivate2.f()");
	}

	public void z(){
		
	}
	void g() {
		System.out.println("OverridingPrivate2.g()");
	}
}

class Final{
	
	public static void main(String[] args) {
		OverridingPrivate2 o = new OverridingPrivate2();
		o.f();
		o.g();
		o.z();
		
	}
	
}