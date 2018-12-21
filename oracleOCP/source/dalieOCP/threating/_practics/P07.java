package dalieOCP.threating._practics;

final class P07 {

	private Object object = null;
    private volatile boolean hasNewObject = false;

    public void put(Object newObject) {
        while(hasNewObject) {
            //wait - do not overwrite existing new object
        }
        object = newObject;
        hasNewObject = true; //volatile write
    }

    public Object take(){
        while(!hasNewObject){ //volatile read
            //wait - don't take old object (or null)
        }
        Object obj = object;
        hasNewObject = false; //volatile write
        return obj;
    }
    
    /*
     * Thread A may be putting objects from time to time by calling put(). 
     * Thread B may take objects from time to time by calling take(). 
     * This P07 can work just fine using a volatile variable 
     * (without the use of synchronized blocks), as long as only Thread A calls put() 
     * and only Thread B calls take(). 
     * */
    public static void main(String[] args) {
    	P07 p07 = new P07();
		new P07A(p07).start(); 
		new P07B(p07).start(); 
	}
}

final class P07A extends Thread {
	private P07 p07;
	
	P07A(P07 p07){
		this.p07 = p07;
	}
	public void run() {
		p07.put(new Object());
	}
}

final class P07B extends Thread {
	private P07 p07;
	
	P07B(P07 p07){
		this.p07 = p07;
	}
	public void run() {
		System.out.println(p07.take());
	}
}