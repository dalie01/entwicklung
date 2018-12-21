package dalieOCP.exception.multipleResources;

class One implements AutoCloseable {
	public void close() {
		System.out.println("Close one");
	}
}

class Two implements AutoCloseable {
	public void close() {
		System.out.println("Close two");
	}
}


/*
 * remember that try-with-resources is part of try block,
 * and 
 * resources are cleaned up in reverse order.
 * 
 * */
class Execute_I {

	public static void main(String[] args) {
		
		try (One one = new One(); Two two = new Two()) {
			System.out.println("from try");
			
			throw new RuntimeException();
			
		} catch (Exception e) {
			System.out.println("from catch");
			
		} finally {// is executed after try-with-resources closes the objects.
			System.out.println("from finally");
		}
		
	}
}
