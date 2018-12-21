package dalieOCP.object.nestedClasses.anonymousInnerClasses;

class Pen{
	
	public void aMethod() {
		System.out.println("1");
	}
}


class Lecture {
	
	Pen pen = new Pen() { //Create an anonymous class that extends class Pen.
		
		public void aMethod() { //Override method
			System.out.println("2");
		}
		
	};//End of creation of object referred to by variable pen, marked by semicolon.
}


class Execute {

}
