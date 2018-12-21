package database.Utils.capi;

import database.Database;
import database.Utils.release.Release;

public interface Migrate {

	boolean executeDbMigrate(Database db, Release relase);
}
