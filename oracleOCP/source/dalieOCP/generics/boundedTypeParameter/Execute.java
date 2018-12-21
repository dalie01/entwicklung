package dalieOCP.generics.boundedTypeParameter;

abstract class Parcel {
	
	abstract double getWeight();
}

class StandardParcel extends Parcel {

	@Override
	double getWeight() {
		return 3.3;
	}
	
}

class AirParcel extends Parcel {

	@Override
	double getWeight() {
		return 5.5;
	}
	
}

class Dispatcher<T extends Parcel> {//bounded type parameter
	/* an bounded type parameter is only 
	 * possible for class, enum or interface  */
	
	T t;
	
	Dispatcher(T t) {
		this.t = t;
	}
	
	public boolean checkWeigth() {
		if(t.getWeight() > 5 ) //it is a constrain for use of Methods
			return true;
		else
			return false;
	}
}


class Execute {
	public static void main(String[] args) {
//		Dispatcher<Parcel> airParcel = new Dispatcher<>(new AirParcel());//Java 8
		Dispatcher<AirParcel> airParcel = new Dispatcher<>(new AirParcel());
		System.out.println(airParcel.checkWeigth());
		
//		Dispatcher<Parcel> standardParcel = new Dispatcher<>(new StandardParcel());//Java 8
		Dispatcher<StandardParcel> standardParcel = new Dispatcher<>(new StandardParcel());
		System.out.println(standardParcel.checkWeigth());
		
	
	}
}
