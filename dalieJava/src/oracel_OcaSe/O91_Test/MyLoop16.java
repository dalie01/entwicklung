package oracel_OcaSe.O91_Test;

public class MyLoop16 {
	int x = 5;
	int getX(){ return x;}
	
	public static void main(String[] args) {
		MyLoop16 my = new MyLoop16();
		my.looper();
		System.out.println(my.x);
	}
	
	public void looper() {
		int x = 0;
		
		while( (x = getX() ) != 0 ) {
			
			for (int i = 10; i >= 0 ; i--) {
				x = i;
			}
		}
	}
}

