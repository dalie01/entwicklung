package dalieOCP.exception._practice;

final class P02 {

	private P02(Object obj) {
        if (obj == null)
             throw new IllegalArgumentException("Provide an object!");
        System.out.println(obj + " created!");
   }
   public static void createObject(Object obj) {
        try {
             P02 objFactory = new P02(obj);
//        } catch (Exception e){
//        	System.out.println(e);
        } finally {
             System.out.println("The object might be created.");
        }
   }
   public static void main(String[] args) {
        createObject(null);
   }
}
