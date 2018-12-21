package dalieOCP.generics._pratice;


abstract class Table {
	
	public void getData() {}
	public void insertData() {}
	public void createTable() {}
	public abstract void executeDbMigrate();
	public abstract void executeDbInit();
}

class Addresses extends Table{
	
	public void executeDbMigrate() {
		System.out.println("A.Migrate");
		
	}
	public void executeDbInit() {
		System.out.println("A.dbInit");
		
	}

}

class Language extends Table {
	
	public void executeDbMigrate() {
		System.out.println("L.Migrate");
	}
	
	public void executeDbInit() {
		System.out.println("L.dbInit");
	}
}

abstract class DB {
	
	public static synchronized <T extends Table> void dbMigrate(T t) {
		t.executeDbMigrate();
	}
	
	public static synchronized <T extends Table> void dbInit(T t) {
		t.executeDbInit();
	}
}

final class P04 {

	public static void main(String[] args) {
		
		DB.dbMigrate(new Addresses());
		DB.dbInit(new Addresses());
		DB.dbMigrate(new Language());
	}
}
