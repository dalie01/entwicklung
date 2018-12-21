package com.dalie.beehive.domain.model;

import com.dalie.beehive.domain.capi.Domain;

public abstract class DomainRef implements Domain {


	private String name;
	private String Id;
	
	public DomainRef(String name, String Id){
		this.name = name;
		this.Id = Id;
	} /* DomainRef */

	/**
	 * Get Domain Name.
	 * @return name of Domain
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set Domain Name.
	 * @param name to Domain
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Get Domain Id.
	 * @return id of Domain.
	 */
	public String getId() {
		return Id;
	}

	/**
	 * Set Domain Id.
	 * @param id to Domain.
	 */
	public void setId(String id) {
		Id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DomainRef other = (DomainRef) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
} /* DomainRef */
