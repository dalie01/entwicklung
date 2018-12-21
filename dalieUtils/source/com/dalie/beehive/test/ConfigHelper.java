package com.dalie.beehive.test;

import java.io.IOException;

import org.apache.commons.configuration.ConfigurationException;

import com.dalie.beehive.configuration.capi.Configurations;
import com.dalie.beehive.configuration.internal.Configuration;

public class ConfigHelper {
	
	public static void main(String[] args) throws ConfigurationException, IOException {
	
		
		System.out.println(Configuration.APPLICATION.getString("dbHost"));
		System.out.println(Configuration.APPLICATION.getString("user"));
		Configurations config = Configuration.APPLICATION;
		System.out.println(config.getString("database"));
		System.out.println(Configuration.APPLICATION.getString("database"));
		System.out.println(Configuration.DOMAIN.getString("test.hello", "dalieweb"));
		System.out.println(Configuration.DOMAIN.getString("test", "dalieweb"));
		for(Object s : Configuration.DOMAIN.getListConfiguration("list", "dalieweb")) {
			System.out.println((String)s);
		}
	}
}
