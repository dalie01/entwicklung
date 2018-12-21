package oracel_OcaSe.O92_Temp.go;

import oracel_OcaSe.O92_Temp.bar.Inner;

public class GoInner {

	public static void main(String[] args) {
		Inner inner = new Inner();
		System.out.println(inner.num);
		inner.new Outer().innerMethod();
	}
	
}
