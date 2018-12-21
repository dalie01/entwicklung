package xmlSAXParser;

import java.io.FileInputStream;
import java.util.Map;

import xmlSAXParser.capi.Product;
import xmlSAXParser.factory.ProductParser;

public class Main {
	
	public static void main(String[] args) {
		String fileName = System.getProperty("user.dir") + "\\xml\\internet.xml";
		try {
			
			ProductParser.parseProducts(new FileInputStream(fileName));
			for (Product product : ProductParser.getProducts()) {
				System.out.println(product.toString());
				System.out.println(product.getAttribute("img_mediumpicture"));
				 
				for( Map.Entry<String, String> entry : product.getCustomAttributes().entrySet() ) {
					
					String key = entry.getKey();
					String value = entry.getValue();
			
					System.out.println(key + "," + value );
					
				} /* for entry */
				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
