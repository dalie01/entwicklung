package test;

public class Temp_II {

	public static void main(String[] args) {
		A a = new C();
		B b = (B) a;
		System.out.println(a.m1());
		System.out.println(b.i + " " + ((C)a).i);
	}
}

class A {
	int i = 10; int m1(){return i;}
}
class B extends A {
	int i = 20; int m1(){return i;}
}
class C extends B {
	int i = 30; int m1(){return i;}
}