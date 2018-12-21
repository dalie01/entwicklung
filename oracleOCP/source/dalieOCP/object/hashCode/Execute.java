package dalieOCP.object.hashCode;

class A {
	
	int i;

	@Override
	public boolean equals(Object obj) {
		A a = (A) obj;
		if (this.i != a.i)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.i;
		return result;
	}

	
	
}

class Execute {
	
	public static void main(String[] args) {
		/*
		 * Rule: If the equals() method returns true, then hashCode() 
		 * for both the objects must return the same value.
		 * */
	}
}
