package dalieOCP.threating.immutalObjects;

import java.util.Calendar;
import java.util.Date;

final class A {//no extends possible
	
	/* 
	 * remember you can’t reassign a value to a final reference variable,
	 * but you can modify its value if its methods allow you to.
	 * */
	private final Date birth;
	
	private String demo; //Immutable object it never leads to inconsistent memory
	
	public A(Date dob) {
		birth = dob;
		demo = "Hello World";
	}
	
	Runnable r = new Runnable() {
		
		public void run() {
			aMethod();
		}
	};
	
	void aMethod() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(birth);
		cal.add(Calendar.MONTH, 1);
		birth.setTime(cal.getTime().getTime());//modify is allowed for final
	}
	
	final public Date getBirthDate() {//never can be overridden
		return birth;
	}
	
	public String getDemo() {
		return demo;
	}
}

class Execute {

	public static void main(String[] args) throws InterruptedException {
		A a = new A(new Date());
		Thread t1 = new Thread(a.r);
		Thread t2 = new Thread(a.r);
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		
		System.out.println(a.getBirthDate());
	}
}
