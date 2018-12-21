package database.Utils.internal;

import java.lang.reflect.Constructor;

import database.Utils.release.Release;

public class DbMigrate {

	public static void main(String[] args) throws Exception {
		
		if (args[0] == null || args[0].length() <= 0) throw new Exception();
		
		Class<?> c = Class.forName("database.Utils.release.R" + args[0].replace(".", "_"));
		Constructor<?> cons = c.getConstructor();
		Release r = (Release) cons.newInstance();
		r.executeDbMigrate();
	}
}
