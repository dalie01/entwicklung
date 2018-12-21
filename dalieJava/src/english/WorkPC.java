package english;

public class WorkPC extends Computer implements Folder {
	

	private final String sDrive = "D:";
	private final String tDrive = "D:";
	
	private String[] sFolder = {"Hello","World"};
	private String[] tFolder = {"WorkPC","WorkPC"};
	
	
	public WorkPC() {
		super(PCType.Work);
	}
	
	
	
	public String getsDrive() {
		return sDrive;
	}
	
	public String gettDrive() {
		return tDrive;
	}
	
	
	public String[] getsFolder() {
		return sFolder;
	}
	
	public void setsFolder(String[] sFolder) {
		this.sFolder = sFolder;
	}
	
	public String[] gettFolder() {
		return tFolder;
	}
	
	public void settFolder(String[] tFolder) {
		this.tFolder = tFolder;
	}
	
}
