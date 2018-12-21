package patterns.interfaces;

public class MobileWrapper extends AbstractHardware implements Mobile {

	public MobileWrapper(String productSKU) {
		super(productSKU);
	}//

	@Override
	public boolean isMobile() {
		return true;
	}//isMobil

}//classMobilWrapper
