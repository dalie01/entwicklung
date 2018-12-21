package test;

class SuperClass{

	public SuperClass(){
		
	}
	public SuperClass(int m) {
	}
}

class SubClass extends SuperClass {

	int i,k,z;
	SubClass(int i, int k){
		this.i = i;
		this.k = k;
	}
	
	SubClass(int m){
		super(m);
	}
}
