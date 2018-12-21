package patterns.interfaces;

/** MyProduct an interface to describe my own attribute */
public interface MyProduct {

	/** references to MediumPictuer */
	public abstract String getMediumPictuer();
	/** references to MiniPictuer */
	public abstract String getMiniPictuer();
	/** is product a hardware */
	public boolean isHardware();
	/** is product a rateplan */
	public boolean isRateplan();

}//interface MyProduct
