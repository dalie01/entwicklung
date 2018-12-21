package com.dalie.beehive.configuration.internal;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.SystemConfiguration;

import com.dalie.beehive.configuration.capi.Configurations;
import com.dalie.beehive.configuration.factory.ProjectFactory;
import com.dalie.beehive.domain.internal.ConfigurationDomain;

public enum Configuration implements Configurations {
	
	DOMAIN {
		
		@Override
		public String getString(String key, String id) {
			String s = domain_environment.get(id).getString(key);
			return s != null && s.length() > 0 ? s : domain.get(id).getString(key);
		}
		
		@Override
		public String getString(String key) {
			return null;
		}

		@Override
		public Boolean getBooleanConfiguration(String key, String id) {
			Boolean b = domain_environment.get(id).containsKey(key);
			return b ? domain_environment.get(id).getBoolean(key) : domain.get(id).getBoolean(key);
		}

		@Override
		public Boolean getBooleanConfiguration(String key) {
			return false;
		}

		@Override
		public List<?> getListConfiguration(String key, String id) {
			List<?> l = domain_environment.get(id).getList(key);
			return l != null && l.size() > 0 ? l : domain.get(id).getList(key);			
		}
		
		@Override
		public List<?> getListConfiguration(String key) {
			return null;			
		}
	},
	APPLICATION {
		
		@Override
		public String getString(String key, String id) {
			return null;
		}
		
		@Override
		public String getString(String paramString) {
			String s = Configuration.application_environment.getString(paramString);
			return s != null && s.length() > 0 ? s :  Configuration.application.getString(paramString) ;
		}

		@Override
		public Boolean getBooleanConfiguration(String key, String id) {
			return null;
		}

		@Override
		public Boolean getBooleanConfiguration(String key) {
			Boolean s = Configuration.application_environment.containsKey(key);
			return s ? Configuration.application_environment.getBoolean(key) : Configuration.application.getBoolean(key);
		}

		@Override
		public List<?> getListConfiguration(String key, String id) {
			return null;			

		}

		@Override
		public List<?> getListConfiguration(String key) {
			List<?> s = Configuration.application_environment.getList(key);
			return s != null && !s.isEmpty() ? s : Configuration.application.getList(key);
		}
		
		
	};

	static PropertiesConfiguration env; 
	static Map<String, CompositeConfiguration> domain;
	static Map<String, CompositeConfiguration> domain_environment;
	static CompositeConfiguration application;
	static CompositeConfiguration application_environment;	
	
	static {
		try {
			env = new PropertiesConfiguration(
					Paths.get(ProjectFactory.getRoot().toString(),"share","system","config","cluster","enviroment.properties").toFile());
			
			domain =  loadDomainConfigurations();
			domain_environment =  loadDomainConfigurations(env);
			application = new CompositeConfiguration();
			application_environment = new CompositeConfiguration();
			
			loadApplicationProperties();
			
		} catch ( IOException |ConfigurationException e) {
			e.printStackTrace();
		}
	}
	
	private static void loadApplicationProperties() throws IOException, ConfigurationException {
		application.addConfiguration(new SystemConfiguration());
		application.addConfiguration(env);
			
			/* configuration by default */
			List<Path> configs = 
					ProjectFactory.listFiles(
							Paths.get(ProjectFactory.getRoot().toString(),"share","system","config","cluster"), "configuration.properties");
			for(Path p : configs) {
				application.addConfiguration(new PropertiesConfiguration(p.toFile()));
			}
			configs = ProjectFactory.listFiles(
							Paths.get(ProjectFactory.getRoot().toString(),"share","system","config","cluster"), "configuration_" + env.getString("environment") + ".properties");
			
			/* configuration by environment */
			for(Path p : configs) {
				application_environment.addConfiguration(new PropertiesConfiguration(p.toFile()));
			}

	}
	
	private static Map<String, CompositeConfiguration> loadDomainConfigurations() throws IOException, ConfigurationException {
		Map<String, CompositeConfiguration> temp = new HashMap<String, CompositeConfiguration>();
		
		for(Entry<String, ConfigurationDomain> domain : ConfigurationDomain.domains.entrySet()) {
	
			List<Path> configs = 
					ProjectFactory.listFiles(
							Paths.get(ProjectFactory.getRoot().toString(),"share","system","config","domain",domain.getValue().getfName()), "configuration.properties");
			for(Path p : configs) {
				temp.put(domain.getKey(), new CompositeConfiguration(new PropertiesConfiguration(p.toFile())));
			}
			
			
		}
		return temp; 
	}
	
	
	private static Map<String, CompositeConfiguration> loadDomainConfigurations(PropertiesConfiguration env) throws IOException, ConfigurationException {
		Map<String, CompositeConfiguration> temp = new HashMap<String, CompositeConfiguration>();
		
		for(Entry<String, ConfigurationDomain> domain : ConfigurationDomain.domains.entrySet()) {
	
			List<Path> configs = 
					ProjectFactory.listFiles(
							Paths.get(ProjectFactory.getRoot().toString(),"share","system","config","domain",domain.getValue().getfName()), "configuration_" + env.getString("environment") + ".properties");
			for(Path p : configs) {
				temp.put(domain.getKey(), new CompositeConfiguration(new PropertiesConfiguration(p.toFile())));
			}
			
			
		}
		return temp; 
	}
}
