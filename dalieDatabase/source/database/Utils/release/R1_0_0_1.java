package database.Utils.release;


public class R1_0_0_1 extends Release {

	public R1_0_0_1() {
		super("1.0.0.1");
	}
	
	@Override
	protected Boolean dbMigrate() throws Exception {
		boolean successfully = true;
		System.out.println("dbMigrate" + this.getClass().getName());
		return successfully;
	}

}
