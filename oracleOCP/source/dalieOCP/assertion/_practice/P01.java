package dalieOCP.assertion._practice;

final class P01 {

	private void aMethod(int res) { 
        assert res > 0 : aMethod1(); 
        System.out.println(res);

        assert res > 5 : aMethod2();
        System.out.println(res);
        
    } 

    private String aMethod1() { 
        return "Jena"; 
    } 

    private Object aMethod2() {
    	return new Object();
    	
    }
    public static void main(String[] args) { 
        P01 p = new P01(); 
        p.aMethod(Integer.valueOf("1")); 
    } 


}
