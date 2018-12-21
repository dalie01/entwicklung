package dalieOCP.stingbuilder;

class Execute {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();//No-argument constructor
		StringBuilder sb2 = new StringBuilder(sb1);//accepts a StringBuilder object
		StringBuilder sb3 = new StringBuilder(50);//accepts an int value specifying initial capacity of StringBuilder object
		StringBuilder sb4 = new StringBuilder("INXS");//accepts a String
		
		sb1.append(true);
		sb1.append(10);
		sb1.append('a');
		sb1.append(20.99);
		sb1.append("Hi");
		System.out.println(sb1);//true10a20.99Hi
		
//		sb1.trim() //not possible
//		sb1.delete(0, sb1.length());
		char[] arg1 = {'J', 'a', 'v', 'a', '7'};
		sb1.append(arg1, 1, 3);
		System.out.println(sb1);//true10a20.99Hiava
		
		sb1.delete(0, sb1.length());
		char[] arg2 = {'J', 'a', 'v', 'a', '7'};
//		sb1.insert(1,arg2, 1, 3);//StringIndexOutOfBoundException
		sb1.insert(0,arg2, 1, 3);//StringIndexOutOfBoundException
		System.out.println(sb1);//ava
		
		System.out.println(sb1.deleteCharAt(2));//av
		System.out.println(sb1);
	}
}
