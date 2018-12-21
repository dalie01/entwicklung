package com.dalie.beehive.domain.internal;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dalie.beehive.configuration.factory.ProjectFactory;
import com.dalie.beehive.domain.capi.Domain;
import com.dalie.beehive.domain.model.DomainConfigurationRef;

public class ConfigurationDomain extends DomainConfigurationRef implements Domain {

	public final static List<Path> domainIds;
	public final static Map<String,ConfigurationDomain> domains;
	static  {
		domainIds = loadDomainIds();
		domains = loadConfigurationDomains();
	}
	/**
	 * @param name
	 * @param Id
	 * @param pfad
	 * @param fName
	 */
	public ConfigurationDomain(String name, String Id, String pfad, String fName) {
		super(name, Id, pfad, fName);
	}

	@Override
	public boolean isApplicationDomain() {
		return false;
	}

	@Override
	public boolean isProductDomain() {
		return false;
	}

	@Override
	public boolean isConfigurationDomain() {
		return true;
	}

	private static List<Path> loadDomainIds()  {
		List<Path> domainIds = null;
		try {
			domainIds = ProjectFactory.listDomains(Paths.get(ProjectFactory.getRoot().toString(),"share","system","config","domain"), 
					Paths.get(ProjectFactory.getRoot().toString(),"share","system","config","domain"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return domainIds;
	}
	
	private static Map<String, ConfigurationDomain> loadConfigurationDomains(){
		Map<String,ConfigurationDomain> domains = new HashMap<String,ConfigurationDomain>();
		for(Path domainId : domainIds) {
			domains.put(domainId.getFileName().toString(), new ConfigurationDomain(domainId.getFileName().toString(), domainId.getFileName().toString(), domainId.toString(), domainId.getFileName().toString()));
			}
			
		return domains;
	}
}
