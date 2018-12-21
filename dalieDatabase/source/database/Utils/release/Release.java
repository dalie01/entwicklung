package database.Utils.release;

public abstract class Release {
	
	public String releaseID;
	
	public Release(String releaseID) {
		this.releaseID = releaseID;
		
	}

	protected abstract Boolean dbMigrate() throws Exception;
	
	public void executeDbMigrate() throws Exception {
		dbMigrate();
	}
}
