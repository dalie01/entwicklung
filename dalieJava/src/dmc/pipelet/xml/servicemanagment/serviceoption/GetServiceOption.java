package dmc.pipelet.xml.servicemanagment.serviceoption;



import dmc.pipelet.Pipelet;
import dmc.pipelet.PipeletExecutionException;
import dmc.pipelet.PipelineDictionary;

public class GetServiceOption extends Pipelet {

	@Override
	public int execute(PipelineDictionary paramPipelineDictionary)
			throws PipeletExecutionException {

		
		return PIPELET_NEXT;
	}

	
	public void init() {
		System.out.println("INIT: " + this.getClass().getName());
	} /* init */

}
