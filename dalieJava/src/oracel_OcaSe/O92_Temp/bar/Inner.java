package oracel_OcaSe.O92_Temp.bar;

public class Inner {
	
	final public int num = 2399;
	
	public class Outer {
		
		public int num = 9932;
		
		public void innerMethod(){
			System.out.println(Inner.this.num);
		}
		
	}
}
