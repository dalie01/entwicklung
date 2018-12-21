package patterns.interfaces;

public class AbstractRateplan extends AbstractMyProduct implements Rateplan {

	public AbstractRateplan(String productSKU) {
		super(productSKU);
	}//AbstractRateplan

	@Override
	public boolean isRateplan() {
		return true;
	}//isRateplan


}//class AbstractRateplan
