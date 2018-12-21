package dalieOCP.flowControl.switchStatement;

/*
 * switch
 * type of Switch char,byte,short,int and String
 *  also enum,Character,Byte,Integer and Short
 * 
 * */

class Execute {

	public static void main(String[] args) {
		String s1 = args[0];
		switch(s1){
		
			case "first" : System.out.println("frist"); 
			break;
			
			default : System.out.println("default");
		}
	}
}
