package oracel_OcaSe.O9_MockExam.ME_Q05;

class Student{
	int marks = 10;
}

public class Result {
	
	public static void main(String[] args) {
		Student a = new Student();
		
		switch (a.marks) {
			default: System.out.println("100");
			case 10: System.out.println("10");
			case ('c' | 'd'):
			case 98: System.out.println("89");	
		}
		
	}//main
}
