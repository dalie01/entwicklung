package oracel_OcaSe.O92_Temp.variableScope;

public class VariableScope {

	static String name;
	
	void aMethod(){
		String name = "Jena";
		if ((8 > 2)) {
			name = "Stuttgart";
		}
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		VariableScope vS = new VariableScope();
		try{
			vS.aMethod();
		} finally {
			System.out.println("Here");
		}
		
	}
}
