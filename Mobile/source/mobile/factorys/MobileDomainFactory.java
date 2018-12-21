package mobile.factorys;

import java.util.HashMap;
import java.util.Map;

import com.dalie.beehive.domain.capi.Domain;
import com.dalie.beehive.domain.factory.DomainFactory;
import com.dalie.beehive.domain.internal.ApplicationDomain;
import com.dalie.beehive.domain.internal.ProductDomain;

public class MobileDomainFactory extends DomainFactory {

	public static DomainFactory instance;
	
	static {
		instance = new MobileDomainFactory();
	}
	
	public static DomainFactory getInstance(){
		return instance;
	}
	
	public Map<String, Domain> loadDomains(){
		Map<String, Domain> all = new HashMap<String, Domain>();
		all.put("/Mobile", new ApplicationDomain("mobile", "MobileId"));
		all.put("/Product", new ProductDomain("product", "ProductId"));
		return all;
	}
	
	
}
