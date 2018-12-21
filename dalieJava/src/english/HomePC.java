package english;

public class HomePC extends Computer implements Folder {
	
	public HomePC() {
		super(PCType.Home);
	}
	private final String sDrive = "D:";
	private final String tDrive = "D:";
	
	private String[] sFolder = {"Hello","World"};
	private String[] tFolder = {"HomePC","HomePC"};
	
	
	
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
