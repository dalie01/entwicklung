package dalieOCP.threating._practics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class P06 {
		/*
		 * It MAY print [a, b, c]. okay
		 * It MAY print [a, c,  b]. not okay
		 * It will NEVER print [a, c,  b]. okay
		 * */
	   static boolean sorted = false;
	    public static void main(String[] args) {
	    	String[] argum = new String[] {"a","c","b"};
	        
	    	new P06A(argum).start(); //1
	    	
	        synchronized(argum) {
	            try {
	                while(!sorted){
	                  argum.wait();
	               }
	            } catch (InterruptedException e) {
	            }
	            List<String> m = Arrays.asList(argum);
	            System.out.println(m);
	        }
	    }

	
}


class P06A extends Thread {

    String[] args;

    P06A(String[] sa) {
        args = sa;
    }

    public void run() {
        synchronized (args) {
            List<String> m = Arrays.asList(args);
            Collections.sort(m);
            P06.sorted = true;
            args.notifyAll();
        }
    }
}
