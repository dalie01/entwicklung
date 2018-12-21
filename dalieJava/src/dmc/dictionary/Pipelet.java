package dmc.dictionary;

public interface Pipelet {

	//public java.util.Dictionary<Object, Object> dict = new Hashtable<Object, Object>();;
	
	public abstract void execute(java.util.Dictionary<Object, Object> dict);

	public abstract void init();
}//class Dictionary
