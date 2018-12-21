package dmc.pipelet;



public abstract class Pipelet {

	public static final int PIPELET_NEXT = 1;
	public static final int PIPELET_ERROR = 2;

	public abstract int execute(PipelineDictionary paramPipelineDictionary)
			throws PipeletExecutionException;
}
