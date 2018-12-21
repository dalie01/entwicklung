package dalieOCP.object.relationship.coupling;

interface I {
	void aMethod();
	String getNameId();
}

class A implements I { //class A and B as are loosely coupled -> by using interface public methods 
	public void aMethod() {}
	
	public String getNameId() {return "";}
}
class B implements I {
	String name; //change of Attribute has no effect of classes access
	
	public void aMethod() {}	
	public String getNameId() {return name;}
}


class Execute {

}
