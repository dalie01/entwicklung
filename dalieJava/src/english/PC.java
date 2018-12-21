package english;

public abstract class PC {
	
	public PCType type;

	public PC(PCType p){
		type = p;
	}
	
	public boolean isWorkPc() {
		return this.type == PCType.Home ? false : true;
	}
	
	public boolean isHomePc() {
		return this.type == PCType.Home ? true : false;
	}
	
}