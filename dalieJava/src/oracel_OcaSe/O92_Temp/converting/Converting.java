package oracel_OcaSe.O92_Temp.converting;

class Converter {
	
	void iMethode(Integer c){
		System.out.println("I" + c);
	}
	
	void iMethode(int c){
		System.out.println("i" + c);
	}
	
//	void cMethode(Character c){
//		System.out.println("C" + c);
//	}
	
	void cMethode(char c){
		System.out.println("c" + c);
	}
	
	void lMethode(long... arr){
		System.out.println(arr[0] + "" + arr);
	}
}


public class Converting {
	
	
	public static void main(String[] args) {
		Converter c = new Converter();
		Character a = '1';
		c.cMethode(a);
		
		Integer i = 10;
		c.iMethode(i);

		long arr[] = {0l};
		c.lMethode(arr);
		
	}

}
