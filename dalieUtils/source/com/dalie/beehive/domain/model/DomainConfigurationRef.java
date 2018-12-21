package com.dalie.beehive.domain.model;

public abstract class DomainConfigurationRef extends DomainRef {

	private String pfad;
	private String fName;
	
	public DomainConfigurationRef(String name, String Id, String pfad, String fName){
		this(name, Id);
		this.pfad = pfad;
		this.fName = fName;
	}
	
	private DomainConfigurationRef(String name, String Id) {
		super(name, Id);
	}

	public String getPfad() {
		return pfad;
	}

	public String getfName() {
		return fName;
	}

}
