package dalieOCP.operator.shortCircuit;

public class Execute {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Evaluate 0 == 1, discovering that is false
		// The condition (0 == 1 && whatever) has to be false, because 0 == 1 is false. 
		// Remember, the && operator wants both conditions, on its left and right sides, to be true. 
        if (0 == 1 && 2 + 2 == 4) { 
            System.out.println("This line won't be printed."); 
        } 
        
        //Realize that the condition (2 + 2 == 4 || whatever) must be true no matter what the whatever condition happens to be.   
        if (2 + 2 == 4 || 0 == 1) { 
            System.out.println("This line will be printed."); 
        } 
        
        //while | and & will always let all parts evaluates
        int x = 2, y = 1, z = 4;
        if (0 == 1 | x + ++y == z) { 
            System.out.println("UD001 x is " + x + " y is " + y ); 
        }
        
        System.out.println("UD002 x is " + x + " y is " + y + " z is " + z ); 
        
        int x1 = 2, x2 = 3, x3 = 2;
        if(++x1 == x2 | ++x3 == 3)
        	System.out.println(x1 + ";" + x2 + ";" + x3);
	}

}
