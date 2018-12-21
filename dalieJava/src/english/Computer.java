package english;

public class Computer extends PC {

	public Computer(PCType p) {
		super(p);
	}

	public static Folder getPC(PC pc) {
		Folder f = null;
		switch (pc.type) {
		case Home:
			 f = new HomePC();
			break;
		case Work:	
			f = new WorkPC();
			break;
		}
		return f;
	}
	
	public static Computer getPC(PCType type) {
		Computer c = null;
		switch (type) {
		case Home:
			 c = new HomePC();
			break;
		case Work:	
			c = new WorkPC();
			break;
		}
		return c;
	}
}
