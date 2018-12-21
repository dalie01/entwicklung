package patterns.interfaces;

public class MobileRateplanWrapper extends AbstractRateplan implements MobileRateplan{

	public MobileRateplanWrapper(String productSKU) {
		super(productSKU);
	}//MobilRateplanWrapper

	@Override
	public boolean isMobilRateplan() {
		return true;
	}//isMobilRateplan

	
}//class MobilRateplanWrapper
