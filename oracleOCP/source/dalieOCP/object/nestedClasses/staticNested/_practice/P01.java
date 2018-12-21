package dalieOCP.object.nestedClasses.staticNested._practice;


class DB {
	public static final int MySQL = 0;
	public static final int DB400 = 1;
	
	class Connection {
		int type;
		
		Connection(Integer i){
			type = i;
		}
		
	};
	
	Connection con; 
	
	DB(){
		con = getConnection(MySQL);
	}
	
	DB(Integer i){
		con = getConnection(i);
	}
	
	private Connection getConnection(Integer dbType) {
		
		Connection f = null;
		
		f = Factory.getConnection(dbType);
		
		if(f == null)
			f = Factory.getDefaultConnection();
		
		return f;
	}
	
	static class Factory {
		static Connection[] cTypes; 
		
		static {
			cTypes = new Connection[2];
			cTypes[0] = new DB().new Connection(DB.MySQL); 
			cTypes[1] = new DB().new Connection(DB.DB400); 
		}
		
		static Connection getDefaultConnection() {
			return cTypes[0];
		}
		
		static Connection getConnection(int i) {
			return cTypes[i];
		}
	}
}


final class P01 {

	public static void main(String[] args) {
		DB mySql = new DB(DB.MySQL);
		DB as400 = new DB(DB.DB400);
		
		System.out.println(mySql.con.type);
		System.out.println(as400.con.type);
		System.out.println(DB.Factory.getDefaultConnection().type);
	}
}
