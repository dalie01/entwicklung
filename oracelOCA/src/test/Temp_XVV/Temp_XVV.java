package test.Temp_XVV;

import java.io.IOException;

interface I {
	String name = "I";
	String getName() throws IOException;
}

class A implements I {
	//public static String name = "A";
	public String name;
	
	static int i = 0;
	int i1 = 0;
	
	static {
		/*
		 * ExceptionInInitializerError may be thrown by the JVM when a static initializer
		 * in your code throws a NullPointerException.
		 * */
		System.out.println("static");
	}
	{
		System.out.println("default");
	}
	
	public A(String name)throws Exception {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

class B extends A {
	
	public B(String name) throws Exception {
		super(name);
		//throw new IOException();
	}
}

public class Temp_XVV {

	final public static void main(String[] args) throws Exception {
		try {
			I iB = new B("Hello");
			I iA = new A("World");
			
			System.out.println("Test");
		} catch (IOException e) {
			//throw new NullPointerException("Exception");
			
		//} catch (NullPointerException e) {	
			//System.out.println("NullPointer");
		
		} catch (Exception e) {
			throw new NullPointerException("Exception");
		
		} finally {
			System.out.println("Finish");
		}
		System.out.println("Here");
	}
	
}
