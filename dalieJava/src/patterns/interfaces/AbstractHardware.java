package patterns.interfaces;
/**
 * AbstractHardware describe properties on hardware
 * */
public abstract class AbstractHardware extends AbstractMyProduct 
	implements Hardware {

	/**default constructor */
	public AbstractHardware(String productSKU) {
		super(productSKU);
	}//AbstractHardware
	
	/** hardware is true */
	@Override
	public boolean isHardware(){
		return true;
	}//isHardware
	
}//class AbstractHardware
