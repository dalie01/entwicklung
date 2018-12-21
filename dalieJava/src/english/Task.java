package english;

interface Definintion {
	
	String drive = "D:";
	String[] rFolder = {"Documents","Temp","English"};
	String[] tFolder = {"oneDrive","English"};
}

public abstract class Task {

	public static final int NEXT = 1;
	public static final int ERROR = 0;
	
	abstract void execute(Explorer e) throws Exception;
	abstract void execute() throws Exception;
	
	public static int execute(OneDrive oneDrive) throws Exception {
	
		try {
			System.out.println(Explorer.buildSourcePath(new HomePC()) + Explorer.buildTargetPath(new WorkPC()));
			//oneDrive.execute(new Explorer(sFolder,tFolder));
		  
		} catch (Exception e)  {
			
			e.printStackTrace();
			return Task.ERROR;
		}	
		
		return Task.NEXT; 
	}
}
