package oracel_OcaSe.O92_Temp;

class Parent {
	
	public int x = new Integer(10);
	
	protected int pMethode(){
		return x;
	}
	
}

class Child extends Parent  {
	
	public static void main(String[] args) {
		new Child().cMethod();
	}
	
	void cMethod(){
		System.out.println(this.pMethode());
		Parent p = new Parent();
		System.out.println(p.pMethode());
	}
}
