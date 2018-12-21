package xmlSAXParser.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import xmlSAXParser.capi.Product;
import xmlSAXParser.internal.ProductImpl;


/**
 * Class ProductParser read XMLFile,
 * and determined contend by defined TAGs.  
 * <br><br>
 * XML parsing using SAXParser.
 * 
 * @author DV0101
 *
 */
public class ProductParser extends DefaultHandler {
	
	private static final String TAG_IMMEWEB = "immeweb";
	private static final String TAG_PRODUCT = "product";
	private static final String TAG_NAME = "name";
	private static final String TAG_ONLINE = "online";
	private static final String TAG_DESCRIPTION = "description";
	private static final String TAG_SHORT_DESCRIPTION = "short-description";
	private static final String TAG_CUSTOM_ATTRIBUTES = "custom-attributes";
	private static final String TAG_CUSTOM_ATTRIBUTE = "custom-attribute";
	
	private static final String ATTR_SKU = "sku";
	private static final String ATTR_NAME = "name";
	private static final String ATTR_XML_LANG = "xml:lang";
	private static final String ATTR_DT_DT = "dt:dt";
	
	
	/** contains all parsed Product elements */
	private static  List<Product> products;
	/** to hold all parsed CustomAttriubetes */
	private Map<String,String> customAttributes;
	
	private String characters;
	private String attribute;
	private Product product;
	
	/**
     * ProductParser.
     **/
	private ProductParser() {
	}
	
	/**
	 * Determine content of file.
	 * 
	 * @param inputStream FileInputStream for xmlDatei	  
	 * @throws IOException 
	 * @throws ParserConfigurationException 
	 * @throws SAXException 
	 * */
	public static void parseProducts(final InputStream inputStream) 
			throws IOException, ParserConfigurationException, SAXException {
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		ProductParser handler = new ProductParser();
		
		SAXParser parser = factory.newSAXParser();

        parser.parse(inputStream, handler);
	}
	
	
	/* 
	 * (non-Javadoc)
	 * @see org.xml.sax.helpers.DefaultHandler#characters(char[], int, int)
	 */
	@Override
    public void characters(char[] ch, int start, int length) 
    		throws SAXException {
        
		String newContent = new String(ch, start, length);
        
        if (characters == null) {
            characters = newContent;
        } else {
            characters += newContent;
        }

    }
	
	/* 
	 * (non-Javadoc)
	 * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String, 
	 * java.lang.String, java.lang.String, org.xml.sax.Attributes)
	 */
	@Override
    public void startElement(String uri, String localName, String name,
            Attributes attributes) throws SAXException {
		
		if (name.equals(TAG_IMMEWEB)) {
            onInitProducts();
		} else if (name.equals(TAG_PRODUCT)) {
            onInitProduct(attributes);
        } else if (name.equals(TAG_CUSTOM_ATTRIBUTES)) {
            onInitAttributes();
        } else if (name.equals(TAG_CUSTOM_ATTRIBUTE)) {
            onCustomAttribute(attributes);
        }
    }
	
	/* 
	 * (non-Javadoc)
	 * @see org.xml.sax.helpers.DefaultHandler#endElement(java.lang.String, 
	 * java.lang.String, java.lang.String)
	 */
	@Override
    public void endElement(String uri, String localName, String name)
            throws SAXException {

        if (name.equals(TAG_PRODUCT)) {
            onReadyProduct();
        } else if (name.equals(TAG_NAME)) {
            product.setName(getCharactersTrimed());
        } else if (name.equals(TAG_ONLINE)) {
        	product.setOnline(getCharactersTrimed());
        } else if (name.equals(TAG_DESCRIPTION)) {
        	product.setDescription(getCharactersTrimed());
        } else if (name.equals(TAG_SHORT_DESCRIPTION)) {
        	product.setShortDescription(getCharactersTrimed());
        } else if (name.equals(TAG_CUSTOM_ATTRIBUTE)) {
        	customAttributes.put(attribute, getCharactersTrimed());
        } else if (name.equals(TAG_PRODUCT)) {
            onReadyProduct();
        } 
        /* reset element content */
        characters = null;

    }
	
	/**
	 * Get Reference of List<Product>.
	 */
	private void onInitProducts() {

		products = new ArrayList<Product>();
	}
	
    /**
     * Get Reference Product.
     *  
     * @param attributes based on xml content.
     */
    private void onInitProduct(Attributes attributes) {

        String sku = attributes.getValue(ATTR_SKU);
        product = new ProductImpl();
        product.setSku(sku);
    }
	
    /**
     * Set Map<Sting,String> customAttriubtes Product
     * and add Product to List<Product> products.
     */
    private void onReadyProduct() {

    	product.setCustomAttributes(customAttributes);
        products.add(product);
    }
    
    /**
     * Get Object Reference 
     * 	Map<Sting,String> customAttributes. 
     */
    private void onInitAttributes() {
    	
    	customAttributes = new HashMap<String, String>();
    }
    
    /**
     * Determine Key-Value for 
     * 	Map<String,String> customAttributes. 
     * 
     * @param attributes to set KeyValue
     */
    private void onCustomAttribute (Attributes attributes) {
    	
        attribute = attributes.getValue(ATTR_NAME);    
    }
    
    /**
     * Null is not allowed.
     * 
     * @return String no blanks contained
     */
    private String getCharactersTrimed() {
    	
        return characters == null ? null : characters.trim();
    }

	/**
	 * Get List of all Products based on result
	 * of parsing.
	 *  
	 * @return List<Product> all parsed Products.
	 */
	public static List<Product> getProducts() {
		
		return products;
	}
    
}
