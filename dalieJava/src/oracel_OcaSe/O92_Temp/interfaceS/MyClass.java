package oracel_OcaSe.O92_Temp.interfaceS;

interface MyInterface { 
	short i= 0; 
	void call(); 
} 

public class MyClass implements MyInterface {

	public static void main(String[] args) {
		MyClass t = new MyClass();
		t.call();
	}
	
	@Override
	public void call() {
		
		for(int x = 6; x > i  ; x--){
			
			System.out.println(MyClass.i);
		}
	} 

	
} 
