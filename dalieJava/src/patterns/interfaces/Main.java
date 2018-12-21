package patterns.interfaces;

public class Main {

	public static void main(String[] args) {
		ProductFactory pf = ProductFactoryImpl.getInstance();
		MyProduct rateplan = pf.getProduct("R");
		System.out.println(rateplan.isRateplan());
		System.out.println(rateplan.getMiniPictuer());
		
		MyProduct mobile = pf.getProduct("M");
		System.out.println(mobile.isHardware());
		Mobile handy = (Mobile) mobile;
		System.out.println(handy.isMobile() +";"+ handy.isHardware());
		System.out.println(mobile.getMediumPictuer());
		
		MyProduct product = pf.getProduct();
		System.out.println(product.getMediumPictuer());
		
		MyProduct htc = pf.getProductAsMobile("C");
		System.out.println(htc.isHardware());
		System.out.println(htc.isRateplan());
		
		Hardware hw = (Hardware) htc; 
		System.out.println(hw.isHardware());
	}//main
}//class Main
